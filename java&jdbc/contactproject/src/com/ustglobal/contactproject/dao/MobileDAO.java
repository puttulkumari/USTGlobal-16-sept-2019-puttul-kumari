package com.ustglobal.contactproject.dao;

import java.util.List;

import com.ustglobal.contactproject.dto.MobileBean;

public class MobileDAO {
	

		public List<MobileBean> getAllMobileData();
		public MobileBean SearchAllMobileData(String name);
		public int insertMobileData(MobileBean bean);
		public int updateMobileData(MobileBean bean);
		public int deleteMobileData(String name);

	}


}
