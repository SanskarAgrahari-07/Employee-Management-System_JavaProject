package employee.maganement.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import java.awt.*;

public class Login extends JFrame implements ActionListener{

	 JTextField tfusername, tfpassword;
	 public static String main_username;
	    
	    Login() {
	        
	        getContentPane().setBackground(new Color(222,220,220));
	        setLayout(null);
	        
	        JLabel lblusername = new JLabel("USERNAME :");
	        lblusername.setBounds(40, 50, 110, 30);
	        lblusername.setFont(new Font("serif", Font.BOLD, 17));
	        add(lblusername);
	             tfusername = new JTextField();
	        tfusername.setBounds(160, 50, 150, 30);
	        add(tfusername);
	        
	        JLabel lblpassword = new JLabel("PASSWORD :");
	        lblpassword.setBounds(40, 100, 110, 30);
	        lblpassword.setFont(new Font("serif", Font.BOLD, 17));
	        add(lblpassword);
	        
	        tfpassword = new JTextField();
	        tfpassword.setBounds(160, 100, 150, 30);
	        add(tfpassword);
	        
	        JButton login = new JButton("LOGIN");
	        login.setBounds(150, 170, 150, 30);
	        login.setBackground(Color.BLACK);
	        login.setForeground(Color.WHITE);
	        login.addActionListener(this);
	        add(login);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(350, 13, 200, 200);
	        image.setBackground(new Color(222,220,220));
	        add(image);
	        
	        setSize(590, 280);
	        setLocation(450, 200);
	        setVisible(true);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
            main_username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+main_username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
            	setVisible(false);
            	if(main_username.equals("admin")) {
                    new Home();
            	}
            	else if(main_username.equals("staff")) {
                    new Home_staff();
            	}
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
                new Land();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
