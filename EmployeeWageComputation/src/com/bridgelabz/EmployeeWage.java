package com.bridgelabz;

public class EmployeeWage {

	static final int WAGE_PER_HOUR=20;
	static final int IS_FULL_TIME=1;
	static final int IS_PART_TIME=2;

	public static void main(String[] args) {
		
		int value = (int)Math.floor(Math.random()*10) % 3;

		switch (value) {
		case IS_FULL_TIME: {
			int empHrs = 8;
			int empWage = WAGE_PER_HOUR * empHrs; 
			System.out.println("Employee is Present (Full Time) and Wage is :" +empWage);
			break;
			}
		case IS_PART_TIME: {
			int empHrs = 4;
			int empWage = WAGE_PER_HOUR * empHrs; 
			System.out.println("Employee is Present (Part Time) and Wage is :" +empWage);
			break;
			}
		default:
			System.out.println("Employee is Absent ....");	
		}
	}
}
