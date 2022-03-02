package com.bridgelabz;

public class EmployeeWage {

	static final int WAGE_PER_HOUR_IS=20;
	static final int IS_FULL_TIME=1;
	static final int IS_PART_TIME=2;
	static final int NUMBER_OF_WORKING_DAYS=20;

	public static void main(String[] args) {
		int total_Employee_Wage=0;

		for (int day=1; day<=NUMBER_OF_WORKING_DAYS; day++) 
		{
		int value = (int)Math.floor(Math.random()*10) % 3;
		switch (value) {
		case IS_FULL_TIME: {
			int empHrs = 8;
			int empWage = WAGE_PER_HOUR_IS * empHrs; 
			System.out.println("Employee is Present Full time and will receive " +WAGE_PER_HOUR_IS*empHrs);
			total_Employee_Wage=total_Employee_Wage+empWage;
			break;
			}
		case IS_PART_TIME: {
			int empHrs = 4;
			int empWage = WAGE_PER_HOUR_IS * empHrs; 
			System.out.println("Employee is Present Part time and will receive " +WAGE_PER_HOUR_IS*empHrs );
			total_Employee_Wage=total_Employee_Wage+empWage;
			break;
			}
		default:
			System.out.println("Employee is Absent ....");	
			}
		}
		System.out.println("Total Wage of the Employee in a Month is : " +total_Employee_Wage);
	}
}
