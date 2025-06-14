package com.proyecto.tfg.Service;

import com.proyecto.tfg.Dto.In.CategoriaIn;
import com.proyecto.tfg.Dto.In.PerfilIn;
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
import com.proyecto.tfg.Entity.Perfil;
import com.proyecto.tfg.Entity.Producto;
import com.proyecto.tfg.Entity.Subcategoria;
import com.proyecto.tfg.Entity.Usuario;
import com.proyecto.tfg.Entity.Venta;


public interface IPlantLoveService {
	
//	-------------------------------------PERFILES--------------------------------------
	
	Iterable<Perfil> findAllPerfil();
	
	Iterable<PerfilOut> findAllPerfilActivo();

	Perfil findPerfilById(Long id);

	void deletePerfilById(Long id);

	void UpdatePerfil(Perfil c);
	
	void UpdatePerfil(Perfil perfilExistente, PerfilIn perfilIn);	
	
	void OnOffPerfil(Long id);
	
//	-------------------------------------LOGIN--------------------------------------

	UsuarioLoginOut validarLogin(String user_mail, String password);

	boolean existeUsuario(String user_mail);
	
//	-------------------------------------USUARIOS--------------------------------------
	
	Iterable<Usuario> findAllUsuario();

	Iterable<UsuarioOut> findAllUsuarioActivo();
	
	Usuario findUsuarioById(Long id);

	void deleteUsuarioById(Long id);

	void UpdateUsuario(Usuario u);
	
	void UpdateUsuario(Usuario usuarioExistente, UsuarioIn usuarioIn);
	
	void OnOffUsuario(Long id);
	
//	-------------------------------------CATEGORIAS--------------------------------------
	
	Iterable<Categoria> findAllCategoria();
	
	Iterable<CategoriaOut> findAllCategoriaActivo();

	Categoria findCategoriaById(Long id);

	void deleteCategoriaById(Long id);

	void UpdateCategoria(Categoria c);
	
	void UpdateCategoria(Categoria categoriaExistente, CategoriaIn categoriaIn);
	
	void OnOffCategoria(Long id);
	
//	-------------------------------------SUBCATEGORIAS--------------------------------------

	Iterable<Subcategoria> findAllSubcategoria();
	
	Iterable<SubcategoriaOut> findAllSubcategoriaActivo();
	
	Iterable<SubcategoriaOut> findAllSubcategoriaActivoFiltro(SubcategoriaFilterIn filtros);

	Subcategoria findSubcategoriaById(Long id);

	void deleteSubcategoriaById(Long id);

	void UpdateSubcategoria(Subcategoria c);

	void UpdateSubcategoria(Subcategoria subcategoriaExistente, SubcategoriaIn subcategoriaIn);

	void OnOffSubcategoria(Long id);
	
//	-------------------------------------PRODUCTOS--------------------------------------

	Iterable<Producto> findAllProducto();
	
	Iterable<ProductoOut> findAllProductoActivo();

	Iterable<ProductoOut> findAllProductoActivoFiltro(ProductoFilterIn filtros);
	
	Producto findProductoById(Long id);

	void deleteProductoById(Long id);

	void UpdateProducto(Producto p);
	
	void UpdateProducto(Producto productoExistente, ProductoIn productoIn);

	void OnOffProducto(Long id);

//	-------------------------------------VENTAS--------------------------------------
	
	Iterable<Venta> findAllVenta();
	
	Iterable<VentaOut> findAllVentaFiltro(VentaFilterIn filtros);
	
	void registrarVenta(VentaIn venta);


//	-------------------------------------VENTA_PRODUCTO--------------------------------------
	
	Iterable<VentaProductoOut> findAllProductosByVenta(Long idVenta);

	


}
