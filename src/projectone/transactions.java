package projectone;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

import java.awt.*;
import java.awt.event.*;

public class transactions {
	Scanner sc=new Scanner (System.in);
	private double balance, deposit,iBalance,debit;
        ArrayList<String> History = new ArrayList <String>();
        ListIterator <String> listIterator = History.listIterator();
	
	public transactions (double iBalance) {
		 iBalance=0.0;
	}

		public double getiBalance() {
		return iBalance;
	}
	public void setiBalance(double iBalance) {
		this.iBalance = iBalance;
	}
		public void credit(double amount) {
			balance=balance+amount;
                         //History.add("Deposit:" + Double.toString(balance));
		}
		
		public void debit(double amount) {
			while(balance<amount) {
				System.out.println("Invalid amount, greater than account balance. Please enter a valid amount ");
				amount=sc.nextDouble();
			}
			balance=balance-amount;
                         History.add("Withdraw:" + Double.toString(amount));
                         System.out.println("Amount withdrawed Succesfully!");
		}
		
		public double getDeposit() {
			return deposit;
		}
		public void setDeposit(double deposit) {
			this.deposit = deposit;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getBalance() {
                     History.add("Balance Inquiry:" + Double.toString(balance));
			return balance;
		}
		
		public void deposit(double d)
		{
		  balance= balance+d;
                  History.add("Deposit:" + Double.toString(d));
                  System.out.println("Amount Added Succesfully!");
			
		}
		public double getdepBalance() {
			return balance;

		}
                public String previous()
                {
                    if(listIterator.hasPrevious())
                    {
                       String x = listIterator.previous();
                        listIterator.next();
                        return x;
                        
                    } else
                            {
                                return "No Previous transactions!";
                            }
                    
                }
                 public String next()
                {
                    if(listIterator.hasNext())
                    {
                       
                       String x = listIterator.next();
                        listIterator.previous();
                        return x;
                    }
                    else
                    {
                        return "This is your last transaction!";
                    }
                }
		
		
}
	




