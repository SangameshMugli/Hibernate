package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllUsers 
{
	public static void main(String[] args)
	{
		String qry="select u from user u";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<user>q=s.createQuery(qry);
		List<user> users=q.getResultList();
		for(user u:users)
		{
			System.out.println("id :"+u.getId());
			System.out.println("Name :"+u.getName());
			System.out.println("Phone Number :"+u.getEmail());
			System.out.println("Email :"+u.getEmail());
			System.out.println("*****");
		}
		
	}

}
