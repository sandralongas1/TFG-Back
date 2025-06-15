package com.proyecto.tfg.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.tfg.Dto.In.CategoriaIn;
import com.proyecto.tfg.Dto.In.PerfilIn;
import com.proyecto.tfg.Dto.In.ProductoFilterIdsIn;
import com.proyecto.tfg.Dto.In.ProductoFilterIn;
import com.proyecto.tfg.Dto.In.ProductoIn;
import com.proyecto.tfg.Dto.In.SubcategoriaFilterIn;
import com.proyecto.tfg.Dto.In.SubcategoriaIn;
import com.proyecto.tfg.Dto.In.UsuarioIn;
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
import com.proyecto.tfg.Entity.Estado;
import com.proyecto.tfg.Entity.Perfil;
import com.proyecto.tfg.Entity.Producto;
import com.proyecto.tfg.Entity.Subcategoria;
import com.proyecto.tfg.Entity.Usuario;
import com.proyecto.tfg.Entity.Venta;
import com.proyecto.tfg.Entity.Venta_Producto;
import com.proyecto.tfg.Mapper.CategoriaMapper;
import com.proyecto.tfg.Mapper.PerfilMapper;
import com.proyecto.tfg.Mapper.ProductoMapper;
import com.proyecto.tfg.Mapper.SubcategoriaMapper;
import com.proyecto.tfg.Mapper.UsuarioMapper;
import com.proyecto.tfg.Mapper.VentaMapper;
import com.proyecto.tfg.Mapper.VentaProductoMapper;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryCategoria;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryEstado;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryPerfil;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryProducto;
import com.proyecto.tfg.Repository.IPlantLoveRepositorySubcategoria;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryUsuario;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryVenta;
import com.proyecto.tfg.Repository.IPlantLoveRepositoryVentaProducto;

@Service
public class PlantLoveService implements IPlantLoveService{
	
	@Autowired
	IPlantLoveRepositoryPerfil RepoPerfil;
	@Autowired
	IPlantLoveRepositoryUsuario RepoUsuario;
	@Autowired
	IPlantLoveRepositoryCategoria RepoCategoria;
	@Autowired
	IPlantLoveRepositorySubcategoria RepoSubcategoria;
	@Autowired
	IPlantLoveRepositoryProducto RepoProducto;
	@Autowired
	IPlantLoveRepositoryEstado RepoEstado;
	@Autowired
	IPlantLoveRepositoryVenta RepoVenta;
	@Autowired
	IPlantLoveRepositoryVentaProducto RepoVentaProducto;
	
	@Autowired
    PerfilMapper MapperPerfil;
	@Autowired
    UsuarioMapper MapperUsuario;
	@Autowired
    CategoriaMapper MapperCategoria;
	@Autowired
	SubcategoriaMapper MapperSubcategoria;
	@Autowired
    ProductoMapper MapperProducto;
	@Autowired
	VentaMapper MapperVenta;
	@Autowired
	VentaProductoMapper MapperVentaProducto;
	
//	-------------------------------------DEVOLVER TODOS--------------------------------------
	@Override
	@Transactional(readOnly = true)
	public Iterable<Perfil> findAllPerfil(){
		return RepoPerfil.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAllUsuario(){
		return RepoUsuario.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Categoria> findAllCategoria(){
		return RepoCategoria.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Subcategoria> findAllSubcategoria(){
		return RepoSubcategoria.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> findAllProducto(){
		return RepoProducto.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Venta> findAllVenta(){
		return RepoVenta.findAll();
	}
	
//	-------------------------------------BUSCAR POR ID--------------------------------------
	@Override
	@Transactional(readOnly = true)
	public Perfil findPerfilById(Long id) {
		return RepoPerfil.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Usuario findUsuarioById(Long id) {
		return RepoUsuario.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Categoria findCategoriaById(Long id) {
		return RepoCategoria.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Subcategoria findSubcategoriaById(Long id) {
		return RepoSubcategoria.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Producto findProductoById(Long id) {
		return RepoProducto.findById(id).orElse(null);
	}
	
//	-------------------------------------DELETE--------------------------------------
	@Override
	@Transactional
	public void deletePerfilById(Long id) {
		RepoPerfil.deleteById(id);
	}
	
	@Override
	@Transactional
	public void deleteUsuarioById(Long id) {
		RepoUsuario.deleteById(id);
	}
	
	@Override
	@Transactional
	public void deleteSubcategoriaById(Long id) {
		RepoSubcategoria.deleteById(id);
	}
	
	@Override
	@Transactional
	public void deleteCategoriaById(Long id) {
		RepoCategoria.deleteById(id);
	}
	
	@Override
	@Transactional
	public void deleteProductoById(Long id) {
		RepoProducto.deleteById(id);
	}
	
//	-------------------------------------UPDATE--------------------------------------	
	@Override
	@Transactional
	public void UpdatePerfil(Perfil p) {
		RepoPerfil.save(p);
	}
	
	@Override
	@Transactional
	public void UpdateUsuario(Usuario u) {
		RepoUsuario.save(u);
	}
	
	@Override
	@Transactional
	public void UpdateCategoria(Categoria c) {
		RepoCategoria.save(c);
	}
	
	@Override
	@Transactional
	public void UpdateSubcategoria(Subcategoria c) {
		RepoSubcategoria.save(c);
	}
	
	@Override
	@Transactional
	public void UpdateProducto(Producto p) {
		RepoProducto.save(p);
	}
	
//	-------------------------------------UPDATE DTO--------------------------------------	
	
	@Override
	@Transactional
	public void UpdatePerfil(Perfil perfilExistente, PerfilIn perfilIn) {
		Perfil p = MapperPerfil.mapToPerfil(perfilExistente, perfilIn);
		RepoPerfil.save(p);
	}
	
	@Override
	@Transactional
	public void UpdateUsuario(Usuario usuarioExistente, UsuarioIn usuarioIn) {
		Usuario u = MapperUsuario.mapToUsuario(usuarioExistente, usuarioIn);
		RepoUsuario.save(u);
	}
	
	@Override
	@Transactional
	public void UpdateCategoria(Categoria categoriaExistente, CategoriaIn categoriaIn) {
		Categoria c = MapperCategoria.mapToCategoria(categoriaExistente, categoriaIn);
		RepoCategoria.save(c);
	}
	
	@Override
	@Transactional
	public void UpdateSubcategoria(Subcategoria subcategoriaExistente, SubcategoriaIn subcategoriaIn) {
		Subcategoria sc = MapperSubcategoria.mapToSubcategoria(subcategoriaExistente, subcategoriaIn);
		RepoSubcategoria.save(sc);
	}
	
	@Override
	@Transactional
	public void UpdateProducto(Producto productoExistente, ProductoIn productoIn) {
		Producto p = MapperProducto.mapToProducto(productoExistente, productoIn);
		RepoProducto.save(p);
	}
	
//	-------------------------------------ENABLE / DISABLE--------------------------------------	
	@Override
	@Transactional
	public void OnOffPerfil(Long id) {
		Perfil p = RepoPerfil.findById(id).orElseThrow(() -> new RuntimeException("Perfil no encontrado"));
		p.setActivo(!p.isActivo());
		RepoPerfil.save(p);
	}
	
	@Override
	@Transactional
	public void OnOffUsuario(Long id) {
		Usuario u = RepoUsuario.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
		u.setActivo(!u.isActivo());
		RepoUsuario.save(u);
	}
	
	@Override
	@Transactional
	public void OnOffCategoria(Long id) {
		Categoria c = RepoCategoria.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
		c.setActivo(!c.isActivo());
		RepoCategoria.save(c);
	}
	
	@Override
	@Transactional
	public void OnOffSubcategoria(Long id) {
		Subcategoria c = RepoSubcategoria.findById(id).orElseThrow(() -> new RuntimeException("Subcategoria no encontrada"));
		c.setActivo(!c.isActivo());
		RepoSubcategoria.save(c);
	}
	
	@Override
	@Transactional
	public void OnOffProducto(Long id) {
		Producto p = RepoProducto.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
		p.setActivo(!p.isActivo());
		RepoProducto.save(p);
	}
	
//	-------------------------------------LOGIN--------------------------------------
	@Override
	@Transactional(readOnly = true)
	public UsuarioLoginOut validarLogin(String user_mail, String password) {
		Usuario unUsuario = RepoUsuario.findByUsuario(user_mail);
		if(unUsuario == null) {
			unUsuario = RepoUsuario.findByEmail(user_mail);
		}
		if(unUsuario != null && unUsuario.getClave().equals(password)) {
			return new UsuarioLoginOut(unUsuario.getId(), unUsuario.getUsuario(), unUsuario.getNombre(), unUsuario.getApellidos(), unUsuario.getPerfil().getValor());
		}else {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public boolean existeUsuario(String user_mail) {
		Usuario unUsuario = RepoUsuario.findByUsuario(user_mail);
		if(unUsuario == null) {
			unUsuario = RepoUsuario.findByEmail(user_mail);
		}
		return unUsuario != null;
	}
	
//	-------------------------------------CONSULTAS--------------------------------------
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<PerfilOut> findAllPerfilActivo(){
		return RepoPerfil.findAllPerfilActivo();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<UsuarioOut> findAllUsuarioActivo(){
		return RepoUsuario.findAllUsuarioActivo();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<ProductoOut> findAllProductoActivo(){
		return RepoProducto.findAllProductoActivo();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<ProductoOut> findAllProductoActivoFiltro(ProductoFilterIn filtros){
		return RepoProducto.findAllProductoActivoFiltro(filtros.getId_categoria(), filtros.getGrupo(), filtros.getSubcategorias());
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<ProductoOut> findAllProductoActivoFiltroIds(ProductoFilterIdsIn filtros){
		return RepoProducto.findAllProductoActivoFiltroIds(filtros.getProductosId());
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<CategoriaOut> findAllCategoriaActivo(){
		return RepoCategoria.findAllCategoriaActivo();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<SubcategoriaOut> findAllSubcategoriaActivo(){
		return RepoSubcategoria.findAllSubcategoriaActivo();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<SubcategoriaOut> findAllSubcategoriaActivoFiltro(SubcategoriaFilterIn filtros){
		return RepoSubcategoria.findAllSubcategoriaActivoFiltro(filtros.getId_categoria(), filtros.getGrupo());
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<VentaOut> findAllVentaFiltro(VentaFilterIn filtros){
		return RepoVenta.findAllVentaFilter(filtros.getId_usuario(), filtros.getFechaMin(), filtros.getFechaMax());
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<VentaProductoOut> findAllProductosByVenta(Long idVenta){
		return RepoVentaProducto.findAllProductosByVenta(idVenta);
	}
	
//	-------------------------------------VENTAS--------------------------------------
	
	@Override
	@Transactional()
	public void registrarVenta(VentaIn ventaIn) {
		Estado estado = RepoEstado.findByValor("CHECK");
		Venta v = MapperVenta.mapToVenta(ventaIn, estado);	
		Venta ventaCreada = RepoVenta.save(v);
		ventaIn.getProductos().forEach(p -> {
			Venta_Producto vp = MapperVentaProducto.mapToVentaProducto(p, ventaCreada);
			RepoVentaProducto.save(vp);
		});
		
	}
}
