package org.jsp.userapp.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test
{
public static void main(String[] args)
{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
}
}
