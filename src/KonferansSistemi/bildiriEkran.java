package KonferansSistemi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class bildiriEkran implements ActionListener {

	public JFrame frame;
	
	ButtonGroup bg1,bg2,bg3;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bildiriEkran window = new bildiriEkran();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	
	
	JPanel panel;
	JLabel lblNewLabel_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton radioButton;
	JLabel lblBilimselKatks;
	JRadioButton radioButton_1;
	JLabel lblBilimselEtki;
	JRadioButton radioButton_2;
	JRadioButton radioButton_3;
	JRadioButton radioButton_4;
	JRadioButton radioButton_5;
	JRadioButton radioButton_6;
	JRadioButton radioButton_7;
	JRadioButton radioButton_8;
	JRadioButton radioButton_9;
	JRadioButton radioButton_10;
	JRadioButton radioButton_11;
	JRadioButton radioButton_12;
	JRadioButton radioButton_13;
	JButton btnNewButton;
	static JTextArea textArea;
	
	
	
	
	/**
	 * Create the application.
	 */
	public bildiriEkran() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
		bg3 = new ButtonGroup();
			
		
		panel = new JPanel();
		panel.setBounds(0, 0, 359, 231);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Yazým Dili:");
		lblNewLabel_1.setBounds(23, 73, 73, 14);
		panel.add(lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setBounds(102, 66, 46, 23);
		panel.add(rdbtnNewRadioButton);
		
		radioButton = new JRadioButton("1");
		radioButton.setBounds(102, 105, 46, 23);
		panel.add(radioButton);
		
		lblBilimselKatks = new JLabel("Bilimsel Katký:");
		lblBilimselKatks.setBounds(23, 112, 73, 14);
		panel.add(lblBilimselKatks);
		
		radioButton_1 = new JRadioButton("1");
		radioButton_1.setBounds(102, 141, 46, 23);
		panel.add(radioButton_1);
		
		lblBilimselEtki = new JLabel("Bilimsel Etki:");
		lblBilimselEtki.setBounds(23, 148, 73, 14);
		panel.add(lblBilimselEtki);
		
		radioButton_2 = new JRadioButton("2");
		radioButton_2.setBounds(150, 66, 46, 23);
		panel.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("2");
		radioButton_3.setBounds(150, 105, 46, 23);
		panel.add(radioButton_3);
		
		radioButton_4 = new JRadioButton("2");
		radioButton_4.setBounds(150, 141, 46, 23);
		panel.add(radioButton_4);
		
		radioButton_5 = new JRadioButton("3");
		radioButton_5.setBounds(198, 66, 46, 23);
		panel.add(radioButton_5);
		
		radioButton_6 = new JRadioButton("3");
		radioButton_6.setBounds(198, 105, 46, 23);
		panel.add(radioButton_6);
		
		radioButton_7 = new JRadioButton("3");
		radioButton_7.setBounds(198, 141, 46, 23);
		panel.add(radioButton_7);
		
		radioButton_8 = new JRadioButton("4");
		radioButton_8.setBounds(246, 66, 46, 23);
		panel.add(radioButton_8);
		
		radioButton_9 = new JRadioButton("4");
		radioButton_9.setBounds(246, 105, 46, 23);
		panel.add(radioButton_9);
		
		radioButton_10 = new JRadioButton("4");
		radioButton_10.setBounds(246, 141, 46, 23);
		panel.add(radioButton_10);
		
		radioButton_11 = new JRadioButton("5");
		radioButton_11.setBounds(294, 66, 46, 23);
		panel.add(radioButton_11);
		
		radioButton_12 = new JRadioButton("5");
		radioButton_12.setBounds(294, 105, 46, 23);
		panel.add(radioButton_12);
		
		radioButton_13 = new JRadioButton("5");
		radioButton_13.setBounds(294, 141, 46, 23);
		panel.add(radioButton_13);
		
		btnNewButton = new JButton("Gönder");
		btnNewButton.setBounds(139, 185, 89, 23);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 339, 51);
		panel.add(textArea);
		
		bg1.add(rdbtnNewRadioButton);
		bg1.add(radioButton_2);
		bg1.add(radioButton_5);
		bg1.add(radioButton_8);
		bg1.add(radioButton_11);
		
		bg2.add(radioButton);
		bg2.add(radioButton_3);
		bg2.add(radioButton_6);
		bg2.add(radioButton_9);
		bg2.add(radioButton_12);
		
		bg3.add(radioButton_1);
		bg3.add(radioButton_4);
		bg3.add(radioButton_7);
		bg3.add(radioButton_10);
		bg3.add(radioButton_13);
		
		bildiriYansit();
		
		
	}

	public static int gecerlibildiri;
	public static int hakemindis;
	public static int ekleme;
	
	public void bildiriYansit()
	{
		gecerlibildiri = taslakFrame.gecerliBildiriSayfasi;
		ekleme = taslakFrame.hakemBildiriSayisi/2;
		hakemindis = taslakFrame.hakemindex;
		
		sqlYazarBilgisiGir yazarBildiri=new sqlYazarBilgisiGir();
		
		String[] bildiriBilgi=yazarBildiri.sqlYazarBilgiGetir(Integer.parseInt(anaekran.sonucKonuID[hakemindis][gecerlibildiri]));
		
		textArea.setText(bildiriBilgi[5]);
		
		System.out.println("***"+ekleme);
		System.out.println(gecerlibildiri);
	
		
	}
		
	public static void tekrar()
	{
		hakemindis = taslakFrame.hakemindex;
		ekleme = taslakFrame.hakemBildiriSayisi/2;
		
	/*	for(int i=0;i<hakemBildiriEsleme.hakemSayisi();i++) {
			
			for(int j=0;j<hakemBildiriEsleme.yazarSayisi();j++) {
				
				if(hakemBildiriEsleme.konuID1[j][i].equals(" ")) {
					System.out.println("boþ");
					System.out.println("****************");
				
			}
				
			}
			
			
			
			
		}
		*/
		
		
		sqlYazarBilgisiGir yazarBildiri1=new sqlYazarBilgisiGir();
		
		String[] bildiriBilgi1=yazarBildiri1.sqlYazarBilgiGetir(Integer.parseInt(anaekran.sonucKonuID[hakemindis][gecerlibildiri]));
		
		String ptr = null; 
				
		textArea.setText(bildiriBilgi1[5]);
		
		System.out.println("***"+ekleme);
		System.out.println(gecerlibildiri);
		
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals(btnNewButton.getText()))
		{
			int sonuc1 = 0,sonuc2 = 0,sonuc3 = 0;
			
			if(rdbtnNewRadioButton.isSelected())
			{
				sonuc1 = Integer.parseInt(rdbtnNewRadioButton.getText());
			}
			else if(radioButton_2.isSelected())
			{
				sonuc1 = Integer.parseInt(radioButton_2.getText());
			}
			else if(radioButton_5.isSelected())
			{
				sonuc1 = Integer.parseInt(radioButton_5.getText());
			}
			else if(radioButton_8.isSelected())
			{
				sonuc1 = Integer.parseInt(radioButton_8.getText());
			}
			else if(radioButton_11.isSelected())
			{
				sonuc1 = Integer.parseInt(radioButton_11.getText());
			}
			
			
			
			
			if(radioButton.isSelected())
			{
				sonuc2 = Integer.parseInt(radioButton.getText());
			}
			else if(radioButton_3.isSelected())
			{
				sonuc2 = Integer.parseInt(radioButton_3.getText());
			}
			else if(radioButton_6.isSelected())
			{
				sonuc2 = Integer.parseInt(radioButton_6.getText());
			}
			else if(radioButton_9.isSelected())
			{
				sonuc2 = Integer.parseInt(radioButton_9.getText());
			}
			else if(radioButton_12.isSelected())
			{
				sonuc2 = Integer.parseInt(radioButton_12.getText());
			}
			
			
			
			if(radioButton_1.isSelected())
			{
				sonuc3 = Integer.parseInt(radioButton_1.getText());
			}
			else if(radioButton_4.isSelected())
			{
				sonuc3 = Integer.parseInt(radioButton_4.getText());
			}
			else if(radioButton_7.isSelected())
			{
				sonuc3 = Integer.parseInt(radioButton_7.getText());
			}
			else if(radioButton_10.isSelected())
			{
				sonuc3 = Integer.parseInt(radioButton_10.getText());
			}
			else if(radioButton_13.isSelected())
			{
				sonuc3 = Integer.parseInt(radioButton_13.getText());
			}
			
			float total = sonuc1+sonuc2+sonuc3;
			
			total = total / 3.0f;
			
			//System.out.println(total);
			
			if(anaekran.sonucKonuID[hakemindis][gecerlibildiri+ekleme]==null) {
				anaekran.sonucKonuID[hakemindis][gecerlibildiri+ekleme]="bos";
			}
			anaekran.sonucKonuID[hakemindis][gecerlibildiri+ekleme] = String.valueOf(total);
			
			
/*			for(int i=1;i<=hakemindis;i++) {
				
				for(int j=1;j<=geceli
			}
			
			*/
			if(gecerlibildiri < ekleme)
			{
				//System.out.println(anaekran.sonucKonuID[hakemindis][gecerlibildiri]);
				
				gecerlibildiri++;
				tekrar();
				
				
			}

			else
			{
				ekleme = 0;
				gecerlibildiri = 1;
				JOptionPane.showMessageDialog(frame, "Teþekkürler Deðerlendirme Tamamlandý...", "Info", JOptionPane.INFORMATION_MESSAGE);
				//sql
				frame.dispose();
				anaekran b = new anaekran();
				b.frame.setVisible(true);
				
			}
				
			
			
		}
		
		
		
		
		
	}
	

	
	
	
}

