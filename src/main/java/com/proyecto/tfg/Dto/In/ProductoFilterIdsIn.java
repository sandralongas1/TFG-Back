package com.proyecto.tfg.Dto.In;

import java.util.List;

public class ProductoFilterIdsIn {
	
	private List<Integer> productosId;

	public ProductoFilterIdsIn() {}

	public ProductoFilterIdsIn(List<Integer> productosId) {
		this.productosId = productosId;
	}

	public List<Integer> getProductosId() {
		return productosId;
	}

	public void setProductosId(List<Integer> productosId) {
		this.productosId = productosId;
	}
	
}
