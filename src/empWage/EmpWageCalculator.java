package empWage;
import java.util.Random;


public class EmpWageCalculator {
	static int IS_FULL_TIME = 1;
	static int IS_PART_TIME = 2;
	static int EMP_RATE_PER_HOUR = 20;
	static int EMP_HOURS = 0;
	static int EMP_WAGE = 0;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		isEmpPresent();
		System.out.println("EMP Wage : "+calculateEmpWage());
		
	}
	
	private static void isEmpPresent() {
		double empCheck = Math.floor(Math.random()*10)%3;
		
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Full Time Employee is Present!");
			EMP_HOURS = 8;
		}
		else if(empCheck == IS_PART_TIME) {
			System.out.println("Part Time Employee is Present!");
			EMP_HOURS = 4;
		}
		else {
			System.out.println("Employee is Absent!");
			EMP_HOURS = 0;
		}
	}
	private static int calculateEmpWage() {
		EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
		return EMP_WAGE;
	}
}