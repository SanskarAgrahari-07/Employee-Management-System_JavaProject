package employee.maganement.system;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class Splash extends JFrame implements ActionListener {
		JButton clickhere,clickhere1;
	    
	    Splash() {
	        
	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
	        heading.setBounds(80, 27, 1200, 60);
	        heading.setFont(new Font("serif", Font.PLAIN, 60));
	        heading.setForeground(Color.RED);
	        add(heading);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(1100, 720, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(10, 10, 1100, 720);
	        add(image);
	        
	        
	        clickhere1 = new JButton("Home");
	        clickhere1.setBounds(65, 630, 180, 70);
	        clickhere1.setFont(new Font("serif", Font.PLAIN, 20));
	        clickhere1.setBackground(Color.gray);
	        clickhere1.setForeground(Color.ORANGE);
	        clickhere1.addActionListener(this);
	        image.add(clickhere1);
	        
	        clickhere = new JButton("Manage Employee");
	        clickhere.setBounds(875, 630, 180, 70);
	        clickhere.setFont(new Font("serif", Font.PLAIN, 15));
	        clickhere.setBackground(Color.gray);
	        clickhere.setForeground(Color.ORANGE);
	        clickhere.addActionListener(this);
	        image.add(clickhere);
	        
	        
	        setSize(1120, 740);
	        setLocation(200, 50);
	        setVisible(true);
	        
	        while(true) {
//	            heading.setVisible(false);
	        	heading.setBounds(110, 25, 1200, 60);
	        	heading.setFont(new Font("serif", Font.PLAIN, 40));
	            try {
	                Thread.sleep(100);
	            } catch (Exception e){
	                
	            }
	            
//	            heading.setVisible(true);
	            heading.setBounds(105, 25, 1200, 60);
	            heading.setFont(new Font("serif", Font.PLAIN, 43));
	            try {
	                Thread.sleep(75);
	            } catch (Exception e){
	                
	            }
	            
	            heading.setBounds(100, 25, 1200, 60);
	            heading.setFont(new Font("serif", Font.PLAIN, 46));
	            try {
	                Thread.sleep(75);
	            } catch (Exception e){
	                
	            }
	            
	            heading.setBounds(90, 25, 1200, 60);
	            heading.setFont(new Font("serif", Font.PLAIN, 50));
	            try {
	                Thread.sleep(75);
	            } catch (Exception e){
	                
	            }
	            
	            heading.setBounds(80, 25, 1200, 60);
	            heading.setFont(new Font("serif", Font.PLAIN, 54));
	            try {
	                Thread.sleep(75);
	            } catch (Exception e){
	                
	            }
	            
	            heading.setBounds(70, 25, 1200, 60);
	            heading.setFont(new Font("serif", Font.PLAIN, 60));
	            try {
	                Thread.sleep(2000);
	            } catch (Exception e){
	                
	            }
	        }
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	    	 if (ae.getSource() == clickhere) {
	    		 setVisible(false);
	 	        new Login();
	         } else if (ae.getSource() == clickhere1) {
	             setVisible(false);
	             new Land();
	       
	         }
	    }
	    
	    public static void main(String args[]) {
	        new Splash();
	    }
	}

