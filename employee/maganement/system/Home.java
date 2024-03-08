package employee.maganement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends Virtual_Home{

	Home(){
        add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // This code is executed when the button is clicked
                	setVisible(false);
                    new AddEmployee();
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
                    	setVisible(false);
                        new ViewEmployee();
                    }
              });
             remove.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // This code is executed when the button is clicked
                    	setVisible(false);
                        new RemoveEmployee();
                    }
              });	   
    }
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home();
	}

}


