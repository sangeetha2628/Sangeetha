import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DistanceCalculator {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceCalculator window = new DistanceCalculator();
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
	public DistanceCalculator() {
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
		
		JLabel lbl = new JLabel("Distance Calculator");
		lbl.setBounds(194, 38, 92, 14);
		frame.getContentPane().add(lbl);
		
		JLabel lbl2 = new JLabel("Source");
		lbl2.setBounds(106, 79, 46, 14);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("Destination");
		lbl3.setBounds(106, 128, 64, 14);
		frame.getContentPane().add(lbl3);
		
		tf1 = new JTextField();
		tf1.setBounds(212, 76, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(212, 125, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lbl4 = new JLabel("Distance Covered");
		lbl4.setBounds(106, 176, 92, 14);
		frame.getContentPane().add(lbl4);
		
		tf3 = new JTextField();
		tf3.setBounds(212, 173, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JButton bt = new JButton("Calculate");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String source=tf1.getText();
				String destination=tf2.getText();
				double dis =2.3;
				int stops=57;
				double mil = dis*stops;
				tf3.setText(String.valueOf(mil));
				
			}
		});
		bt.setBounds(170, 211, 89, 23);
		frame.getContentPane().add(bt);
	}
}
