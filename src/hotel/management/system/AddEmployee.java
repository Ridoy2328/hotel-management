package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame{
    AddEmployee(){
        setLayout(null);
        
        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60, 30, 120, 30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblname);
        
        JTextField tfname = new JTextField();
        tfname.setBounds(200, 30, 150,30);
        add(tfname);
        
        JLabel lblage = new JLabel("AGE");
        lblage.setBounds(60, 80, 120, 30);
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblage);
        
        JTextField tfage = new JTextField();
        tfage.setBounds(200, 80, 150,30);
        add(tfage);
        
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(60, 130, 120, 30);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblgender);
        
        JRadioButton rbmale = new JRadioButton("Male");
        rbmale.setBounds(200, 130, 70, 30);
        rbmale.setFont(new Font("Tahoma",Font.PLAIN, 14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
          JRadioButton rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(280, 130, 70, 30);
        rbfemale.setFont(new Font("Tahoma",Font.PLAIN, 14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        
        JLabel lbljob = new JLabel("JOB");
        lbljob.setBounds(60, 180, 120, 30);
        lbljob.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbljob);
        
        String str[]={"Front Desk Receiptionist", "Porter", "Housekeeper", "Kitchen Staff", "Room Service", "Chef", "Waiter/Waitress", "Manager", "Cashier"};
        
        JComboBox cbjob = new JComboBox(str);
        cbjob.setBounds(200, 180, 150, 30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);
            
        JLabel lblsalary = new JLabel("SALARY");
        lblsalary.setBounds(60, 230, 120, 30);
        lblsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblsalary);
        
        JTextField tfsalary = new JTextField();
        tfsalary.setBounds(200, 230, 150,30);
        add(tfsalary);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 850, 540);
        setVisible(true);
    }
    public static void main(String[] args){
        new AddEmployee();
    }
}
