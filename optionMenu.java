package ATMmachine;
import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class OptionMenu extends Account{
  
	Scanner input=new Scanner(System.in);
	HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	
	public void getlogin() throws IOException
	{
		System.out.println("Welcome to the Anuj ATM Machine!!");
		int x=1;
		do
		{
			try
			{
				m.put(11111,1234);
				m.put(11112,1235);
				m.put(11113,1236);
				m.put(11114,1237);
				m.put(11115,1238);
				
				System.out.print("Enter the customer number: ");
				setCustomerNumber(input.nextInt());
				System.out.print("Enter the pin number: ");
				setPinNumber(input.nextInt());
			}
			catch(Exception e)
			{
				System.out.println("Invalid character: Only integer is allowed: ");
				x=2;
			}
			for(Entry<Integer , Integer> entry : m.entrySet())
			{
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
					getAccountType();
			}
			System.out.println("Wrong customer number or pin number");
		}
		while(x==1);
	}
			public void getAccountType() {
				System.out.println("1. Current Account: ");
				System.out.println("2. Saving Account: ");
				System.out.println("3. Exit");
				System.out.println("Enter the number which you want to access: ");
				int select=input.nextInt();
				
				switch(select)
				{
				case 1:
					getCurrentAccount();
					break;
				case 2:
					getSavingAccount();
					break;
				case 3:
					System.out.println("Thank you for using Anuj ATM Machine!!");
					break;
					default:
						System.out.println("Invalid number:Enter the valid number: ");
						getAccountType();
						break;
				}
			}
			public void getCurrentAccount()
			{
				System.out.println("1. Veiwing Current Account Balance: ");
				System.out.println("2. Withdraw money from Current Account: ");
				System.out.println("3. Deposit money to Current Account: ");
				System.out.println("4. Exit: ");
				int take=input.nextInt();
				
				switch(take)
				{
				case 1:
					getVeiwCurrentAccount();
					getCurrentAccount();
					break;
				case 2:
					getWithdrawCurrentAccount();
					getCurrentAccount();
					break;
				case 3:
					getDepositCurrentAccount();
					getCurrentAccount();
					break;
				case 4: 
					System.out.println("Thank you for using Anuj ATM Machine!!");
					break;
					default:
						System.out.println("Invalid number: please enter valid number: ");
						getCurrentAccount();
						break;
				}
			}
			public void getSavingAccount()
			{
				System.out.println("1. viewing Saving account balance: ");
				System.out.println("2. Withdraw money from saving account: ");
				System.out.println("3. Deposit money in saving account: ");
				System.out.println("4. exit: ");
				System.out.println("Enter the number which you can access the acount: ");
				int choice=input.nextInt();
				
				switch(choice)
				{
				case 1: 
					getVeiwSavingAccount();
					getSavingAccount();
					break;
				case 2: 
					getWithdrawSavingAccount();
					getSavingAccount();
					break;
				case 3: 
					getDepositSavingAccount();
					getSavingAccount();
					break;
				case 4: 
					System.out.println("Thank for use Anuj ATM Machine: ");
					break;
					default: 
						System.out.println("Enter the valid number: ");
						getSavingAccount();
						break;
				}
			}
	}
