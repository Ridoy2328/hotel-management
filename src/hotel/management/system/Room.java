package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import net.proteanit.sql.DbUtils;

public class Room extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    Room() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 0, 600, 600);
        add(image);

        JLabel label1 = new JLabel("Room Number");
        label1.setBounds(10, 10, 100, 20);
        add(label1);

        JLabel label2 = new JLabel("Availability");
        label2.setBounds(120, 10, 100, 20);
        add(label2);

        JLabel label3 = new JLabel("Status");
        label3.setBounds(230, 10, 100, 20);
        add(label3);

        JLabel label4 = new JLabel("Price");
        label4.setBounds(330, 10, 100, 20);
        add(label4);

        JLabel label5 = new JLabel("Bed Type");
        label5.setBounds(410, 10, 100, 20);
        add(label5);

        table = new JTable();
        table.setBounds(0, 40, 500, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from room");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(200, 500, 120, 30);
        add(back);

        setBounds(300, 200, 1050, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();
    }

    public static void main(String[] args) {
        new Room();
    }
}
