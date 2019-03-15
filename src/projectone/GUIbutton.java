package projectone;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.event.EventHandler;
import java.awt.EventQueue;

public class GUIbutton {
	private JFrame frmClass;
               public GUIbutton(transactions x) {
         transactions t = x;
	initialize(x);
}

	public static void balNewScreen(transactions t) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIbutton window= new GUIbutton( t);
					//window.frmClass.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			 
		});
	}

	  
	
 

	private void initialize(transactions t) {
		frmClass= new JFrame();
               
                JLabel icon  = new JLabel(Double.toString(t.getBalance()));
		frmClass.setTitle("Balance");
		frmClass.setBounds(100,200,500,400);
                JPanel panel = new JPanel();
                //frmClass.add(icon);
		frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton btnNewButton3= new JButton("Done");
                btnNewButton3.setBounds(50,50,50,50);
	        //frmClass.add(btnNewButton3);
                frmClass.add(panel);
                panel.add( btnNewButton3);
                panel.add(icon);
		//frmClass.getContentPane().setLayout(null);
                frmClass.setVisible(true);
                //frmClass.getContentPane().add(icon);
                //frmClass.setVisible(true);
		  
		 
		//transactions t=  new transactions(0.0);
                System.out.println(Double.toString(t.getBalance()));
                //frmClass.add(new TextField(Double.toString(t.getBalance())));
		//t.getBalance();
		//t.setText("Balance is "+t.getBalance());
		
		 
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				//JButton btnNewButton3= new JButton("Done");
                                
                                //frmClass.toString();
                              // t.getBalance();
		        frmClass.setVisible(false);
		        //System.out.println("Balance is "+t.getdepBalance());
			}
		});
		
		
}


	private void setText(String string) {
		// TODO Auto-generated method stub
		
	}
}
