package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.OrderBean;
import com.ustglobal.stockmanagement.dto.ProductBean;

public interface OrderDAO {
	
	public OrderBean getProductByOrderId(int order_id);
	public OrderBean getTotalPrice(double total_price);
	public OrderBean getTotalPriceWithGst(double total_price_with_gst);
	
	public List<OrderBean> getAllProduct();
	public boolean addProduct(ProductBean bean);
	
	

}
	