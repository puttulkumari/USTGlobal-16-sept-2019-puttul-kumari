package com.ustglobal.stockmanagement.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.ProductBean;

	@Repository
	public class ProductDaoImpl implements ProductDAO {

		@PersistenceUnit
		private EntityManagerFactory factory;
		@Override
		public boolean addProduct(ProductBean product) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				manager.persist(product);
				transaction.commit();
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		@Override
		public boolean updateProduct(ProductBean product) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				ProductBean p = manager.find(ProductBean.class, product.getId());
				p.setCategory(product.getCategory());
				p.setName(product.getName());
				p.setQuantity(product.getQuantity());
				p.setPrice(product.getPrice());
				transaction.commit();
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		@Override
		public boolean deleteProductById(int id) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				ProductBean product = manager.find(ProductBean.class, id);
				manager.remove(product);
				transaction.commit();
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		@Override
		public boolean deleteProductByName(String name) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				String jpql = "from Product where name=:name";
				TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
				typedQuery.setParameter("name", name);
				ProductBean product = typedQuery.getSingleResult();
				manager.remove(product);
				transaction.commit();
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		@Override
		public boolean deleteProductByCategory(String category) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				String jpql = "from Product where category=:category";
				TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
				typedQuery.setParameter("category", category);
				List<ProductBean> products = typedQuery.getResultList();
				for (ProductBean product : products) {
					manager.remove(product);
				}
				transaction.commit();
				return true;
			}catch (Exception e) {
				return false;
			}
		}

		@Override
		public List<ProductBean> getProductById(int id) {
			EntityManager manager = factory.createEntityManager();
			String jpql = "from products_info where id=:id";
			TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
			typedQuery.setParameter("id", id);
			return typedQuery.getResultList();
			
		}

		@Override
		public List<ProductBean> getProductByName(String name) {
			EntityManager manager = factory.createEntityManager();
			
				String jpql = "from products_info where name=:name";
				TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
				typedQuery.setParameter("name", name);
				return typedQuery.getResultList();
			
		}
		
		
		
		@Override
		public List<ProductBean> getProductByComapny(String company) {
			EntityManager manager = factory.createEntityManager();
				String jpql = "from products_info where company=:company";
				TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
				typedQuery.setParameter("company", company);
				return typedQuery.getResultList();
			
		}


		@Override
		public List<ProductBean> getProductByCategory(String category) {
			EntityManager manager = factory.createEntityManager();
			String jpql = "from products_info where category=:category";
			TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
			typedQuery.setParameter("category", category);
			return typedQuery.getResultList();
		}

		@Override
		public List<ProductBean> getAllProduct() {
			EntityManager manager = factory.createEntityManager();
			String jpql = "from product_info";
			TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
			return typedQuery.getResultList();
		}

		@Override
		public boolean searchProductById(int id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean searchProductByName(String name) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean searchProductByCategory(String category) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean searchProductByComapny(String company) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteProductByCompany(String company) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int getAllRequestedProduct(int order_id, int id) {
			// TODO Auto-generated method stub
			return 0;
		}


		

	}
