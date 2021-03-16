package KonferansSistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class baskanilksayfa implements ActionListener{

	public JFrame frmBakan;
	public JTextField textField_Mail;
	public JTextField textField_Telefon;
	public JTextField textField_Kurum;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baskanilksayfa window = new baskanilksayfa();
					window.frmBakan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public baskanilksayfa() {
		initialize();
	}

	
	Panel panel;
	JLabel lblAd;
	JLabel lblSoyad;
	JLabel lblMail;
	JLabel lblTelefon;
	JLabel lblKurum;
	JButton kaydet;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBakan = new JFrame();
		frmBakan.setTitle("BA\u015EKAN");
		frmBakan.setBounds(100, 100, 450, 245);
		frmBakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBakan.getContentPane().setLayout(null);
		
		panel = new Panel();
		panel.setBounds(0, 0, 434, 208);
		frmBakan.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblAd = new JLabel("Ba\u015Fkan Ad:");
		lblAd.setBounds(20, 14, 82, 14);
		panel.add(lblAd);
		
		lblSoyad = new JLabel("Ba\u015Fkan Soyad:");
		lblSoyad.setBounds(20, 39, 97, 14);
		panel.add(lblSoyad);
		
		lblMail = new JLabel("Mail:");
		lblMail.setBounds(20, 67, 82, 14);
		panel.add(lblMail);
		
		lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(20, 92, 82, 14);
		panel.add(lblTelefon);
		
		textField_Mail = new JTextField();
		textField_Mail.setColumns(10);
		textField_Mail.setBounds(127, 64, 281, 20);
		panel.add(textField_Mail);
		
		textField_Telefon = new JTextField();
		textField_Telefon.setColumns(10);
		textField_Telefon.setBounds(127, 89, 281, 20);
		panel.add(textField_Telefon);
		
		lblKurum = new JLabel("Kurum:");
		lblKurum.setBounds(20, 120, 82, 14);
		panel.add(lblKurum);
		
		textField_Kurum = new JTextField();
		textField_Kurum.setColumns(10);
		textField_Kurum.setBounds(127, 117, 281, 20);
		panel.add(textField_Kurum);
		
		kaydet = new JButton("Kaydet");
		kaydet.setBounds(160, 160, 115, 37);
		panel.add(kaydet);
		
		lblNewLabel = new JLabel(anaekran.ad);
		lblNewLabel.setBounds(127, 14, 281, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(anaekran.soyad);
		lblNewLabel_1.setBounds(127, 39, 281, 14);
		panel.add(lblNewLabel_1);
		
		
		kaydet.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getActionCommand().equals(kaydet.getText()))
			{
				String ad = lblNewLabel.getText();
				String soyad = lblNewLabel_1.getText();
				String mail = textField_Mail.getText();
				String telefon = textField_Telefon.getText();
				String kurum = textField_Kurum.getText();
				
				if(ad.isEmpty() || soyad.isEmpty() || mail.isEmpty() || telefon.isEmpty() || kurum.isEmpty())
				{
					JOptionPane.showMessageDialog(frmBakan, "Boþ býrakýlmamalý!!!", "Error", JOptionPane.ERROR_MESSAGE);	
				}
				
				else
				{
						String AD=ad + soyad;
						
						sqlBaskanBilgisiGir k1=new sqlBaskanBilgisiGir(anaekran.id,AD,mail,telefon,kurum);
						k1.sqlBaskanBilgisiGiris();
								
						JOptionPane.showMessageDialog(frmBakan, "Kaydýnýz Tamamlanmýþtýr!!!", "Onay", JOptionPane.INFORMATION_MESSAGE);
						
						frmBakan.dispose();
						anaekran b = new anaekran();
						b.frame.setVisible(true);
						
						
						
						
				}
				
				
				
				
				
				
			}
			
	
		
	}
	
	
	
	
}
