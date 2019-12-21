package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductBean;


public interface ProductDAO {
	
	
	public boolean addProduct(ProductBean product);
	
	public boolean updateProduct(ProductBean product);
	
	public boolean searchProductById(int id);
	public boolean searchProductByName(String name);
	public boolean searchProductByCategory(String category);
	public boolean searchProductByComapny(String company);
	
	public boolean deleteProductById(int id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCategory(String category);
	public boolean deleteProductByCompany(String company);
	
	
	public List<ProductBean>  getProductById(int id);
	public List<ProductBean>  getProductByName(String name);
	public List<ProductBean>  getProductByCategory(String category);
	public List<ProductBean>  getProductByComapny(String company);
	public int getAllRequestedProduct(int order_id, int id);

	public List<ProductBean> getAllProduct();
	
	

}
