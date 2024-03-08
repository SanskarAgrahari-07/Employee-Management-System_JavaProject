package employee.maganement.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JLabel lblempId;
    JButton add, back;
    String empId;
    
    UpdateEmployee(String empId) {
    	setLayout(null);
    	
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 900, 700); 
        add(background);
        
        
        this.empId = empId;
        
        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 28));
        heading.setForeground(Color.ORANGE);
        background.add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 165, 35);
        labelname.setFont(new Font("serif", Font.PLAIN, 22)); 
        labelname.setForeground(Color.BLACK);
        background.add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(215, 150, 180 , 35);
        lblname.setFont(new Font("serif", Font.PLAIN, 22)); 
        lblname.setForeground(Color.BLACK);
        background.add(lblname);
        
        JLabel labelfname = new JLabel("Father's Name"); 
        labelfname.setBounds(430, 150, 180, 35);
        labelfname.setFont(new Font("serif", Font.PLAIN, 22));
        labelfname.setForeground(Color.BLACK);
        background.add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(640, 150, 185 , 35);
        tffname.setFont(new Font("serif", Font.PLAIN, 22));
        tffname.setForeground(Color.BLACK);
        background.add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 210, 165, 35);
        labeldob.setFont(new Font("serif", Font.PLAIN, 22));
        labeldob.setForeground(Color.BLACK);
        background.add(labeldob);
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(215, 210, 180, 35);
        lbldob.setFont(new Font("serif", Font.PLAIN, 22));
        lbldob.setForeground(Color.BLACK);
        background.add(lbldob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(430, 210, 180, 35);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 22));
        labelsalary.setForeground(Color.BLACK);
        background.add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(640, 210, 185, 35);
        tfsalary.setFont(new Font("serif", Font.PLAIN, 22));
        tfsalary.setForeground(Color.BLACK);
        background.add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 270, 165, 35);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 22));
        labeladdress.setForeground(Color.BLACK);
        background.add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(215, 270, 180, 35);
        tfaddress.setFont(new Font("serif", Font.PLAIN, 22));
        tfaddress.setForeground(Color.BLACK);
        background.add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(430, 270, 180, 35);
        labelphone.setFont(new Font("serif", Font.PLAIN, 22));
        labelphone.setForeground(Color.BLACK);
        background.add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(640, 270, 185, 35);
        tfphone.setFont(new Font("serif", Font.PLAIN, 22));
        tfphone.setForeground(Color.BLACK);
        background.add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 330 , 165, 35);
        labelemail.setFont(new Font("serif", Font.PLAIN, 22));
        labelemail.setForeground(Color.BLACK);
        background.add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(215, 330, 180, 35);
        tfemail.setFont(new Font("serif", Font.PLAIN, 22));
        tfemail.setForeground(Color.BLACK);
        background.add(tfemail);
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(430, 330, 180, 35);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 22));
        labeleducation.setForeground(Color.BLACK);
        background.add(labeleducation);
        
        tfeducation = new JTextField();
        tfeducation.setBounds(640, 330, 185, 35);
        tfeducation.setFont(new Font("serif", Font.PLAIN, 22));
        tfeducation.setForeground(Color.BLACK);
        background.add(tfeducation);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 390, 165, 35);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 22));
        labeldesignation.setForeground(Color.BLACK);
        background.add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(215, 390, 180, 35);
        tfdesignation.setFont(new Font("serif", Font.PLAIN, 22));
        tfdesignation.setForeground(Color.BLACK);
        background.add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(430, 390, 180, 35);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 22));
        labelaadhar.setForeground(Color.BLACK);
        background.add(labelaadhar);
        
        JLabel lblaadhar = new JLabel(); 
        lblaadhar.setBounds(640, 390, 185, 35);
        lblaadhar.setFont(new Font("serif", Font.PLAIN, 22));
        lblaadhar.setForeground(Color.BLACK);
        background.add(lblaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 450, 165, 35);
        labelempId.setFont(new Font("serif", Font.PLAIN, 22));
        labelempId.setForeground(Color.BLACK);
        background.add(labelempId);
        
        lblempId = new JLabel();
        lblempId.setBounds(215, 450 , 165, 35);
        lblempId.setFont(new Font("serif", Font.PLAIN, 22));
        lblempId.setForeground(Color.BLACK);
        background.add(lblempId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add = new JButton("Update Details");
        add.setBounds(250, 560, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        background.add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 560, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        background. add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new UpdateEmployee("");
	}

}
