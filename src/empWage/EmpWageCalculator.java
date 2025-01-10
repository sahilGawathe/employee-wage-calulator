package empWage;
import java.util.Random;

public class EmpWageCalculator {
	static int IS_FULL_TIME = 1;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		if(isEmpPresent()) {
			System.out.println("Employee is Present!");
		}
		else {
			System.out.println("Employee is Absent!");
		}
		
	}
	
	private static boolean isEmpPresent() {
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME) {
			return true;
		}
		else {
			return false;
		}
	}
}