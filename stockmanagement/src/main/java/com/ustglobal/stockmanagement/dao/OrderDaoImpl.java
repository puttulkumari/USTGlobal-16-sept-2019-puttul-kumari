package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.OrderBean;
import com.ustglobal.stockmanagement.dto.ProductBean;


@Repository
public class OrderDaoImpl implements OrderDAO {
	

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public OrderBean getProductByOrderId(int order_id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(OrderBean.class, order_id);
	}

//	@Override
//	public ProductBean getProductByProductId(int id) {
//		EntityManager manager = factory.createEntityManager();
//		return manager.find(ProductBean.class, id);
//		
//	}

	@Override
	public OrderBean getTotalPrice(double total_price) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(OrderBean.class,total_price);
	}

	@Override
	public OrderBean getTotalPriceWithGst(double total_price_with_gst) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(OrderBean.class, total_price_with_gst);
	}

	@Override
	public List<OrderBean> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from order_info";
		TypedQuery<OrderBean> typedQuery = manager.createQuery(jpql, OrderBean.class);
		return typedQuery.getResultList();
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return false;
	}



	

	

}
