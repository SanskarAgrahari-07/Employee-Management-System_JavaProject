package employee.maganement.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
// import net.proteanit.sql.DbUtils;
import java.awt.event.*;



public class ViewEmployee extends JFrame implements ActionListener {

    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;
    
    ViewEmployee() {
        
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        Image i2 = i1.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background1 = new JLabel(i3);
        background1.setBounds(0, 0, 950, 700); 
        add(background1);
        
        
        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(20, 35, 180, 25);
        searchlbl.setForeground(Color.ORANGE);
        searchlbl.setFont(new Font("Arial", Font.BOLD, 16));
        background1.add(searchlbl);
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(220, 35, 160, 25);
        background1.add(cemployeeId);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while(rs.next()) {
                cemployeeId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            // table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds( 25, 155, 850, 400);
        background1.add(jsp); 
        
        search = new JButton("Search");
        search.setBounds(20, 90, 90, 30);
        search.setFont(new Font("Arial", Font.ITALIC , 15));
        search.addActionListener(this);
        background1.add(search);
        
        print = new JButton("Print");
        print.setBounds(130, 90, 90, 30);
        print.setFont(new Font("Arial", Font.ITALIC , 15));
        print.addActionListener(this);
        background1.add(print);
        
        update = new JButton("Update");
        update.setBounds(240, 90, 90, 30);
        update.setFont(new Font("Arial", Font.ITALIC , 15));
        update.addActionListener(this);
        background1.add(update);
        
        back = new JButton("Back");
        back.setBounds(340, 90, 90, 30);
        back.setFont(new Font("Arial", Font.ITALIC , 15));
        back.addActionListener(this);
        background1.add(back);
        
        setSize(950, 700);
        setLocation(300, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from employee where empId = '"+cemployeeId.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                // table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
        	if(Login.main_username.equals("admin")) {
        		setVisible(false);
                new UpdateEmployee(cemployeeId.getSelectedItem());
        	}
        	else {
         		JOptionPane.showMessageDialog(null,"Requires ADMIN Login");  
        	}	     
        } else {
            setVisible(false);
            new Home();
        }
    }

	public static void main(String[] args) {
		
		new ViewEmployee();
	}

}
