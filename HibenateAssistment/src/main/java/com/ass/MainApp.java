package com.ass;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class MainApp {

	public static void main(String[] args) 
	{
		/**insert a recored in table
		EmployeeList el=new EmployeeList();
		el.setId(2);
		el.setName("devaki");
		el.setSalary(8569.32);
		el.setDep("civil");
		el.setGen("Female");
		 **/
		
		//connection with database pass entry cloumn to create a table
		Configuration conn=new Configuration().configure().addAnnotatedClass(EmployeeList.class);	
		//is a interface to give a service to be connect mysql to java
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		//open the session(insert,update,delete)
		Session sess=sf.openSession();
		//internal implement the transaction in jpa
		Transaction tx=sess.beginTransaction();
		
		/**select the particular record
	    EmployeeList s= (EmployeeList) sess.get(EmployeeList.class, 2);
	    System.out.println(s);
	    **/
		
		//select all record
		/** 
		 Query q =sess.createQuery("from EmployeeList");
	     Iterator<EmployeeList> s=q.iterate();
	     while(s.hasNext())
	     {
	    	 EmployeeList el=s.next();
	    	 System.out.println(el.getId()+" "+el.getName()+" "+el.getSalary()+" "+el.getDep()+" "+el.getGen());
	     }
	     **/
		//sess.save(el);
		//delete particular record
		EmployeeList el=new EmployeeList();
		el.setId(1);
		sess.delete(el);
		
		tx.commit();

	}

}
