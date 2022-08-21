package com.admin;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Logindetails {
	
	public Logindetails(){
		super();
	}
	
	public static void main(String args[]){
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
       Session session = factory.openSession();  
       Transaction t = session.beginTransaction();  
       
//       List<Admin> admin = session.createQuery("from Admin").list();
//       for(Admin e: admin){
//    	   System.out.println(e.getUsername() + " " + e.getPassword());
//	}
       
       // with dynamic input use scanner
       String email="hrv@gmail.com";
       String stmt = "from Admin where username=:email";
       Query query = session.createQuery(stmt);
       query.setParameter("email", email);
       Admin admin = (Admin)query.getSingleResult();
       System.out.println(admin.getPassword());
       System.out.println(admin.getUsername());
       
	}
	
	public int verifyPassword(String email,String oldPass, String newPass, String confirmPass){

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
       Session session = factory.openSession();  
       Transaction t = session.beginTransaction(); 
       String stmt = "from Admin where username=:email";
       Query query = session.createQuery(stmt);
       query.setParameter("email", email);
       Admin admin;
   	   admin = (Admin)query.getSingleResult();
   	   t.commit();
   	   session.close();
   	   //String password = admin.getPassword();       
   	   
       //check oldpassword with database
       if(!oldPass.equals(admin.getPassword())){
    	   return -1;
       }
       if(!newPass.equals(confirmPass)){
    	   return -2;
       }
       if(newPass.equals(oldPass)){
    	   return -3;
       }
       return 1;
//       System.out.println(admin.getPassword());
//       System.out.println(admin.getUsername());
//       return 1;
	}
	
	public int changePassword(String email,String oldPass,String newPass){
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
       Session session = factory.openSession();  
       Transaction t = session.beginTransaction(); 

	       String stmt2 = "update Admin set password = :pass where username = :email";
	       Query query1 = session.createQuery(stmt2);
	       query1.setParameter("pass", newPass);
	       query1.setParameter("email", email);
	       
	       int rowsAffected = query1.executeUpdate();
	       t.commit();
	       session.close();
	       if (rowsAffected > 0) {
	           //System.out.println("Updated " + rowsAffected + " rows.");
	    	   return 1;
	       }
	       return 0;
	}
	
	public int verifyLogin(String email,String password){

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
       Session session = factory.openSession();  
       Transaction t = session.beginTransaction(); 
       String stmt = "from Admin where username=:email";
       Query query = session.createQuery(stmt);
       query.setParameter("email", email);
       Admin admin;
   	   admin = (Admin)query.getSingleResult();
   	   t.commit();
   	   session.close();
   	   
   	   //verify password
   	   String dbpassword = admin.getPassword();       
   	   
   	   if(!password.equals(dbpassword)){
   		   return 0;
   	   }
       return 1;
	}
}
