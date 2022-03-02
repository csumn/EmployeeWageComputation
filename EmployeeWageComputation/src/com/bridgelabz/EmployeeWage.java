package com.bridgelabz;

public class EmployeeWage {

	static final int WAGE_PER_HOUR=20;
	
	public static void main(String[] args) {
		int isPresent = 1;
		int value = (int)Math.floor(Math.random()*10) % 2;
		if(value == isPresent) {
			int empHrs = 8;
			int empWage = WAGE_PER_HOUR*empHrs; 
			System.out.println("Employee is Present and Wage is :" +empWage);
		}
		else 
		System.out.println("Employee is Absent ....");	
		}
}
