
package projectone;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.EventHandler;
import java.awt.EventQueue;

public class secondGui{
	private JFrame frmClass;

   public static void NewScreen() {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				secondGui window= new secondGui();
				window.frmClass.setVisible(true);
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	});
}

  
public secondGui() {
	initialize();
	bal();
}

private void initialize() {
	frmClass= new JFrame();
	frmClass.setTitle("Entries");
	frmClass.setBounds(100,200,500,400);
	frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmClass.getContentPane().setLayout(null);
	JTextField tF = new JTextField();
	  String s= tF.getText();

	 
	  
	JButton btnNewButton= new JButton("Submit");
    JButton btnNewButton2= new JButton("Submit");

	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btnNewButton= new JButton("Submit");
	        frmClass.setVisible(false);
	        String s= tF.getText();
			  Double v = Double.parseDouble(s);
			  transactions t=new transactions(0.0);
			  t.debit(v);
			 //debit.setText("Invalid amount, greater than account balance. Please enter a valid amount ");
			 
		}
	});
	btnNewButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btnNewButton2= new JButton("Submit");
	        frmClass.setVisible(false);
	        String s= tF.getText();
			  Double v = Double.parseDouble(s);
			  transactions t=new transactions(0.0);
			  t.credit(v);
			 //debit.setText("Invalid amount, greater than account balance. Please enter a valid amount ");
			 
		}
	});

	 
     btnNewButton.setBounds(300,170,150,100);
     frmClass.getContentPane().add(btnNewButton);
     frmClass.getContentPane().add(tF);
     tF.setBounds(50,175,200,100);

     
     
    
   
}
  public static void balNewScreen() {
	  EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondGui window= new secondGui();
					window.frmClass.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
  }
  private void bal() {
	   transactions t= new transactions(0.0);
	  // System.out.println("Is "+t.getBalance());
  }
}
 
