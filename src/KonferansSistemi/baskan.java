package KonferansSistemi;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import java.awt.Color;

public class baskan implements ActionListener{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baskan window = new baskan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	*/
	
	JLabel lblNewLabel;
	Panel panel;
	JLabel lblNewLabel_2;
	JTextArea textArea;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JTextArea area;
	
	
	/**
	 * Create the application.
	 */
	public baskan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new Panel();
		panel.setBounds(0, 0, 434, 562);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Ba\u015Fkan Ad,Soyad:");
		lblNewLabel.setBounds(10, 23, 118, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(138, 23, 286, 14);
		panel.add(lblNewLabel_2);
			
		//textArea = new JTextArea();
		//textArea.setLineWrap(true);	
		//textArea.setEditable(true);
		//textArea.setBounds(10, 61, 414, 436);
		//panel.add(textArea);
	    
		
		JPanel f = new JPanel();

	    f.setVisible(false);
	    
	    panel.add(f);
		
		
		
		
		
		btnNewButton = new JButton("Kabul");
		btnNewButton.setBounds(80, 528, 129, 23);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
						
		btnNewButton_1 = new JButton("Deðiþiklik yap");
		btnNewButton_1.setBounds(223, 528, 136, 23);
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
		area = new JTextArea();
		area.setForeground(Color.BLACK);
		
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		
			    JScrollPane scrollPane = new JScrollPane(area);
			    scrollPane.setBounds(20, 58, 391, 450);
			    panel.add(scrollPane);
		
		
		//Buraya ekleme yapabilrsin
		/*
		int dongu = bildiriHakemEsleme.yazarSayisi();
		
		for(int i = 1 ; i<=dongu ; i++)
		{
			
			//System.out.println(bildiriHakemEsleme.konuID1[i][0]);
			//textArea.setText(konuID1[i][c]);
			//konuID1[i][b]
			
			
			
			
		}
			
			*/

		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		
		if(e.getActionCommand().equals(btnNewButton.getText()))
		{
			hakem.bayrak = true;
			
			frame.dispose();
			anaekran b = new anaekran();
			b.frame.setVisible(true);
		}
		
		else if(e.getActionCommand().equals(btnNewButton_1.getText()))
		{
			
		}
		
		
		
		
		
	}
}