package com.javatpoint.mypackage;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
public class Store_product {
	 public static void main( String[] args )  
	    {  
	       
	    	
	    	Configuration cf = new Configuration();
	        cf.configure("hibernate.cfg.xml");
	 
	        SessionFactory factory = cf.buildSessionFactory();
	        
	        Session session = factory.openSession();
	        
	        Transaction t = session.beginTransaction(); //starting/beginning transaction 
	          
	       Product_practice pr=new  Product_practice();     // transient state
	            pr.setId(4);   
	            pr.setName("Eraser");    
	            pr.setPrice(34);   
	         
	       session.save(pr);  // persist state---> saving into database
	      
	       t.commit();  // commit() in DB
	       System.out.println("successfully saved");    
	        factory.close();  
	        session.close();    //detached state
	    }  
}
