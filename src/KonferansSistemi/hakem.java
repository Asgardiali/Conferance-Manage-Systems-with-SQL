package KonferansSistemi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class hakem implements ActionListener{

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hakem window = new hakem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	JPanel panel;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblTelefon;
	JLabel lblMail;
	JLabel lblniversitekurum;
	JLabel lblIlgilendiinizGrupKonularn;
	JRadioButton chckbxElektrik;
	JRadioButton chckbxElektronik;
	JRadioButton chckbxBiyomedikal;
	JRadioButton chckbxProgramlama;
	static JLabel label_4;
	JLabel label_5;
	
	JRadioButton chckbxKontrol;
	JRadioButton chckbxFizik;
	JRadioButton chckbxKimya;
	JRadioButton chckbxMatematik;
	JRadioButton chckbxAstrofizik;
	JRadioButton chckbxTp;
	JRadioButton chckbxMekanikDizayn;
	JRadioButton chckbxTelekominikasyon;
	JButton btnNewButton;
	
	public static String ad;
	
	JButton btnNewButton_2;
	
	String Mail,telefon,yer;
	String elektrik,elektronik,biyomedikal,programlama,kontrol,fizik,kimya,matematik,astrofizik,tip,mekanikdizayn,telekominikasyon;
	public JButton btnNewButton_1;
	
	public static Boolean bayrak = false;

	/**
	 * Create the application.
	 */
	public hakem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Hakem");
		frame.setBounds(100, 100, 450, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 342);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Hakem Ad\u0131:");
		lblNewLabel.setBounds(28, 10, 84, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Hakem Soyad\u0131:");
		lblNewLabel_1.setBounds(28, 36, 84, 14);
		panel.add(lblNewLabel_1);
		
		lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(28, 86, 84, 14);
		panel.add(lblTelefon);
		
		lblMail = new JLabel("Mail:");
		lblMail.setBounds(28, 61, 84, 14);
		panel.add(lblMail);
		
		lblniversitekurum = new JLabel("\u00DCniversite/Kurum:");
		lblniversitekurum.setBounds(28, 111, 109, 14);
		panel.add(lblniversitekurum);
		
		lblIlgilendiinizGrupKonularn = new JLabel("\u0130lgilendi\u011Finiz grup konular\u0131n\u0131 se\u00E7iniz:");
		lblIlgilendiinizGrupKonularn.setBounds(28, 139, 374, 14);
		panel.add(lblIlgilendiinizGrupKonularn);
		
		chckbxElektrik = new JRadioButton("Elektrik");
		chckbxElektrik.setBounds(38, 160, 97, 23);
		panel.add(chckbxElektrik);
		
		chckbxElektronik = new JRadioButton("Elektronik");
		chckbxElektronik.setBounds(38, 186, 97, 23);
		panel.add(chckbxElektronik);
		
		chckbxBiyomedikal = new JRadioButton("Biyomedikal");
		chckbxBiyomedikal.setBounds(38, 212, 97, 23);
		panel.add(chckbxBiyomedikal);
		
		chckbxProgramlama = new JRadioButton("Programlama");
		chckbxProgramlama.setBounds(38, 238, 109, 23);
		panel.add(chckbxProgramlama);
		
		label_4 = new JLabel(anaekran.ad);
		label_4.setBounds(136, 10, 273, 14);
		panel.add(label_4);
		
		label_5 = new JLabel(anaekran.soyad);
		label_5.setBounds(136, 36, 273, 14);
		panel.add(label_5);
		
		chckbxKontrol = new JRadioButton("Kontrol");
		chckbxKontrol.setBounds(174, 160, 97, 23);
		panel.add(chckbxKontrol);
		
		chckbxFizik = new JRadioButton("Fizik");
		chckbxFizik.setBounds(174, 186, 97, 23);
		panel.add(chckbxFizik);
		
		chckbxKimya = new JRadioButton("Kimya");
		chckbxKimya.setBounds(174, 212, 97, 23);
		panel.add(chckbxKimya);
		
		chckbxMatematik = new JRadioButton("Matematik");
		chckbxMatematik.setBounds(174, 238, 97, 23);
		panel.add(chckbxMatematik);
		
		chckbxAstrofizik = new JRadioButton("Astrofizik");
		chckbxAstrofizik.setBounds(298, 160, 97, 23);
		panel.add(chckbxAstrofizik);
		
		chckbxTp = new JRadioButton("Týp");
		chckbxTp.setBounds(298, 186, 97, 23);
		panel.add(chckbxTp);
		
		chckbxMekanikDizayn = new JRadioButton("MekanikDizayn");
		chckbxMekanikDizayn.setBounds(298, 212, 119, 23);
		panel.add(chckbxMekanikDizayn);
		
		chckbxTelekominikasyon = new JRadioButton("Telekominikasyon");
		chckbxTelekominikasyon.setBounds(298, 238, 130, 23);
		panel.add(chckbxTelekominikasyon);
		
		btnNewButton = new JButton("Onay");
		btnNewButton.setBounds(28, 268, 113, 28);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(136, 58, 270, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 83, 270, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 108, 270, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_1 = new JButton("Geri D\u00F6n");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setBounds(300, 268, 102, 28);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);	
		
		btnNewButton_2 = new JButton("Bildiri Deðerlendirme");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.setBounds(28, 307, 374, 28);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		if(bayrak)
		{
			btnNewButton_2.setVisible(true);
		}
		else 
		{
				btnNewButton_2.setVisible(false);
			
		}

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals(btnNewButton_1.getText()))
		{
			frame.dispose();
			anaekran b = new anaekran();
			b.frame.setVisible(true);
		}
		
		
		if(e.getActionCommand().equals(btnNewButton.getText()))
		{
			Mail = textField.getText();
			telefon = textField_1.getText();
			yer = textField_2.getText();
			
			elektrik = chckbxElektrik.isSelected() ? chckbxElektrik.getText() : "hakembos" ;
			elektronik = chckbxElektronik.isSelected() ? chckbxElektronik.getText() : "hakembos" ;
			biyomedikal = chckbxBiyomedikal.isSelected() ? chckbxBiyomedikal.getText() : "hakembos" ;
			programlama = chckbxProgramlama.isSelected() ? chckbxProgramlama.getText() : "hakembos" ;
			kontrol = chckbxKontrol.isSelected() ? chckbxKontrol.getText() : "hakembos" ;
			fizik = chckbxFizik.isSelected() ? chckbxFizik.getText() : "hakembos" ;
			kimya = chckbxKimya.isSelected() ? chckbxKimya.getText() : "hakembos" ;
			matematik = chckbxMatematik.isSelected() ? chckbxMatematik.getText() : "hakembos" ;
			astrofizik = chckbxAstrofizik.isSelected() ? chckbxAstrofizik.getText() : "hakembos" ;
			tip = chckbxTp.isSelected() ? chckbxTp.getText() : "hakembos" ;
			mekanikdizayn = chckbxMekanikDizayn.isSelected() ? chckbxMekanikDizayn.getText() : "hakembos" ;
			telekominikasyon = chckbxTelekominikasyon.isSelected() ? chckbxTelekominikasyon.getText() : "hakembos" ;


			ad=anaekran.ad + anaekran.soyad;

			
			sqlHakemBilgisiGir h1=new sqlHakemBilgisiGir(anaekran.id,ad,Mail,telefon,yer,elektrik,elektronik,
					biyomedikal,programlama,kontrol,fizik,kimya,matematik,astrofizik,tip,mekanikdizayn,telekominikasyon);
			h1.sqlHakemBilgisiGiris();
			
			System.out.println("elektrik = "+ elektrik);
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
			System.out.println("telekominikasyon = " + telekominikasyon);
			
					
			
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
		
		if(e.getActionCommand().equals(btnNewButton_2.getText()))
		{
			frame.dispose();
			//anaekran b = new anaekran();
			//b.frame.setVisible(true);
			
			
			
			taslakFrame tf = new taslakFrame();
			tf.frame.setVisible(false);
			
			
			
		}
		
		
		
		
		
	}
}