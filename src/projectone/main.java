package projectone;
import java.util.Scanner;
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		card c= new card(2345688);
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Card Number: ");
	   long enteredNumber= sc.nextLong();
	   while(enteredNumber!=c.getCardNumber())
	   { 
		   System.out.println("Invalid Card Number. Try Again: ");
		   enteredNumber= sc.nextLong();
	   }
	   System.out.println("Valid Card Number.");
	  
	        transactions t= new transactions(0.0);
			System.out.println("Current Balance is "+t.getiBalance());
			System.out.println("Enter amount to withdraw: ");
			t.debit(sc.nextDouble());
			System.out.println("New balance after withdrawal= "+t.getBalance());
			System.out.println("Enter amount to deposit: ");
			t.deposit(sc.nextDouble());
			System.out.println("New balance after deposit= "+t.getdepBalance());
                       
                        
			
	   }
	}


