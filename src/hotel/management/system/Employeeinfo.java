package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import net.proteanit.sql.DbUtils;

public class EmployeeInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    EmployeeInfo() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel label1 = new JLabel("Name");
        label1.setBounds(40, 10, 100, 20);
        add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(170, 10, 100, 20);
        add(label2);

        JLabel label3 = new JLabel("Gender");
        label3.setBounds(290, 10, 100, 20);
        add(label3);

        JLabel label4 = new JLabel("Job");
        label4.setBounds(400, 10, 100, 20);
        add(label4);

        JLabel label5 = new JLabel("Salary");
        label5.setBounds(540, 10, 100, 20);
        add(label5);

        JLabel label6 = new JLabel("Phone");
        label6.setBounds(670, 10, 100, 20);
        add(label6);

        JLabel label7 = new JLabel("Email");
        label7.setBounds(790, 10, 100, 20);
        add(label7);

        JLabel label8 = new JLabel("Nid");
        label8.setBounds(910, 10, 100, 20);
        add(label8);

        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(420, 500, 120, 30);
        add(back);

        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();
    }

    public static void main(String[] args) {
        new EmployeeInfo();
    }
}
