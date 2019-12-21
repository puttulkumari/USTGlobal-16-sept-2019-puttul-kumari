package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.OrderDAO;
import com.ustglobal.stockmanagement.dto.OrderBean;
import com.ustglobal.stockmanagement.dto.ProductBean;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO dao;

	@Override
	public OrderBean getProductByOrderId(int order_id) {
		return dao.getProductByOrderId(order_id);
	}

	@Override
	public OrderBean getTotalPrice(double total_price) {
		return dao.getTotalPrice(total_price);
	}

	@Override
	public OrderBean getTotalPriceWithGst(double total_price_with_gst) {
		return dao.getTotalPriceWithGst(total_price_with_gst);
	}

	@Override
	public List<OrderBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		
		return dao.addProduct(bean);
	}

	@Override
	public int actionOnRequestedProduct(int tid, int sValue, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
