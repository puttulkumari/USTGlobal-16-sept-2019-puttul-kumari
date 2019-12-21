package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.OrderBean;
import com.ustglobal.stockmanagement.dto.ProductBean;

public interface OrderService {
	
	
	public OrderBean getProductByOrderId(int order_id);
	public OrderBean getTotalPrice(double total_price);
	public OrderBean getTotalPriceWithGst(double total_price_with_gst);
	
	public List<OrderBean> getAllProduct();
	public boolean addProduct(ProductBean bean);
	public int actionOnRequestedProduct(int tid, int sValue, int id);

}
