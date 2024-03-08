package employee.maganement.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home_staff extends Virtual_Home { 
		
	 Home_staff(){
	        add.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // This code is executed when the button is clicked
	                	JOptionPane.showMessageDialog(null, "Requires ADMIN Login");
	                }
	         });
	         view.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // This code is executed when the button is clicked
	                	setVisible(false);
	                    new ViewEmployee();
	                }
	          });
	             update.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        // This code is executed when the button is clicked
	                    	JOptionPane.showMessageDialog(null, "Requires ADMIN Login");
	                    }
	              });
	             remove.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        // This code is executed when the button is clicked
	                    	JOptionPane.showMessageDialog(null, "Requires ADMIN Login");
	                    }
	              });
	  }
	       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home_staff();
	}

}
