package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchUserByName
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name to display details");
		String name=sc.next();
		String qry="select u from user u where u.name=?1";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<user> q=s.createQuery(qry);
		q.setParameter(1, name);
		List<user> users=q.getResultList();
		if(users.size()>0) {
			for(user u:users) {
				System.out.println("id :"+u.getId());
				System.out.println("Name :"+u.getName());
				System.out.println("Phone Number :"+u.getEmail());
				System.out.println("Email :"+u.getEmail());
				System.out.println("*****");
			}
		}else {
			System.err.println("No user found with the entered name");
		}
		
	}

}
