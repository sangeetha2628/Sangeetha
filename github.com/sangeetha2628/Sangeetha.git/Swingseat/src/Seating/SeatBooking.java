package Seating;


import java.awt.BorderLayout;  
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import java.awt.List;
//import com.toedter.calendar.JCalendar;
//import com.toedter.calendar.JDateChooser;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class SeatBooking extends JFrame {

	private JPanel contentPane;
	private JTextField no1;
	private JTextField tf1;
	private JTextField no2;
	private JTextField tf2;
	private JTable table_2;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatBooking sb = new SeatBooking();
					sb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SeatBooking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 860);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel db = new JPanel();
		contentPane.add(db, BorderLayout.CENTER);
		db.setLayout(null);
		
		JCheckBox c1 = new JCheckBox("");
		c1.setBounds(79, 67, 26, 23);
		c1.setBackground(Color.WHITE);
		db.add(c1);
		
		JCheckBox c2 = new JCheckBox("");
		c2.setBounds(107, 67, 19, 23);
		c2.setBackground(Color.WHITE);
		db.add(c2);
		
		JCheckBox c3 = new JCheckBox("");
		c3.setBounds(79, 93, 26, 23);
		c3.setBackground(Color.WHITE);
		db.add(c3);
		
		JCheckBox c4 = new JCheckBox("");
		c4.setBounds(107, 93, 19, 23);
		c4.setBackground(Color.WHITE);
		db.add(c4);
		
		JCheckBox c5 = new JCheckBox("");
		c5.setBounds(79, 119, 19, 23);
		c5.setBackground(Color.WHITE);
		db.add(c5);
		
		JCheckBox c7 = new JCheckBox("");
		c7.setBounds(79, 144, 26, 23);
		c7.setBackground(Color.WHITE);
		db.add(c7);
		
		JCheckBox c6 = new JCheckBox("");
		c6.setBounds(107, 119, 19, 23);
		c6.setBackground(Color.WHITE);
		db.add(c6);
		
		JLabel lb2 = new JLabel("Seats Available");
		lb2.setBounds(64, 30, 100, 14);
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		db.add(lb2);
		
		JLabel lb1 = new JLabel("BOOKING TICKETS");
		lb1.setBounds(344, 11, 172, 14);
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(lb1);
		
		JLabel lb3 = new JLabel("BOOKING DETAIL");
		lb3.setBounds(252, 31, 137, 14);
		lb3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(lb3);
		
		JLabel lb4 = new JLabel("Name");
		lb4.setBounds(252, 67, 46, 14);
		lb4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(lb4);
		
		JLabel lb5 = new JLabel("Date of Birth");
		lb5.setBounds(252, 93, 108, 14);
		lb5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		db.add(lb5);
		
		JCheckBox po = new JCheckBox("Disabled");
		po.setBounds(252, 119, 194, 23);
		po.setFont(new Font("Times New Roman", Font.BOLD, 14));
		db.add(po);
		
		no1 = new JTextField();
		no1.setBounds(252, 148, 86, 20);
		db.add(no1);
		no1.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setBounds(370, 67, 108, 20);
		db.add(tf1);
		tf1.setColumns(10);
		
		JLabel lb6 = new JLabel("Name");
		lb6.setBounds(252, 237, 46, 14);
		lb6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(lb6);
		
		JLabel lb7 = new JLabel("Date of Birth");
		lb7.setBounds(252, 262, 86, 14);
		lb7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(lb7);
		
		JCheckBox pop = new JCheckBox("Disabled");
		pop.setBounds(252, 289, 204, 23);
		pop.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(pop);
		
		no2 = new JTextField();
		no2.setBounds(252, 319, 86, 20);
		db.add(no2);
		no2.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(360, 235, 118, 20);
		db.add(tf2);
		tf2.setColumns(10);
		
		table_2 = new JTable();
		table_2.setBounds(228, 215, 1, 1);
		db.add(table_2);
		
		JLabel l1 = new JLabel("Price");
		l1.setBounds(569, 50, 55, 23);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(l1);
		
		JLabel l2 = new JLabel("Not");
		l2.setBounds(569, 93, 46, 14);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(l2);
		
		JLabel l3 = new JLabel("Total");
		l3.setBounds(569, 128, 55, 14);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(l3);
		
		JLabel l4 = new JLabel("Discounts");
		l4.setBounds(569, 168, 94, 14);
		l4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(l4);
		
		JLabel l5 = new JLabel("Gst");
		l5.setBounds(569, 202, 46, 14);
		l5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(l5);
		
		JLabel l6 = new JLabel("Net Price");
		l6.setBounds(569, 263, 94, 14);
		l6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(l6);
		
		t1 = new JTextField();
		t1.setBounds(673, 52, 86, 20);
		db.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(673, 93, 86, 20);
		t2.setColumns(10);
		db.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(673, 122, 86, 20);
		t3.setColumns(10);
		db.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(673, 162, 86, 20);
		t4.setColumns(10);
		db.add(t4);
		
		t5 = new JTextField();
		t5.setBounds(673, 200, 86, 20);
		t5.setColumns(10);
		db.add(t5);
		
		t6 = new JTextField();
		t6.setBounds(673, 260, 86, 20);
		t6.setColumns(10);
		db.add(t6);
		
		JButton but = new JButton("Display");
		but.setBounds(632, 337, 89, 23);
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sel=null,sel1=null;
				int count=0;
				if(c1.isSelected())
				{
					sel="Seat NO : 1";
					count++;
					
				}
				 if(c2.isSelected())
				{
					sel1="Seat NO : 2";
					count++;
				}
				 
				if(c3.isSelected())
				{
					sel1="Seat NO : 3";
					count++;
				}
				else if(c4.isSelected())
				{
					sel1="Seat NO : 4";
					count++;
				}
				else if(c5.isSelected())
				{
					sel1="Seat NO : 5";
					count++;
				}
				else if(c6.isSelected())
				{
					sel1="Seat NO : 6";
					count++;
				}
				else if(c7.isSelected())
				{
					sel1="Seat NO : 7";
					count++;
				}
				else
					
				{
					sel1="Seat NO : 8";
					count++;
				}
				String name1=tf1.getText();
				String name2=tf2.getText();
				no1.setText(sel);
				no2.setText(sel1);
				tf1.setText(name1);     
				tf2.setText(name2);
				float co=Float.parseFloat(t1.getText());
				t2.setText(String.valueOf(count)); 
				Float to=co*(float)count;
				t3.setText(String.valueOf(to));    
				float disc=Float.parseFloat(t4.getText());
				float gis=Float.parseFloat(t5.getText());
				float fi=to-disc+gis;
				t6.setText(String.valueOf(fi));
				JOptionPane.showMessageDialog(null, "Thanks for Booking!!!\nHave a Safe and Wonderful Journey");
			}
		});
		but.setBackground(Color.BLUE);
		but.setForeground(Color.BLACK);
		but.setFont(new Font("Times New Roman", Font.BOLD, 15));
		db.add(but);		
		JCheckBox c8 = new JCheckBox("");
		c8.setBounds(107, 145, 19, 23);
		c8.setBackground(Color.WHITE);
		db.add(c8);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(107, 147, 19, 23);
		checkBox_1.setBackground(Color.WHITE);
		db.add(checkBox_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(370, 96, 91, 20);
		db.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(370, 262, 91, 20);
		db.add(dateChooser_1);
		
		table = new JTable();
		table.setBounds(497, 183, -268, -127);
		db.add(table);
	}
}