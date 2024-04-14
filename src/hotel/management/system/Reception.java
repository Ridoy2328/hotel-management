package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Reception extends JFrame implements ActionListener{
    JButton newCustomer;
    Reception(){
      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        JButton rooms = new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        add(rooms);
        
        JButton department = new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        add(department);
        
         JButton allEmployee = new JButton("All Employees");
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        add(allEmployee);
        
         JButton customers = new JButton("Customer Info");
        customers.setBounds(10, 190, 200, 30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.WHITE);
        add(customers);
        
        JButton manager = new JButton("Manger Info");
        manager.setBounds(10, 230, 200, 30);
        manager.setBackground(Color.BLACK);
        manager.setForeground(Color.WHITE);
        add(manager);
        
        JButton checkout = new JButton("Check-Out");
        checkout.setBounds(10, 270, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(checkout);
        
        JButton update = new JButton("Update Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        add(update);
        
        JButton roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        add(roomStatus);
        
        JButton pickup = new JButton("Pickup Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        add(pickup);
        
        JButton search = new JButton("Search Room");
        search.setBounds(10, 430, 200, 30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        add(search);
        
        JButton logout = new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);
        
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == newCustomer){
            setVisible(false);
            new AddCustomer();
        }
    }
    public static void main(String[] args) {

}
}


