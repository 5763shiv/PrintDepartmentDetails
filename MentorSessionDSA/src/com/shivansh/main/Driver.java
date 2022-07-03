package com.shivansh.main;

public class Driver {

	public static void main(String[] args) 
	{
		HRDepartment hr = new HRDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
	   System.out.println("Welcome to "+ admin.DepartmentName());
	   System.out.println(admin.GetTodaysWork());
	   System.out.println(admin.GetWorkDeadLine());
	   System.out.println(admin.IsTodayAHoliday());
	   
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("Welcome to "+ hr.DepartmentName());
	   System.out.println(hr.DoActivity());
	   System.out.println(hr.GetTodaysWork());
	   System.out.println(hr.GetWorkDeadLine());
	   System.out.println(admin.IsTodayAHoliday());
	   
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("Welcome to "+ tech.DepartmentName());
	   System.out.println(tech.GetTodaysWork());
	   System.out.println(tech.GetWorkDeadLine());
	   System.out.println(tech.IsTodayAHoliday());

	}

}
