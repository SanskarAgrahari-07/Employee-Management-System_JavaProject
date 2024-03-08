package employee.maganement.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame implements ActionListener{

 Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(880, 680, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 880, 680); 
        add(background);
        
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 28));
        heading.setForeground(Color.ORANGE);
        background.add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 22)); 
        labelname.setForeground(Color.BLACK);
        background.add(labelname);
        
        tfname = new JTextField(); 
        tfname.setBounds(200, 150, 160, 30);
        tfname.setFont(new Font("serif", Font.PLAIN, 22)); 
        tfname.setForeground(Color.BLACK);
        background.add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(410, 150, 180, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 22));
        labelfname.setForeground(Color.BLACK);
        background.add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(605, 150, 160, 30);
        tffname.setFont(new Font("serif", Font.PLAIN, 22));
        tffname.setForeground(Color.BLACK);
        background.add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 22));
        labeldob.setForeground(Color.BLACK);
        background.add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 160, 30);
        dcdob.setFont(new Font("serif", Font.PLAIN, 22));
        dcdob.setForeground(Color.BLACK);
        background.add(dcdob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(410, 200, 180, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 22));
        labelsalary.setForeground(Color.BLACK);
        background.add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(605, 200, 160, 30);
        tfsalary.setFont(new Font("serif", Font.PLAIN, 22));
        tfsalary.setForeground(Color.BLACK);
        background.add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 22));
        labeladdress.setForeground(Color.BLACK);
        background.add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 160, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 22));
        labeladdress.setForeground(Color.BLACK);
        background.add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(410, 250, 180, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 22));
        labelphone.setForeground(Color.BLACK);
        background.add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(605, 250, 160, 30);
        tfphone.setFont(new Font("serif", Font.PLAIN, 22));
        tfphone.setForeground(Color.BLACK);
        background.add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 22));
        labelemail.setForeground(Color.BLACK);
        background.add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 160, 30);
        tfemail.setFont(new Font("serif", Font.PLAIN, 22));
        tfemail.setForeground(Color.BLACK);
        background.add(tfemail);
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(410, 300, 180, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 22));
        labeleducation.setForeground(Color.BLACK);
        background.add(labeleducation);
        
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(605, 300, 160, 30);
        cbeducation.setFont(new Font("serif", Font.PLAIN, 20));
        cbeducation.setForeground(Color.BLACK);
        background.add(cbeducation);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 22));
        labeldesignation.setForeground(Color.BLACK);
        background.add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 160, 30);
        tfdesignation.setFont(new Font("serif", Font.PLAIN, 22));
        tfdesignation.setForeground(Color.BLACK);
        background.add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(410, 350, 180, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 22));
        labelaadhar.setForeground(Color.BLACK);
        background.add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(605, 350, 160, 30);
        tfaadhar.setFont(new Font("serif", Font.PLAIN, 22));
        tfaadhar.setForeground(Color.BLACK);
        background.add(tfaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 22));
        labelempId.setForeground(Color.BLACK);
        background.add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 22));
        lblempId.setForeground(Color.BLACK); 
        background.add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        background.add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        background.add(back);
        
        setSize(880, 680);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
		new AddEmployee();
	}

}
