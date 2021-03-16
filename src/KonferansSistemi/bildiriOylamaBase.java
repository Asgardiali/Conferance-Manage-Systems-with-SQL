package KonferansSistemi;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class bildiriOylamaBase {

	public static JFrame frame;
	public static JPanel panel;
	//public static JPanel pnl;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bildiriOylamaBase window = new bildiriOylamaBase();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public bildiriOylamaBase() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 157);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg2 = new ButtonGroup();
		ButtonGroup bg3 = new ButtonGroup();
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 118);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		//pnl.add(panel);
		//pnl.setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("Yaz\u0131m Dili:");
		lblNewLabel_1.setBounds(10, 11, 107, 14);
		panel.add(lblNewLabel_1);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setBounds(128, 7, 46, 23);
		panel.add(rdbtnNewRadioButton);	
		JRadioButton radioButton = new JRadioButton("2");
		radioButton.setBounds(182, 7, 46, 23);
		panel.add(radioButton);	
		JRadioButton radioButton_1 = new JRadioButton("3");
		radioButton_1.setBounds(234, 7, 46, 23);
		panel.add(radioButton_1);
		JRadioButton radioButton_2 = new JRadioButton("4");
		radioButton_2.setBounds(293, 7, 46, 23);
		panel.add(radioButton_2);	
		JRadioButton radioButton_3 = new JRadioButton("5");
		radioButton_3.setBounds(351, 7, 46, 23);
		panel.add(radioButton_3);
		bg1.add(rdbtnNewRadioButton);
		bg1.add(radioButton);
		bg1.add(radioButton_1);
		bg1.add(radioButton_2);
		bg1.add(radioButton_3);
		
		JLabel lblBilimselKatks = new JLabel("Bilimsel Katk\u0131s\u0131:");
		lblBilimselKatks.setBounds(10, 51, 107, 14);
		panel.add(lblBilimselKatks);	
		JRadioButton radioButton_4 = new JRadioButton("1");
		radioButton_4.setBounds(128, 47, 46, 23);
		panel.add(radioButton_4);	
		JRadioButton radioButton_5 = new JRadioButton("2");
		radioButton_5.setBounds(182, 47, 46, 23);
		panel.add(radioButton_5);	
		JRadioButton radioButton_6 = new JRadioButton("3");
		radioButton_6.setBounds(234, 47, 46, 23);
		panel.add(radioButton_6);	
		JRadioButton radioButton_7 = new JRadioButton("4");
		radioButton_7.setBounds(293, 47, 46, 23);
		panel.add(radioButton_7);	
		JRadioButton radioButton_8 = new JRadioButton("5");
		radioButton_8.setBounds(351, 47, 46, 23);
		panel.add(radioButton_8);
		bg2.add(radioButton_4);
		bg2.add(radioButton_5);
		bg2.add(radioButton_6);
		bg2.add(radioButton_7);
		bg2.add(radioButton_8);
		
		
		JLabel lblBilimselEtki = new JLabel("Bilimsel Etki:");
		lblBilimselEtki.setBounds(10, 90, 107, 14);
		panel.add(lblBilimselEtki);	
		JRadioButton radioButton_9 = new JRadioButton("1");
		radioButton_9.setBounds(128, 86, 46, 23);
		panel.add(radioButton_9);	
		JRadioButton radioButton_10 = new JRadioButton("2");
		radioButton_10.setBounds(182, 86, 46, 23);
		panel.add(radioButton_10);
		JRadioButton radioButton_11 = new JRadioButton("3");
		radioButton_11.setBounds(234, 86, 46, 23);
		panel.add(radioButton_11);
		JRadioButton radioButton_12 = new JRadioButton("4");
		radioButton_12.setBounds(293, 86, 46, 23);
		panel.add(radioButton_12);	
		JRadioButton radioButton_13 = new JRadioButton("5");
		radioButton_13.setBounds(351, 86, 46, 23);
		panel.add(radioButton_13);
		bg3.add(radioButton_9);
		bg3.add(radioButton_10);
		bg3.add(radioButton_11);
		bg3.add(radioButton_12);
		bg3.add(radioButton_13);
		
		
		
		
	}
}
