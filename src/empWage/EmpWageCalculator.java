package empWage;

public class EmpWageCalculator {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUMBER_OF_WORKING_DAYS = 30;
	public static final int MAX_HRS_IN_MONTH = 100;
	static int TOTAL_WORKING_DAYS=0;
	static int EMP_HOURS = 0;
	static int EMP_WAGE = 0;
	static int TOTAL_HRS = 0;
	static int TOTAL_WAGE =0;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
	
		while(EMP_HOURS < MAX_HRS_IN_MONTH &&  TOTAL_WORKING_DAYS < NUMBER_OF_WORKING_DAYS) {
			isEmpPresent();	
		
		}
		System.out.println("Total Emp Wage : "+ TOTAL_WAGE);
	}
	
	private static void isEmpPresent() {
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		TOTAL_WORKING_DAYS++;
		switch(empCheck) {
			case IS_PART_TIME :
				System.out.println("Part Time Employee is Present!");
				EMP_HOURS = 4;
				System.out.println("Emp Wage :"+ calculateEmpWage()+" Day : "+ TOTAL_WORKING_DAYS +" Emp HRS : "+EMP_HOURS+" Total Emp HRS : "+TOTAL_HRS);
				break;
				
			case IS_FULL_TIME:
				System.out.println("Full Time Employee is Present!");
				EMP_HOURS = 8;
				System.out.println("Emp Wage : "+ calculateEmpWage()+" Day : "+ TOTAL_WORKING_DAYS +" Emp HRS : "+EMP_HOURS+" Total Emp HRS : "+TOTAL_HRS);
				break;
				
			default :
				System.out.println("Employee is Absent!");
				EMP_HOURS = 0;
				System.out.println("Emp Wage :"+ calculateEmpWage()+" Day : "+ TOTAL_WORKING_DAYS +" Emp HRS : "+EMP_HOURS+" Total Emp HRS : "+TOTAL_HRS);	
		}	
	}
	
	private static int calculateEmpWage() {
		EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
		TOTAL_HRS += EMP_HOURS;
		TOTAL_WAGE += EMP_WAGE;
		return EMP_WAGE;
	}
	
}