package KonferansSistemi;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class yazar implements ActionListener{

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JButton btnNewButton; 
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yazar window = new yazar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	Panel panel;
	JLabel ad;
	JLabel add;
	JLabel soyad;
	JLabel soyadd;
	JLabel mail;
	JLabel lblniversitekurum;
	JLabel lblBildiriBal;
	JLabel lblBildirizeti;
	JTextArea textArea;
	JLabel lblAnahtarKelimeler;
	JLabel lblBildirininGrupKonular;
	JLabel lblBildiri;
	JTextArea textArea_1;
	JButton button;
	JLabel yazartelefon;
	
	String Mail;
	String telefon;
	String yer;
	String bildiri_basligi;
	String bildiri_ozeti;
	String anahtar_kelimeler;
	String grup_konulari;
	String bildiri;
	
	JRadioButton chckbxElektrik;
	JRadioButton chckbxKontrol;
	JRadioButton chckbxAstrofizik;
	JRadioButton chckbxTp;
	JRadioButton chckbxFizik;
	JRadioButton chckbxElektronik;
	JRadioButton chckbxBiyomedikal;
	JRadioButton chckbxProgramlama;
	JRadioButton chckbxKimya;
	JRadioButton chckbxMatematik;
	JRadioButton chckbxMekanikDizayn;
	JRadioButton chckbxTelekominikasyon;
	
	
	
	String elektrik,elektronik,biyomedikal,programlama,kontrol,fizik,kimya,matematik,astrofizik,tip,mekanikdizayn,telekominikasyon;
	
	/**
	 * Create the application.
	 */
	public yazar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Yazar");
		frame.setBounds(100, 100, 450, 748);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new Panel();
		panel.setBounds(0, 0, 434, 709);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ad = new JLabel("Yazar\u0131n Ad\u0131:");
		ad.setBounds(10, 23, 71, 14);
		panel.add(ad);
		
		add = new JLabel(anaekran.ad);
		add.setBounds(124, 23, 300, 14);
		panel.add(add);
		
		soyad = new JLabel("Yazar\u0131n Soyad\u0131:");
		soyad.setBounds(10, 38, 115, 14);
		panel.add(soyad);
		
		soyadd = new JLabel(anaekran.soyad);
		soyadd.setBounds(124, 38, 300, 14);
		panel.add(soyadd);
		
		mail = new JLabel("Mail:");
		mail.setBounds(10, 63, 71, 14);
		panel.add(mail);
		
		lblniversitekurum = new JLabel("\u00DCniversite/Kurum:");
		lblniversitekurum.setBounds(10, 112, 115, 14);
		panel.add(lblniversitekurum);
		
		lblBildiriBal = new JLabel("Bildiri Ba\u015Fl\u0131\u011F\u0131:");
		lblBildiriBal.setBounds(10, 140, 104, 14);
		panel.add(lblBildiriBal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 137, 300, 20);
		panel.add(textField);
		
		lblBildirizeti = new JLabel("Bildiri \u00D6zeti:");
		lblBildirizeti.setBounds(10, 165, 71, 14);
		panel.add(lblBildirizeti);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(124, 165, 300, 89);
		panel.add(textArea);
		
		lblAnahtarKelimeler = new JLabel("Anahtar Kelimeler:");
		lblAnahtarKelimeler.setBounds(10, 270, 115, 14);
		panel.add(lblAnahtarKelimeler);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 267, 300, 20);
		panel.add(textField_1);
		
		lblBildirininGrupKonular = new JLabel("Bildirinin Grup Konular\u0131:");
		lblBildirininGrupKonular.setBounds(10, 298, 139, 14);
		panel.add(lblBildirininGrupKonular);
		
		lblBildiri = new JLabel("Bildiri:");
		lblBildiri.setBounds(10, 438, 44, 14);
		panel.add(lblBildiri);
		
		textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(52, 438, 372, 216);
		panel.add(textArea_1);
		
		button = new JButton("ONAY");
		button.setBounds(163, 665, 122, 28);
		panel.add(button);
		button.addActionListener(this);
		
		yazartelefon = new JLabel("Telefon:");
		yazartelefon.setBounds(10, 87, 46, 14);
		panel.add(yazartelefon);
		
		textField_3 = new JTextField();
		textField_3.setBounds(124, 60, 300, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 84, 300, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(124, 109, 300, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		chckbxElektrik = new JRadioButton("Elektrik");
		chckbxElektrik.setBounds(20, 319, 97, 23);
		panel.add(chckbxElektrik);
		
		chckbxKontrol = new JRadioButton("Kontrol");
		chckbxKontrol.setBounds(156, 319, 97, 23);
		panel.add(chckbxKontrol);
		
		chckbxAstrofizik = new JRadioButton("Astrofizik");
		chckbxAstrofizik.setBounds(291, 319, 97, 23);
		panel.add(chckbxAstrofizik);
		
		chckbxTp = new JRadioButton("Týp");
		chckbxTp.setBounds(291, 345, 97, 23);
		panel.add(chckbxTp);
		
		chckbxFizik = new JRadioButton("Fizik");
		chckbxFizik.setBounds(156, 345, 97, 23);
		panel.add(chckbxFizik);
		
		chckbxElektronik = new JRadioButton("Elektronik");
		chckbxElektronik.setBounds(20, 345, 97, 23);
		panel.add(chckbxElektronik);
		
		chckbxBiyomedikal = new JRadioButton("Biyomedikal");
		chckbxBiyomedikal.setBounds(20, 371, 97, 23);
		panel.add(chckbxBiyomedikal);
		
		chckbxProgramlama = new JRadioButton("Programlama");
		chckbxProgramlama.setBounds(20, 397, 115, 23);
		panel.add(chckbxProgramlama);
		
		chckbxKimya = new JRadioButton("Kimya");
		chckbxKimya.setBounds(156, 371, 97, 23);
		panel.add(chckbxKimya);
		
		chckbxMatematik = new JRadioButton("Matematik");
		chckbxMatematik.setBounds(156, 397, 97, 23);
		panel.add(chckbxMatematik);
		
		chckbxMekanikDizayn = new JRadioButton("Mekanik Dizayn");
		chckbxMekanikDizayn.setBounds(291, 371, 113, 23);
		panel.add(chckbxMekanikDizayn);
		
		chckbxTelekominikasyon = new JRadioButton("Telekominikasyon");
		chckbxTelekominikasyon.setBounds(291, 397, 133, 23);
		panel.add(chckbxTelekominikasyon);
		
		btnNewButton = new JButton("Geri D\u00F6n");
		btnNewButton.setVisible(false);
		btnNewButton.setBounds(320, 667, 89, 25);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getActionCommand().equals(btnNewButton.getText()))
		{
			frame.dispose();
			anaekran b = new anaekran();
			b.frame.setVisible(true);
		}
		
		
		if(e.getActionCommand().equals(button.getText()))
		{
			Mail = textField_3.getText();
			telefon = textField_4.getText();
			yer = textField_5.getText();
			bildiri_basligi = textField.getText();
			bildiri_ozeti = textArea.getText();
			anahtar_kelimeler = textField_1.getText();
			bildiri = textArea_1.getText();
			
			
			elektrik = chckbxElektrik.isSelected() ? chckbxElektrik.getText() : "bos" ;
			elektronik = chckbxElektronik.isSelected() ? chckbxElektronik.getText() : "bos" ;
			biyomedikal = chckbxBiyomedikal.isSelected() ? chckbxBiyomedikal.getText() : "bos" ;
			programlama = chckbxProgramlama.isSelected() ? chckbxProgramlama.getText() : "bos" ;
			kontrol = chckbxKontrol.isSelected() ? chckbxKontrol.getText() : "bos" ;
			fizik = chckbxFizik.isSelected() ? chckbxFizik.getText() : "bos" ;
			kimya = chckbxKimya.isSelected() ? chckbxKimya.getText() : "bos" ;
			matematik = chckbxMatematik.isSelected() ? chckbxMatematik.getText() : "bos" ;
			astrofizik = chckbxAstrofizik.isSelected() ? chckbxAstrofizik.getText() : "bos" ;
			tip = chckbxTp.isSelected() ? chckbxTp.getText() : "bos" ;
			mekanikdizayn = chckbxMekanikDizayn.isSelected() ? chckbxMekanikDizayn.getText() : "bos" ;
			telekominikasyon = chckbxTelekominikasyon.isSelected() ? chckbxTelekominikasyon.getText() : "bos" ;
			
			String ad =anaekran.ad + anaekran.soyad;
	
			
			sqlYazarBilgisiGir y1=new sqlYazarBilgisiGir(anaekran.id,ad,Mail,telefon,yer,bildiri_basligi,bildiri_ozeti,anahtar_kelimeler,bildiri,elektrik,elektronik,
					biyomedikal,programlama,kontrol,fizik,kimya,matematik,astrofizik,tip,mekanikdizayn,telekominikasyon);
			y1.sqlYazarBilgisiGiris();
			
			/*System.out.println("elektrik = "+ elektrik);
			System.out.println("elektronik = " + elektronik);
			System.out.println("biyomedikal = " + biyomedikal);
			System.out.println("programlama = " + programlama);
			System.out.println("kontrol = " + kontrol);
			System.out.println("fizik = " + fizik);
			System.out.println("kimya = " + kimya);
			System.out.println("matematik = " + matematik);
			System.out.println("astrofizik = " + astrofizik);
			System.out.println("tip = " + tip);
			System.out.println("mekanikdizayn = " + mekanikdizayn);
			System.out.println("telekominikasyon = " + telekominikasyon);*/
			
			
			/*System.out.println(Mail);
			System.out.println(telefon);
			System.out.println(yer);
			System.out.println(bildiri_basligi);
			System.out.println(bildiri_ozeti);
			System.out.println(anahtar_kelimeler);
			System.out.println(grup_konulari);
			System.out.println(bildiri);*/
			
			JOptionPane.showMessageDialog(frame, "Kaydýnýz Tamamlanmýþtýr!!!", "Onay", JOptionPane.INFORMATION_MESSAGE);
			
			frame.dispose();
			anaekran b = new anaekran();
			b.frame.setVisible(true);
			
			

		}
		
		
	}
}
