import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiscountCalculation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscountCalculation window = new DiscountCalculation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiscountCalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl = new JLabel("Discount Calculator");
		lbl.setBounds(179, 35, 105, 14);
		frame.getContentPane().add(lbl);
		
		JLabel lbl2 = new JLabel("Principal amount");
		lbl2.setBounds(78, 86, 90, 14);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("Discount percentage");
		lbl3.setBounds(78, 126, 105, 14);
		frame.getContentPane().add(lbl3);
		
		textField = new JTextField();
		textField.setBounds(231, 83, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 123, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton bt = new JButton("calculate");
		bt.setBounds(163, 164, 89, 23);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double c=Integer.parseInt(textField.getText());
			double per=Integer.parseInt(textField_1.getText());
			double d=c*(per/100);
			double ans=c-d;
			int answer=((int)ans);
			
			t1.setText(""+answer);
			
			
			
			
			
			
			}
		});
		frame.getContentPane().add(bt);
		
		JLabel lb4 = new JLabel("Net price");
		lb4.setBounds(78, 214, 46, 14);
		frame.getContentPane().add(lb4);
		
		t1 = new JTextField();
		t1.setBounds(231, 211, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
	}
}
