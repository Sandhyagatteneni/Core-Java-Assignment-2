package com.bankimpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		System.out.println("Created Savings Account");

	}

	@Override
	public void calcInt() {
		System.out.println("Calculated the Interest");

	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Added Monthly Interest");

	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Added Half Yearly Interest");

	}

	@Override
	public void addAnnualInt() {
		System.out.println("Added Annual Interest");

	}

	@Override
	public void withDraw() {
		System.out.println("Money Withdrawn from your FD Account");

	}

	@Override
	public void deposit() {
		System.out.println("Money Deposited to your FD Account");

	}

	@Override
	public void getBalance() {
		System.out.println("The remaining balance in your account is ***** ");

	}

	@Override
	public void getAccountType(String savings, String fixed, String personalLoan, String housingLoan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interestPercentage(double savingsAcc, double fixedDepositAcc, double personalLoanAcc,
			double housingLoanAcc) {
		// TODO Auto-generated method stub
		
	}

}
