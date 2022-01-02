package com.bank;

public interface Account {
	void getAccountType(String savings, String fixed, String personalLoan, String housingLoan);
	void createAcc();
}
/* 
 * 1. <Interface> Account
      Data members: Four String variables to hold the 
      account type �Savings, Fixed,PersonalLoan,HousingLoan�
	  Methods: createAcc()
   2. <Interface>DepositAcc

Methods: withdraw (), deposit(),getBalance()

3. <Interface>LoanAcc

Methods: repayPrincipal (),payInterest (),payPartialPrincipal ()

4. <Interface>Interest

Data members: Four double variables to hold the 
interest percentage of Savings account, 
Fixeddeposit account,PersonalLoan account and HousingLoan account.

Methods: calcInt()

5. <Interface>CreditInterest

Methods: addMonthlyInt(),addHalfYrlyInt(),addAnnualInt()

6. <Interface>DebitInterest

Methods: deductMonthlyInt(),deductHalfYrlyInt(),deductAnnualInt()

Create a package called BankImpl and create the following classes in it.

1. SavingsAcc which implements DepositAcc and CreditInterest

2. FDAcc which implements DepositAcc and CreditInterest

3. PersonalLoanAcc which implements LoanAcc and DebitInterest

4. HousingLoanAcc which implements LoanAcc and DebitInterest

Now create a class called MyAccount and create instances of all the accounts and generate appropriate output.*/
