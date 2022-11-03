package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritenceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Employee employee = new Employee();
		employee.setName("Hitha");
		employee.setSalary(5000);
		em.persist(employee);
		
		
		Manager manager=new Manager();
		manager.setName("Vikas");
		manager.setSalary(6000);
		manager.setDepartmentName("Technicl Trainning");
		em.persist(manager);
		
		em.getTransaction().commit();
		
	
		
		System.out.println("Added one employee and one manager data ");
		
		em.close();
		factory.close();
	}
	

}
