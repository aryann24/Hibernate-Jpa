package org.jsp.hibernate_demo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class FetchAllEmployee
{
public static void main(String[] args) {
	String hql="select e from Employee e";
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<Employee> q=s.createQuery(hql);
	List<Employee> emps=q.getResultList();
	for(Employee e: emps)
	{
		System.out.println("ID:"+e.getId());
		System.out.println("name"+e.getName());
		System.out.println("salary"+e.getSalary());
		System.out.println("Desgnation"+e.getDesg());
	}
}
}
