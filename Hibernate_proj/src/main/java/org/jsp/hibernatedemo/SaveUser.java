package org.jsp.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser 
{
	public static void main(String[] args)
	{
		user u =new user();
		u.setEmail("abc@gmail.com");
		u.setName("sangamesh");
		u.setPassword("abc123");
		u.setPhone(9876543210L);
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		int id=(Integer)s.save(u);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("user registered with Id:"+id);
		
		
	}

}
