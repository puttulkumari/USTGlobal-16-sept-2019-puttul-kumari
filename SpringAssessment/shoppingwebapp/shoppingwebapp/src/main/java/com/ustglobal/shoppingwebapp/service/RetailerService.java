package com.ustglobal.shoppingwebapp.service;

import com.ustglobal.shoppingwebapp.dto.RetailerBean;

public interface RetailerService {
	public RetailerBean login(int id, String password);
	public int register(RetailerBean bean);
	public boolean deleteRetailer(int id);
	public RetailerBean searchRetailer(int id);
	public boolean updateRetailer(RetailerBean bean);
	public boolean changePassword(int id, String password);


}
