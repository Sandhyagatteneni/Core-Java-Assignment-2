package com.bankimpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAcc() {
		System.out.println("Created HousingLoan Account");

	}

	@Override
	public void calcInt() {
		System.out.println("Calculated the Interest");

	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Deducted Monthly Interest");

	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Deducted Half Yearly Interest");

	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Deducted Annual Interest");

	}

	@Override
	public void repayPrincipal() {
		System.out.println("The Repay Principal Amount is ****");

	}

	@Override
	public void payInterest() {
		System.out.println("The Pay Interest Amount is ****");

	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("The Pay Partial Principal Amount is ****");

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
