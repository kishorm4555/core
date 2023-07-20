package com.javadeepdive.core;
import java.util.*;

public class Employee {
	private String name;
	private String account;
	private Integer salary;
	public Employee(String name,String account,Integer salary) {
		this.name=name;
		this.account=account;
		this.salary=salary;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		 Employee.stream().filter(emp->emp.getAccount().matches("Admin"))
		                              .findFirst()
		                              .ifPresent(System.out::println);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}


	private static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}

}
