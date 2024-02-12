package com.hibernate.ex1.HibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure(); 
        
        SessionFactory factory=cfg.buildSessionFactory();
        //open session 
        Session session= factory.openSession();  
        //creating transaction
        Transaction trans=session.beginTransaction();
        Student1 st1=new Student1(12,"Amit",29);
        session.save(st1);
        trans.commit();
        System.out.println("Student object is saved");
        
        
        
        
    }
}
