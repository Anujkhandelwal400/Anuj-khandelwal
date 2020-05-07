package ATMmachine;
import java.util.*;
public class Account {
	Scanner sc=new Scanner(System.in);
	private int customer;
	private int PinNumber;
	private double CurrentBalance=0;
	private double SavingBalance=0;
	public int setCustomerNumber(int customer)
	{
		this.customer=customer;
		return customer;
	}
	public int setPinNumber(int PinNumber)
	{
		this.PinNumber=PinNumber;
		return PinNumber;
	}
	public int getCustomerNumber()
	{
		return customer;
	}
	public int getPinNumber()
	{
		return PinNumber;
	}
	public double getCurrentBalance()
	{
		return CurrentBalance;
	}
	public double getSavingBalance()
	{
		return SavingBalance;
	}
	public double calcWithdrawCurrentBalance(double amount)
	{
		CurrentBalance=(CurrentBalance-amount);
		return CurrentBalance;
	}
	public double calcWithdrawSavingBalance(double amount)
	{
		SavingBalance=(SavingBalance-amount);
		return SavingBalance;
	}
	public double calcDepositCurrentBalance(double amount)
	{
		CurrentBalance=(CurrentBalance+amount);
		return CurrentBalance;
	}
	public double calcDepositSavingBalance(double amount)
	{
		SavingBalance=(SavingBalance+amount);
		return SavingBalance;
	}
	public void getVeiwCurrentAccount()
	{
		System.out.println("current balance is: "+CurrentBalance);
	}
	public void getVeiwSavingAccount()
	{
		System.out.println("saving balance is: "+SavingBalance);
	}
	public void getWithdrawSavingAccount()
	{
		System.out.println("now saving balance="+SavingBalance);
		System.out.println("Enter the amount you have to withdraw: ");
		double amount=sc.nextDouble();
		if((SavingBalance-amount)>=0)
		{
			calcWithdrawSavingBalance(amount);
			System.out.println("New saving balance is="+SavingBalance);
		}
		else
		{
			System.out.println("The value can not negative "+"/n");
		}
	}
	public void getWithdrawCurrentAccount()
	{
		System.out.println("now current balance="+CurrentBalance);
		System.out.println("Enter the amount you have to withdraw: ");
		double amount=sc.nextDouble();
		if((CurrentBalance-amount)>=0)
		{
			calcWithdrawCurrentBalance(amount);
			System.out.println("New Current balance is="+CurrentBalance);
		}
		else
		{
			System.out.println("The value can not negative "+"/n");
		}
	}
	public void getDepositSavingAccount()
	{
		System.out.println("now saving balance="+SavingBalance);
		System.out.println("Enter the amount you have to Deposit: ");
		double amount=sc.nextDouble();
		if((SavingBalance+amount)>=0)
		{
			calcDepositSavingBalance(amount);
			System.out.println("New saving balance is="+SavingBalance);
		}
		else
		{
			System.out.println("The value can not negative "+"/n");
		}
	}
	public void getDepositCurrentAccount()
	{
		System.out.println("now current balance="+CurrentBalance);
		System.out.println("Enter the amount you have to Deposit: ");
		double amount=sc.nextDouble();
		if((CurrentBalance+amount)>=0)
		{
			calcDepositCurrentBalance(amount);
			System.out.println("New current balance is="+CurrentBalance);
		}
		else
		{
			System.out.println("The value can not negative "+"/n");
		}
	}
}
