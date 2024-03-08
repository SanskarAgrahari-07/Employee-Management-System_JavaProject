package employee.maganement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Virtual_Home extends JFrame{
	
	public JButton add,view,update,remove;  
    public JLabel image;
    
	Virtual_Home(){
		 setLayout(null);
	        
	        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/leftwallpaper.jpg"));
	        Image l2 = l1.getImage().getScaledInstance(190, 630, Image.SCALE_DEFAULT);
	        ImageIcon l3 = new ImageIcon(l2);
	        JLabel left = new JLabel(l3);
	        left.setBounds(-180, 0, 190, 630);
	        
	        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/arrow.png"));
		    Image a2 = a1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		    ImageIcon a3 = new ImageIcon(a2);
		    JLabel a5 = new JLabel(a3);
	        a5.setBounds(04, 01, 55, 50);
	        left.add(a5);
	        
	        add = new JButton("Add Employee");
	        add.setBounds(0, 80, 175, 40);
	        add.setBackground(new Color(180, 247, 252));     
	        add.setFont(new Font("Arial", Font.BOLD, 16));
	         left.add(add);
	            
	         view = new JButton("View Employees");
	         view.setBounds(0, 135, 177, 40);
	         view.setBackground(new Color(180, 247, 252));
	         view.setFont(new Font("Arial", Font.BOLD, 16));
	          left.add(view);
	          
	         update = new JButton("Update Employee");
	             update.setBounds(0, 190, 179, 40);
	             update.setBackground(new Color(180, 247, 252));
	             update.setFont(new Font("Arial", Font.BOLD, 16));
	              left.add(update);
	              
	             remove = new JButton("Remove Employee");
	             remove.setBounds(0, 245, 180, 40);
	             remove.setBackground(new Color(180, 247, 252));
	             remove.setFont(new Font("Arial", Font.BOLD, 16));
	              left.add(remove);
	        
	        a5.addMouseListener(new MouseAdapter() {
	        	
	        	            @Override
	        	
	        	        public void mouseClicked(MouseEvent e) {
	        	            	left.setBounds(-180, 0, 190, 630);        	            		
	        	         }	
	        	});
	        	        
	        
	        add(left);
	        
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(0, 0, 1000, 600);
	        add(image);
	        
	        ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("icons/arrow.png"));
	        Image m2 = m1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
	        ImageIcon m3 = new ImageIcon(m2);
	        JLabel m5 = new JLabel(m3);
	        m5.setBounds(05, 0, 50, 50);
	        image.add(m5);
	        
	        
	        m5.addMouseListener(new MouseAdapter() {
	        	
	            @Override

	        public void mouseClicked(MouseEvent e) {
	            	left.setBounds(0, 0, 190, 630); 
	                  
	            }      	

	});
	        
	                
	        
	        JLabel heading = new JLabel("<html><u>Employee Management System</u></html>");
	        heading.setBounds(475, 25, 500, 50);
	        heading.setFont(new Font("Montserrat", Font.BOLD, 32));
	        heading.setForeground(new Color(5, 11, 61));
	        image.add(heading);
	        

	        
	        setSize(1001, 601);
	        setLocation(250, 100);
	        setVisible(true);
	    
	}


}
