package com.ustglobal.stockmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDAO;
import com.ustglobal.stockmanagement.dto.ProductBean;




	@Service
	public class ProductServiceImpl implements ProductService {

		@Autowired
		private ProductDAO dao;
		
		@Override
		public boolean addProduct(ProductBean product) {
			return dao.addProduct(product);
		}

		@Override
		public boolean updateProduct(ProductBean product) {
			return dao.updateProduct(product);
		}

		@Override
		public boolean deleteProductById(int id) {
			return dao.deleteProductById(id);
		}

		@Override
		public boolean deleteProductByName(String name) {
			return dao.deleteProductByName(name);
		}

		@Override
		public boolean deleteProductByCategory(String category) {
			return dao.deleteProductByCategory(category);
		}

		@Override
		public List<ProductBean> getProductById(int id) {
			return dao.getProductById(id);
		}

		@Override
		public List<ProductBean> getProductByName(String name) {
			return dao.getProductByName(name);
		}

		@Override
		public List<ProductBean> getProductByCategory(String category) {
			return dao.getProductByCategory(category);
		}

		@Override
		public List<ProductBean> getAllProduct() {
			return dao.getAllProduct();
		}

		@Override
		public int requestProduct(int order_id, int product_id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<ProductBean> getAllRequestedProduct(int product_id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ProductBean searchProductById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ProductBean searchProductByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ProductBean searchProductByCategory(String category) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ProductBean searchProductByCompany(String company) {
			// TODO Auto-generated method stub
			return null;
		}

	}

