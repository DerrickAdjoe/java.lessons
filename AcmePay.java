pac
kage AcmePay;

import java.util.Scanner;

public class AcmePay {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Input values
		System.out.print("Enter hours worked: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter shift (1,2, or 3):");
		int shift = input.nextInt();
		
		//Variable pay rate using a shift adder
		double baseRate = 17.00;
		double shiftAdder = 0.00;
		
		if (shift == 2) {
			shiftAdder = 1.50;
		} else if (shift == 3) {
			shiftAdder = 5.00;
		}
		double payRate = baseRate + shiftAdder;
		System.out.print("Do you participate in the retiement plan? (yes or no): ");
		String retirementPlan = input.next();
		
		//Calculate regular and overtime pay
		double regularPay = Math.min(hoursWorked, 40) * payRate;
		double overtimePay = Math.max(0,hoursWorked - 40) * payRate * 1.5;
		double totalPay = regularPay + overtimePay;
		
		//Calculate retirement deduction
		double retirementDeduction = 0;
		if ((shift ==2 || shift == 3) && retirementPlan.equalsIgnoreCase("yes")) {
			retirementDeduction = totalPay * 0.03;
		}
		
		double netPay = totalPay - retirementDeduction;
		
		//Display results
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Shift: "+ shift);
		System.out.println("Hourly pay rate: $" + payRate);
		System.out.println("Regular pay: $" + regularPay);
		System.out.println("Overtime pay: $" + overtimePay);
	    System.out.println("Total pay: $" + totalPay);
	    System.out.println("Retirement deduction: $" + retirementDeduction);
	    System.out.println("Net pay: $" + netPay);
	}
	

}
