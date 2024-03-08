package employee.maganement.system;

import java.awt.event.*;
import javax.swing.*; 
import java.awt.*;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Land extends JFrame{
	public Land() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("icons/mainhome.jpg"));
		lblNewLabel.setBounds(6, 10, 1290, 815);
		add(lblNewLabel);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/mainadmin.png"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(1120, 1, 120, 120);
        lblNewLabel.add(image1);
        

		
        image1.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

            	setVisible(false);
                new Login();

            }

        });
        
        setSize(1295, 835);
        setLocation(200, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Land();

	}

}
