package hotel.management.system; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.sql.*; 
import net.proteanit.sql.DbUtils; 
public class Pickup extends JFrame implements ActionListener { 
 JTable table; 
 JButton back, submit; 
 Choice typeofcar; 
 Pickup() { 
 getContentPane().setBackground(Color.WHITE); 
 setLayout(null); 
 JLabel text = new JLabel("Pickup Service"); 
 text.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
 text.setBounds(400, 30, 200, 30); 
 add(text); 
 JLabel lbltypeofcar = new JLabel("Type of Car"); 
 lbltypeofcar.setBounds(50, 100, 100, 20); 
 add(lbltypeofcar); 
 
 typeofcar = new Choice(); 
 typeofcar.setBounds(150, 100, 200, 25); 
 add(typeofcar); 
 
 try{ 
 Conn c = new Conn(); 
 ResultSet rs = c.s.executeQuery("select * from driver"); 
 while(rs.next()){ 
 typeofcar.add(rs.getString("brand")); 
 
 } 
 }catch (Exception e){ 
 e.printStackTrace(); 
 } 
 JLabel label1 = new JLabel("Name"); 
 label1.setBounds(50, 160, 100, 20); 
 add(label1); 
 JLabel label2 = new JLabel("Age"); 
 label2.setBounds(200, 160, 100, 20); 
 add(label2); 
 JLabel label3 = new JLabel("Gender"); 
 label3.setBounds(330, 160, 100, 20); 
 add(label3); 
 JLabel label4 = new JLabel("Company"); 
 label4.setBounds(460, 160, 100, 20); 
 add(label4); 
 JLabel label5 = new JLabel("Brand"); 
 label5.setBounds(630, 160, 1000, 20); 
 add(label5); 
 
 JLabel label6 = new JLabel("Availability"); 
 label6.setBounds(740, 160, 1000, 20); 
 add(label6); 
 
 JLabel label7 = new JLabel("Location"); 
 label7.setBounds(890, 160, 1000, 20); 
 add(label7); 
 table = new JTable(); 
 table.setBounds(0, 200, 1000, 300); 
 add(table); 
 try { 
 Conn c = new Conn(); 
 ResultSet rs = c.s.executeQuery("select * from driver"); 
 table.setModel(DbUtils.resultSetToTableModel(rs)); 
 } catch (Exception e) { 
 e.printStackTrace(); 
 } 
 submit = new JButton("Submit"); 
 submit.setBackground(Color.BLACK); 
 submit.setForeground(Color.WHITE); 
 submit.addActionListener(this); 
 submit.setBounds(300, 520, 120, 30); 
 add(submit); 
 back = new JButton("Back"); 
 back.setBackground(Color.BLACK); 
 back.setForeground(Color.WHITE); 
 back.addActionListener(this); 
 back.setBounds(500, 520, 120, 30); 
 add(back); 
 setBounds(300, 200, 1000, 600); 
 setVisible(true); 
 } 
 public void actionPerformed(ActionEvent ae) { 
 if (ae.getSource() == submit) { 
 try { 
 String query = "select * from driver where brand = '" + typeofcar.getSelectedItem() + "'"; 
 Conn conn = new Conn(); 
 ResultSet rs; 
 rs = conn.s.executeQuery(query); 
 table.setModel(DbUtils.resultSetToTableModel(rs)); 
 } catch (Exception e) { 
 e.printStackTrace(); 
 } 
 } else { 
 setVisible(false); 
 new Reception(); 
 } 
 } 
 public static void main(String[] args) { 
 new Pickup(); 
 } 
} 