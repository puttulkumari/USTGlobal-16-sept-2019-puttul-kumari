package com.ustglobal.shoppingwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.shoppingwebapp.dao.RetailerDAO;
import com.ustglobal.shoppingwebapp.dto.RetailerBean;
@Service
public class RetailerServiceImpl implements RetailerService  {
	
	@Autowired
	private RetailerDAO dao;

	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}

	@Override
	public boolean deleteRetailer(int id) {
		return dao.deleteRetailer(id);
	}

	@Override
	public RetailerBean searchRetailer(int id) {
		return dao.searchRetailer(id);
	}

	@Override
	public boolean updateRetailer(RetailerBean bean) {
		return dao.updateRetailer(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

}
