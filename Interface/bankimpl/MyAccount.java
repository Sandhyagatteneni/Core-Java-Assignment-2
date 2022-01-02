package com.bankimpl;

import java.util.Scanner;

public class MyAccount {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FDAcc fdA = new FDAcc();
		HousingLoanAcc hlA = new HousingLoanAcc();
		PersonalLoanAcc plA = new PersonalLoanAcc();
		SavingsAcc sA = new SavingsAcc();
		System.out.println("Enter Account Type :\n1.FD Account\n2.Housing Loan Account\n3.Personal Loan Account\n4.Savings Loan Account");
		int n = sc.nextInt();
		if(n<=4) {
			switch(n) {
			case 1:
				fdA.createAcc();
				fdA.deposit();
				fdA.getBalance();
				fdA.withDraw();
				fdA.calcInt();
				fdA.addMonthlyInt();
				fdA.addHalfYrlyInt();
				fdA.addAnnualInt();
				break;
			case 2:
				hlA.createAcc();
				hlA.calcInt();
				hlA.repayPrincipal();
				hlA.payPartialPrincipal();
				hlA.payInterest();
				hlA.deductMonthlyInt();
				hlA.deductHalfYrlyInt();
				hlA.deductAnnualInt();
				break;
			case 3:
				plA.createAcc();
				plA.calcInt();
				plA.repayPrincipal();
				plA.payPartialPrincipal();
				plA.payInterest();
				plA.deductMonthlyInt();
				plA.deductHalfYrlyInt();
				plA.deductAnnualInt();
				break;
			case 4:
				sA.createAcc();
				sA.deposit();
				sA.getBalance();
				sA.withDraw();
				sA.calcInt();
				sA.addMonthlyInt();
				sA.addHalfYrlyInt();
				sA.addAnnualInt();
			}
				
		}
		else
			System.out.println("Invalid Account Type.\nYou must enter between 1 to 4");
	}
}
