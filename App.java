package com.deloitte.emp.HibernateIn;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
        try {
			SessionFactory sf = new Configuration().configure() 
					.addAnnotatedClass(Employee2.class)
					.addAnnotatedClass(SystemEngineer.class)
					.addAnnotatedClass(DeloitteConsultant.class)
					.buildSessionFactory();
			
// 		SystemEngineer se=new SystemEngineer();
//			se.setEmpId(502);
//			se.setDevProfile("webdev");
//			se.setEmpNmae("manish");
//			se.setLang("java");		
//			DeloitteConsultant dc=new DeloitteConsultant();
//		dc.setEmpId(123);
//			dc.setEmpNmae("rohit");
//			dc.setTestProfile("c");
//		dc.setTestTech("selenium");
//		
//			Session ssn = sf.openSession();
//			Transaction tx = ssn.beginTransaction();
//
//			
//			ssn.save(se);
//			ssn.save(dc);
//	 		
//			tx.commit();
//		 
//			
			Session ssn = sf.openSession();
			Query q=ssn.createQuery("from SystemEngineer where lang=:lang");
			q.setParameter("lang", "java");
			SystemEngineer se=(SystemEngineer)q.getSingleResult();
			
			//SystemEngineer se=ssn.get(SystemEngineer.class, 502);
			ssn.close();
		 
			
			System.out.println("empid"+se.getEmpId());
			System.out.println("empname"+se.getEmpNmae());
			System.out.println("dev profile"+se.getDevProfile());
			System.out.println("language"+se.getLang());
		 
		} catch (HibernateException e) 
        {
			e.printStackTrace();
		}
    
    }
    
}
