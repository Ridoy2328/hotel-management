package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import net.proteanit.sql.DbUtils;

public class CustomerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    CustomerInfo() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel label1 = new JLabel("Document Type");
        label1.setBounds(10, 10, 100, 20);
        add(label1);

        JLabel label2 = new JLabel("Number");
        label2.setBounds(160, 10, 100, 20);
        add(label2);

        JLabel label3 = new JLabel("Gender");
        label3.setBounds(310, 10, 100, 20);
        add(label3);

        JLabel label4 = new JLabel("Country");
        label4.setBounds(410, 10, 100, 20);
        add(label4);

        JLabel label5 = new JLabel("Room Number");
        label5.setBounds(510, 10, 100, 20);
        add(label5);

        JLabel label6 = new JLabel("Checkin time");
        label6.setBounds(610, 10, 100, 20);
        add(label6);

        JLabel label7 = new JLabel("Email");
        label7.setBounds(710, 10, 100, 20);
        add(label7);

        JLabel label8 = new JLabel("Nid");
        label8.setBounds(810, 10, 100, 20);
        add(label8);

        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM Customer");
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
        new CustomerInfo();
    }
}
