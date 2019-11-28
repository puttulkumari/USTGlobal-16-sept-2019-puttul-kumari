package com.ustglobal.empapp;
import java.util.List;
import java.util.Scanner;
import com.ustgloabal.empapp.utill.EmployeeManager;
import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;

public class App {
	public static void main(String[] args) {

		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert employee data");
		System.out.println("press 3 to update  employee data");
		System.out.println("press 4 to delete employee data");
		System.out.println("press 5 to search single employee data");
		Scanner sc =new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {
		case 1:
			EmployeeDAO dao  = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			//{EmployeeDAOImpl impl =new EmployeeDAOImpl(); we don't want implememtation here}
			//{List<EmployeeBean> result = impl.getAllEmployeeData();}

			for(EmployeeBean bean : result) {
				System.out.println("id :"+bean.getId());
				System.out.println("name :"+bean.getName());
				System.out.println("gender :"+bean.getGender());
				System.out.println("salary :"+bean.getSal());
			}
			break;
		case 2:
			EmployeeDAOImpl impl2 =new EmployeeDAOImpl();

			break;
		case 3:
			EmployeeDAOImpl impl3 =new EmployeeDAOImpl();
			break;
		case 4:
			EmployeeDAOImpl impl4 =new EmployeeDAOImpl();
			break;
		case 5://EmployeeDAOImpl impl5 =new EmployeeDAOImpl();Normal jdbc
			//EmployeeDaoHibernateImpl impl5 = new EmployeeDaoHibernateImpl(); 
			//this is for hibernate connect to program
			//EmployeeDAO impl5 = new EmployeeDao();      it is for implement interface bcs we don't want all method has to declare here.
			
			
			EmployeeDAO dao5  = EmployeeManager.getEmployeeDAO();
			int id = sc.nextInt();
			EmployeeBean bean = dao5.SearchAllEmployeeData(id);
			if(bean!=null) {
				System.out.println("id :"+bean.getId());
				System.out.println("name :"+bean.getName());
				System.out.println("gender :"+bean.getGender());
				System.out.println("salary :"+bean.getSal());
			}
			else {
				System.out.println("no data found");
			}
			break;	
		}


	}

}
