package com.proyecto.tfg.Api;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.tfg.Dto.In.CategoriaIn;
import com.proyecto.tfg.Dto.In.PerfilIn;
import com.proyecto.tfg.Dto.In.ProductoFilterIdsIn;
import com.proyecto.tfg.Dto.In.ProductoFilterIn;
import com.proyecto.tfg.Dto.In.ProductoIn;
import com.proyecto.tfg.Dto.In.SubcategoriaFilterIn;
import com.proyecto.tfg.Dto.In.SubcategoriaIn;
import com.proyecto.tfg.Dto.In.UsuarioIn;
import com.proyecto.tfg.Dto.In.UsuarioLoginIn;
import com.proyecto.tfg.Dto.In.VentaFilterIn;
import com.proyecto.tfg.Dto.In.VentaIn;
import com.proyecto.tfg.Dto.Out.CategoriaOut;
import com.proyecto.tfg.Dto.Out.PerfilOut;
import com.proyecto.tfg.Dto.Out.ProductoOut;
import com.proyecto.tfg.Dto.Out.SubcategoriaOut;
import com.proyecto.tfg.Dto.Out.UsuarioLoginOut;
import com.proyecto.tfg.Dto.Out.UsuarioOut;
import com.proyecto.tfg.Dto.Out.VentaOut;
import com.proyecto.tfg.Dto.Out.VentaProductoOut;
import com.proyecto.tfg.Entity.Categoria;
import com.proyecto.tfg.Entity.Perfil;
import com.proyecto.tfg.Entity.Producto;
import com.proyecto.tfg.Entity.Subcategoria;
import com.proyecto.tfg.Entity.Usuario;
import com.proyecto.tfg.Service.PlantLoveService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {     			// Permite solicitudes desde React
	"http://localhost:5173", 				// URL local
	"https://tfg-front-seven.vercel.app/"	// URL servidor
}) 
public class PlantLoveRestController {

	@Autowired
	PlantLoveService PLService;
	
//	-------------------------------------PERFIL--------------------------------------
    
	@GetMapping("/perfil/listar")
	@Transactional(readOnly = true)
	public Iterable<Perfil> findAllPerfil(){
		return PLService.findAllPerfil();
	}
	
	@GetMapping("/perfil/listarActivos")
	@Transactional(readOnly = true)
	public Iterable<PerfilOut> findAllPerfilActivo(){
		return PLService.findAllPerfilActivo();
	}

	@GetMapping("/perfil/{id}")
	@Transactional(readOnly = true)
	public Perfil findPerfilById(@PathVariable Long id){
		return PLService.findPerfilById(id);
	}
	
	@DeleteMapping("/perfil/delete/{id}")
	@Transactional
	public void deletePerfilById(@PathVariable Long id) {
		PLService.deletePerfilById(id);
	}
	
	@PostMapping("/perfil/add")
	public void addPerfil(@RequestBody PerfilIn perfilIn) throws ServerException {
		if(perfilIn.getId() != 0) {
			throw new ServerException("Al crear un perfil no se puede indicar un (id) ya que la BD ya lo gestiona");
		}
		PLService.UpdatePerfil(null, perfilIn); 
	}
	
	@PutMapping("/perfil/update")
	@Transactional
	public void updatePerfil(@RequestBody PerfilIn perfilIn) throws ServerException {
		if(perfilIn.getId() == null) {
			throw new ServerException("Al editar un perfil es obligatorio indicar un (id) distinto de NULL ");
		}
		else if(perfilIn.getId() == 0) {
			throw new ServerException("Al editar un perfil es necesario indicar un (id) valido");
		}
		Perfil perfilExistente = PLService.findPerfilById(perfilIn.getId());
		if(perfilExistente == null) {
			throw new ServerException("El (Id) recibido no corresponde a ninguna Perfil");
		}
		PLService.UpdatePerfil(perfilExistente, perfilIn);
	}
	
	@PutMapping("/perfil/onoff/{id}")
	@Transactional
	public void onOffPerfilById(@PathVariable Long id) throws ServerException {
		PLService.OnOffPerfil(id);
	}
	
//	-------------------------------------LOGIN--------------------------------------
	
    @PostMapping("/usuario/login")
    public UsuarioLoginOut login(@RequestBody UsuarioLoginIn user) {
    	UsuarioLoginOut usuarioValido = PLService.validarLogin(user.getUsuario(), user.getClave());
        if (usuarioValido == null) {
            return new UsuarioLoginOut(); // Esto devolverá un JSON con todos los campos = NULL
        }
        return usuarioValido;
    }
	
//	-------------------------------------USUARIO--------------------------------------
    
	@GetMapping("/usuario/listar")
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAllUsuario(){
		return PLService.findAllUsuario();
	}
	
	@GetMapping("/usuario/listarActivos")
	@Transactional(readOnly = true)
	public Iterable<UsuarioOut> findAllUsuarioActivo(){
		return PLService.findAllUsuarioActivo();
	}

	@GetMapping("/usuario/{id}")
	@Transactional(readOnly = true)
	public Usuario findUsuarioById(@PathVariable Long id){
		return PLService.findUsuarioById(id);
	}
	
	@DeleteMapping("/usuario/delete/{id}")
	@Transactional
	public void deleteUsuarioById(@PathVariable Long id) {
		PLService.deleteUsuarioById(id);
	}
	
	@PostMapping("/usuario/add")
	public void addUsuario(@RequestBody UsuarioIn usuarioIn) throws ServerException {
		if(usuarioIn.getId() != 0) {
			throw new ServerException("Al crear un usuario no se puede indicar un (id) ya que la BD ya lo gestiona");
		}
		PLService.UpdateUsuario(null, usuarioIn); 
	}
	
	@PutMapping("/usuario/update")
	@Transactional
	public void updateUsuario(@RequestBody UsuarioIn usuarioIn) throws ServerException {
		if(usuarioIn.getId() == null) {
			throw new ServerException("Al editar un usuario es obligatorio indicar un (id) distinto de NULL ");
		}
		else if(usuarioIn.getId() == 0) {
			throw new ServerException("Al editar un usuario es necesario indicar un (id) valido");
		}
		Usuario usuarioExistente = PLService.findUsuarioById(usuarioIn.getId());
		if(usuarioExistente == null) {
			throw new ServerException("El (Id) recibido no corresponde a ningún Usuario");
		}
		PLService.UpdateUsuario(usuarioExistente, usuarioIn);
	}
	
	@PutMapping("/usuario/onoff/{id}")
	@Transactional
	public void onOffUsuarioById(@PathVariable Long id) throws ServerException {
		PLService.OnOffUsuario(id);
	}
    
//	-------------------------------------CATEGORIA--------------------------------------
    
	@GetMapping("/categoria/listar")
	@Transactional(readOnly = true)
	public Iterable<Categoria> findAllCategoria(){
		return PLService.findAllCategoria();
	}
	
	@GetMapping("/categoria/listarActivos")
	@Transactional(readOnly = true)
	public Iterable<CategoriaOut> findAllCategoriaActivo(){
		return PLService.findAllCategoriaActivo();
	}

	@GetMapping("/categoria/{id}")
	@Transactional(readOnly = true)
	public Categoria findCategoriaById(@PathVariable Long id){
		return PLService.findCategoriaById(id);
	}
	
	@DeleteMapping("/categoria/delete/{id}")
	@Transactional
	public void deleteCategoriaById(@PathVariable Long id) {
		PLService.deleteCategoriaById(id);
	}
	
	@PostMapping("/categoria/add")
	public void addCategoria(@RequestBody CategoriaIn categoriaIn) throws ServerException {
		if(categoriaIn.getId() != 0) {
			throw new ServerException("Al crear una categoria no se puede indicar un (id) ya que la BD ya lo gestiona");
		}
		PLService.UpdateCategoria(null, categoriaIn); 
	}
	
	@PutMapping("/categoria/update")
	@Transactional
	public void updateCategoria(@RequestBody CategoriaIn categoriaIn) throws ServerException {
		if(categoriaIn.getId() == null) {
			throw new ServerException("Al editar una categoria es obligatorio indicar un (id) distinto de NULL ");
		}
		else if(categoriaIn.getId() == 0) {
			throw new ServerException("Al editar una categoria es necesario indicar un (id) valido");
		}
		Categoria categoriaExistente = PLService.findCategoriaById(categoriaIn.getId());
		if(categoriaExistente == null) {
			throw new ServerException("El (Id) recibido no corresponde a ninguna Categoria");
		}
		PLService.UpdateCategoria(categoriaExistente, categoriaIn);
	}
	
	@PutMapping("/categoria/onoff/{id}")
	@Transactional
	public void onOffCategoriaById(@PathVariable Long id) throws ServerException {
		PLService.OnOffCategoria(id);
	}
	
//	-------------------------------------SUBCATEGORIA--------------------------------------
    
	@GetMapping("/subcategoria/listar")
	@Transactional(readOnly = true)
	public Iterable<Subcategoria> findAllSubcategoria(){
		return PLService.findAllSubcategoria();
	}
	
	@GetMapping("/subcategoria/listarActivos")
	@Transactional(readOnly = true)
	public Iterable<SubcategoriaOut> findAllSubcategoriaActivo(){
		return PLService.findAllSubcategoriaActivo();
	}
	
	@PostMapping("/subcategoria/listarActivosFiltro")
	@Transactional(readOnly = true)
	public Iterable<SubcategoriaOut> findAllSubcategoriaActivoFiltro(@RequestBody SubcategoriaFilterIn filtros){
		return PLService.findAllSubcategoriaActivoFiltro(filtros);
	}

	@GetMapping("/subcategoria/{id}")
	@Transactional(readOnly = true)
	public Subcategoria findSubcategoriaById(@PathVariable Long id){
		return PLService.findSubcategoriaById(id);
	}
	
	@DeleteMapping("/subcategoria/delete/{id}")
	@Transactional
	public void deleteSubcategoriaById(@PathVariable Long id) {
		PLService.deleteSubcategoriaById(id);
	}
	
	@PostMapping("/subcategoria/add")
	public void addSubcategoria(@RequestBody SubcategoriaIn subcategoriaIn) throws ServerException {
		if(subcategoriaIn.getId() != 0) {
			throw new ServerException("Al crear una subcategoria no se puede indicar un (id) ya que la BD ya lo gestiona");
		}
		PLService.UpdateSubcategoria(null, subcategoriaIn); 
	}
	
	@PutMapping("/subcategoria/update")
	@Transactional
	public void updateSubcategoria(@RequestBody SubcategoriaIn subcategoriaIn) throws ServerException {
		if(subcategoriaIn.getId() == null) {
			throw new ServerException("Al editar una subcategoria es obligatorio indicar un (id) distinto de NULL ");
		}
		else if(subcategoriaIn.getId() == 0) {
			throw new ServerException("Al editar una subcategoria es necesario indicar un (id) valido");
		}
		Subcategoria categoriaExistente = PLService.findSubcategoriaById(subcategoriaIn.getId());
		if(categoriaExistente == null) {
			throw new ServerException("El (Id) recibido no corresponde a ninguna Subcategoria");
		}
		PLService.UpdateSubcategoria(categoriaExistente, subcategoriaIn);
	}
	
	@PutMapping("/subcategoria/onoff/{id}")
	@Transactional
	public void onOffSubcategoriaById(@PathVariable Long id) throws ServerException {
		PLService.OnOffSubcategoria(id);
	}
	
//	-------------------------------------PRODUCTO--------------------------------------
	
	@GetMapping("/producto/listar")
	@Transactional(readOnly = true)
	public Iterable<Producto> findAllProducto(){
		return PLService.findAllProducto();
	}
	
	@GetMapping("/producto/listarActivos")
	@Transactional(readOnly = true)
	public Iterable<ProductoOut> findAllProductoActivo(){
		return PLService.findAllProductoActivo();
	}
	
	@PostMapping("/producto/listarActivosFiltro")
	@Transactional(readOnly = true)
	public Iterable<ProductoOut> findAllProductoActivoFiltro(@RequestBody ProductoFilterIn filtros){
		return PLService.findAllProductoActivoFiltro(filtros);
	}
	
	@PostMapping("/producto/listarActivosFiltroIds")
	@Transactional(readOnly = true)
	public Iterable<ProductoOut> findAllProductoActivoFiltroIds(@RequestBody ProductoFilterIdsIn filtros){
		return PLService.findAllProductoActivoFiltroIds(filtros);
	}

	@GetMapping("/producto/{id}")
	@Transactional(readOnly = true)
	public Producto findProductoById(@PathVariable Long id){
		return PLService.findProductoById(id);
	}
	
	@DeleteMapping("/producto/delete/{id}")
	@Transactional
	public void deleteProductoById(@PathVariable Long id) {
		PLService.deleteProductoById(id);
	}
	
	@PostMapping("/producto/add")
	@Transactional
	public void addProducto(@RequestBody ProductoIn productoIn) throws ServerException {
		if(productoIn.getId() != 0) {
			throw new ServerException("Al crear un producto no se puede indicar un (id) ya que la BD ya lo gestiona");
		}
		PLService.UpdateProducto(null, productoIn);
	}
	
	@PutMapping("/producto/update")
	@Transactional
	public void updateProducto(@RequestBody ProductoIn productoIn) throws ServerException {
		if(productoIn.getId() == null) {
			throw new ServerException("Al editar un producto es obligatorio indicar un (id) distinto de NULL ");
		}
		else if(productoIn.getId() == 0) {
			throw new ServerException("Al editar un producto es necesario indicar un (id) valido");
		}
		Producto productoExistente = PLService.findProductoById(productoIn.getId());
		if(productoExistente == null) {
			throw new ServerException("El (Id) recibido no corresponde a ningun producto");
		}
		PLService.UpdateProducto(productoExistente, productoIn);
	}
	
	@PutMapping("/producto/onoff/{id}")
	@Transactional
	public void onOffProductoById(@PathVariable Long id) throws ServerException {
		PLService.OnOffProducto(id);
	}

//	-------------------------------------VENTA--------------------------------------
	
	@PostMapping("/venta/listar")
	@Transactional(readOnly = true)
	public Iterable<VentaOut> findAllProductoActivoFiltro(@RequestBody VentaFilterIn filtros){
		return PLService.findAllVentaFiltro(filtros);
	}
	
	@PostMapping("/venta/registrar")
	@Transactional
	public void registrarVenta(@RequestBody VentaIn ventaIn) throws ServerException {
		PLService.registrarVenta(ventaIn);
	}
	
//	-------------------------------------VENTA_PRODUCTO--------------------------------------
	
	@GetMapping("/venta_producto/listar/{idVenta}")
	@Transactional(readOnly = true)
	public Iterable<VentaProductoOut> findAllVenta(@PathVariable Long idVenta){
		return PLService.findAllProductosByVenta(idVenta);
	}
	
}
