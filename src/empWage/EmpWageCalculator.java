package empWage;
import java.util.Random;

public class EmpWageCalculator {
	static int IS_FULL_TIME = 1;
	static int EMP_RATE_PER_HOUR = 20;
	static int EMP_HOURS = 0;
	static int EMP_WAGE = 0;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		if(isEmpPresent()) {
			System.out.println("Employee is Present!");
		}
		
		else {
			System.out.println("Employee is Absent!");
		}
		System.out.println("EMP Wage : "+calculateEmpWage());
		
	}
	
	private static boolean isEmpPresent() {
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME) {
			EMP_HOURS = 8;
			return true;
		}
		else {
			EMP_HOURS = 0;
			return false;
		}
	}
	private static int calculateEmpWage() {
		EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
		return EMP_WAGE;
	}
}