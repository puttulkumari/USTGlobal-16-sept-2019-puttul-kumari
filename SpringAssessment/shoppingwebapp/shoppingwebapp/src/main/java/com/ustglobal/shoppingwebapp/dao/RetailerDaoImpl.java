package com.ustglobal.shoppingwebapp.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.ustglobal.shoppingwebapp.dto.RetailerBean;

@Repository 
public class RetailerDaoImpl implements RetailerDAO {

		@PersistenceUnit                               
		private EntityManagerFactory factory;
		
		@Override
		public RetailerBean login(int id, String password) {
			String jpql = "from RetailerBean where id=:id and password=:pass";
			EntityManager manager = factory.createEntityManager();
			TypedQuery <RetailerBean> query= manager.createQuery(jpql,RetailerBean.class);   //using typed query no need for down casting
			query.setParameter("id", id);
			query.setParameter("pass", password);
			try {
			RetailerBean bean = query.getSingleResult();
			return bean;
			}
			catch (Exception e) {
				e.printStackTrace();
				
				return null;
			}
			
		}
		@Override
		public int register(RetailerBean bean) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			try {
				manager.persist(bean);
				transaction.commit();
				return bean.getId();

			} catch (Exception e) {
				e.printStackTrace();
				                                       
			}
			return -1;  
		}
		@Override
		public boolean deleteRetailer(int id) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			RetailerBean bean =manager.find(RetailerBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		@Override
		public RetailerBean searchRetailer(int id) { {
			EntityManager manager = factory.createEntityManager();
			
			RetailerBean bean =manager.find(RetailerBean.class, id);
			
			return bean ;
		}
	}

		@Override
		public boolean updateRetailer(RetailerBean bean) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			RetailerBean RetailerBean =manager.find(RetailerBean.class, bean.getId());
			RetailerBean.setName(bean.getName());
			RetailerBean.setName(bean.getEmail());
			RetailerBean.setName(bean.getPassword());
			transaction.commit();

			return true;
		}

		@Override
		public boolean changePassword(int id, String password) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			RetailerBean bean =manager.find(RetailerBean.class, id);
			bean.setPassword(password);
			transaction.commit();
			return true;
			
		}


}
