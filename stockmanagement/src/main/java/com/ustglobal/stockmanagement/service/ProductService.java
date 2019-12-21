package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductBean;


public interface ProductService {
	public boolean addProduct(ProductBean product);
	
	public boolean updateProduct(ProductBean product);
	
	public boolean deleteProductById(int id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCategory(String category);
	
	public List<ProductBean>  getProductById(int id);
	public List<ProductBean>  getProductByName(String name);
	public List<ProductBean>  getProductByCategory(String category);
	public List<ProductBean> getAllProduct();
	
	public int requestProduct(int order_id, int product_id);
	public List<ProductBean> getAllRequestedProduct(int product_id);
	
	
	public ProductBean searchProductById(int id);
	public ProductBean searchProductByName(String name);
	public ProductBean searchProductByCategory(String category);
	public ProductBean searchProductByCompany(String company);

}
