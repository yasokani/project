package com.javatpoint.mypackage;

import java.util.HashMap;    
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    
  
  
public class MapCollectionMain {    
public static void main(String[] args) {    
   
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
	   
	Transaction t=session.beginTransaction();    
	    
	HashMap<String,String> map1=new HashMap<String,String>();    
	map1.put("Java is a programming language","Micheal ");    
	map1.put("Java is a platform","Ajay Sharma");    
	    
	HashMap<String,String> map2=new HashMap<String,String>();    
	map2.put("Servlet technology is a server side programming","Micheal");    
	map2.put("Servlet is an Interface","Ajay");    
	map2.put("Servlet is a package","Rahul Kumar");    
	    
	QuestionMap question1=new QuestionMap("What is Java?","Aman",map1);    
	QuestionMap question2=new QuestionMap("What is Servlet?","Jai",map2);    
	    
	session.persist(question1);    
	session.persist(question2);    
	    
	t.commit();    
	session.close();    
	System.out.println("successfully stored");    
}    
}    
