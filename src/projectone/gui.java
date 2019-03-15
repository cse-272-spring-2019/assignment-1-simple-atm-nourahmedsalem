package projectone;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.event.EventHandler;
import java.awt.EventQueue;
import java.util.Scanner;

public class gui{
	private JFrame frmClass;

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
                        
                         int i = 0;
                        while( i <t.History.size())
                        {
                            System.out.println("History:" + t.History.get(i));
                                    
                            i++;
                        }
			
       
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				gui window= new gui(t);
				window.frmClass.setVisible(true);
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	});
}


public gui(transactions x) {
    transactions t = x;
	initialize(x);
}



private void initialize(transactions t ) {
	frmClass= new JFrame();
        JPanel panel = new JPanel();
	frmClass.setTitle("ATM");
	frmClass.setBounds(100,100,900,400);
	frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmClass.getContentPane().setLayout(null);
        
	JTextField tF = new JTextField();
	 String s= tF.getText();
	 
     
	 
	JButton btnNewButton= new JButton("1.Withdraw");
	JButton btnNewButton2 = new JButton("2.Deposit");
	JButton btnNewButton3= new JButton("3.Balance Inquiry");
	JButton Previous= new JButton("4.Previous");
	JButton Next= new JButton("5.Next");


        frmClass.add(panel);
        panel.add(Previous);
        panel.add(Next);
        frmClass.setVisible(true);
	
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			secondGui sG= new secondGui();
			 sG.NewScreen();
			
		}
	});	
	
	btnNewButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			secondGui sG= new secondGui();
			 sG.NewScreen();
			
	}
	});
	
     btnNewButton3.addActionListener(new ActionListener() {
    	 public void actionPerformed(ActionEvent e) {
    		 GUIbutton gB= new GUIbutton(t);
    		 gB.balNewScreen(t);
    	 }
 	});
		
     Previous.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e) {
                    // JLabel icon = new JLabel( );
                     JOptionPane.showMessageDialog(frmClass.getComponent(0), t.previous());
                    // frmClass.setContentPane(icon);
                   
 			//secondGui sG= new secondGui();
 			 //sG.NewScreen();
 			
 	}
 		
 	});
     
     Next.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e) {
 			//secondGui sG= new secondGui();
 			 //sG.NewScreen();
         JOptionPane.showMessageDialog(frmClass.getComponent(0), t.next());
 			
 	}
 	});
     btnNewButton.setBounds(20,50,200,100);
     frmClass.getContentPane().add(btnNewButton);
     btnNewButton2.setBounds(20,200,200,100);
     frmClass.getContentPane().add(btnNewButton2);
     btnNewButton3.setBounds(300,50,200,100);
     frmClass.getContentPane().add(btnNewButton3);
     Previous.setBounds(300,200,200,100);
     frmClass.getContentPane().add(Previous);
     Next.setBounds(600,50,200,100);
     frmClass.getContentPane().add(Next);
     


}
}
