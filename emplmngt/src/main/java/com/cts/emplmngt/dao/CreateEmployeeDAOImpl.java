package com.cts.emplmngt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.util.emplmngtUtil;
//import com.mysql.cj.api.Session;
//import com.cts.employeemanagement.dao.CreateEmployeeDAODAOImpl;

public class CreateEmployeeDAOImpl implements CreateEmployeeDAO {
	private static CreateEmployeeDAOImpl CreateEmployeeDAOImpl;
	public static CreateEmployeeDAOImpl getInstance() {
		if(CreateEmployeeDAOImpl==null){
			CreateEmployeeDAOImpl=new CreateEmployeeDAOImpl();
			return CreateEmployeeDAOImpl;
		}
		else{
			return CreateEmployeeDAOImpl;
		}
	}
public CreateEmployeeDAOImpl(){
	
}
private SessionFactory sessionFactory =emplmngtUtil.getSessionFactory();
//	public String InsertEmployee() {
//		// TODO Auto-generated method stub
//		
//		return null;
//	}

	public String UpdateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try{
		 session=sessionFactory.openSession();
		 transaction=session.getTransaction();
		transaction.begin();
		session.update(employee);
		transaction.commit();
		}
		catch(Exception e){
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return null;
	}

	public String DeleteEmployeebyId(String id) {
		// TODO Auto-generated method stub
	return null;
	}
	public Employee GetEmployeebyId(String id) {
		String query="from Empl where empId=?";
		Session session=null;
		org.hibernate.query.Query<Employee> query2=null;
		try{
			 session=sessionFactory.openSession();
			 //query2=session.createQuery(query);
			 //query2.setParameter(0, id);
			  Employee employee=session.load(Employee.class,id);
			 return employee;
			 			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				if(session!=null){
					session.close();
				}
				}
		return null;
		// TODO Auto-generated method stub
		//return null;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String query="from Empl";
		Session session=null;
		org.hibernate.query.Query<Employee> query2=null;
		try{
			 session=sessionFactory.openSession();
			 query2=session.createQuery(query);
			 List<Employee> list=query2.getResultList();
			 return list;
			 			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				if(session!=null){
					session.close();
				}
				}
		return null;
	}                       
               
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		String query="from Empl where firstName=?";
		Session session=null;
		org.hibernate.query.Query<Employee> query2=null;
		try{
			 session=sessionFactory.openSession();
			 query2=session.createQuery(query);
			 query2.setParameter(0, name);
			 List<Employee> list=query2.getResultList();
			 return list;
			 			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				if(session!=null){
					session.close();
				}
				}
		return null;
		//return null;              
	}

	public String InsertEmployee(Employee employee) {                                               
		// TODO Auto-generated method stub
		Session session=null;                         
		Transaction transaction=null;              
		try{
		 session=sessionFactory.openSession();
		 transaction=session.getTransaction();
		transaction.begin();             
		session.save(employee);                                                           
		transaction.commit();                            
		}            
		catch(Exception e){                
			if(transaction!=null)                          
			{
				transaction.rollback();                
			}
			e.printStackTrace();                         
		}                                              
		finally{                 
			if(session!=null){
				session.close();                
			}
		}                 
		return null;                  
	}
                                                   
}
