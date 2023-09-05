package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user Id to print the details");
		int uid=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		user u=s.load(user.class, uid);
		try 
		{
			System.out.println("Id :"+u.getId());
			System.out.println("Name :"+u.getName());
			System.out.println("Phone :"+u.getPhone());
			System.out.println("Email :"+u.getEmail());
		}
		catch (ObjectNotFoundException e)
		{
			System.err.println("You have entered an Invalid Id");
		}
	}

}
