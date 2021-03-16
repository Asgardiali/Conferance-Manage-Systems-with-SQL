package KonferansSistemi;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.*;

public class anaekran implements ActionListener {
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
    static final String USER = "root";
    static final String PASS = "1234";

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static String sistemTarihiniGetir(String tarihFormati)
	{
				 Calendar takvim = Calendar.getInstance();
				 SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
				 return sdf.format(takvim.getTime());
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
		
					System.out.println(sistemTarihiniGetir("yyyy/MM/dd H:mm:ss"));
					String a=sistemTarihiniGetir("yyyy/MM/dd H:mm:ss").toString();
					
					if(a.compareToIgnoreCase("2019/01/31".toString()) > 0) 
					{
						JOptionPane.showMessageDialog(frame, "Süresi Geçmiþtir!!!", "Error", JOptionPane.ERROR_MESSAGE);			
					}
					
					else if(a.compareToIgnoreCase("2019/01/31".toString()) < 0)
					{
						
						anaekran window = new anaekran();
						window.frame.setVisible(true);				
						
					}	
					
						
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JTextField textField_6;
	private JLabel label_1;
	private JTextField textField_7;
	ButtonGroup bg,bg2;
	JButton btnNewButton;
	JRadioButton rdbtnBakan; 
	JRadioButton rdbtnHakem;
	JRadioButton rdbtnNewRadioButton_2;
	JLabel lblAd ;
	JLabel lblSoyad;
	JLabel lblParola;
	JLabel lblNewLabel;
	SecureRandom randomNumbers;
	static int id;
	
	static String unvan = "";
	static String ad;
	static String soyad;
	String parola;
	
	String girilenId;
	int password;
	String parolaGirilen;
	
	static String[][] sonucKonuID;
	
	public anaekran() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		frame.getContentPane().add(panel, "name_3452804727790");
		
		bg = new ButtonGroup();
		
		rdbtnNewRadioButton_1 = new JRadioButton("Kayýt");
		rdbtnNewRadioButton_1.setBounds(137, 7, 84, 23);
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(this);
		panel.setLayout(null);
		panel.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton = new JRadioButton("Giriþ");
		rdbtnNewRadioButton.setBounds(223, 7, 84, 23);
		rdbtnNewRadioButton.addActionListener(this);
		panel.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton);
		
		panel_2 = new JPanel();
		panel_2.setBounds(10, 35, 414, 166);
		panel_2.setVisible(false);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 35, 414, 166);
		panel_1.setVisible(true);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblAd = new JLabel("Ad:");
		lblAd.setBounds(79, 65, 46, 14);
		panel_1.add(lblAd);
		
		lblSoyad = new JLabel("Soyad:");
		lblSoyad.setBounds(79, 90, 46, 14);
		panel_1.add(lblSoyad);
		
		lblParola = new JLabel("Parola:");
		lblParola.setBounds(79, 115, 46, 14);
		panel_1.add(lblParola);
		
		textField = new JTextField();
		textField.setBounds(152, 37, 191, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 62, 191, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 87, 191, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 112, 191, 20);
		panel_1.add(textField_3);
		
		lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(79, 40, 46, 14);
		panel_1.add(lblNewLabel);
		
		bg2 = new ButtonGroup();
		
		rdbtnNewRadioButton_2 = new JRadioButton("Yazar");
		rdbtnNewRadioButton_2.setBounds(79, 7, 73, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		rdbtnHakem = new JRadioButton("Hakem");
		rdbtnHakem.setBounds(177, 7, 83, 23);
		panel_1.add(rdbtnHakem);
		
		rdbtnBakan = new JRadioButton("Ba\u015Fkan");
		rdbtnBakan.setBounds(273, 7, 83, 23);
		panel_1.add(rdbtnBakan);
		
		bg2.add(rdbtnNewRadioButton_2);
		bg2.add(rdbtnHakem);
		bg2.add(rdbtnBakan);
		
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		label = new JLabel("Id:");
		label.setBounds(90, 29, 46, 14);
		panel_2.add(label);
		
		textField_6 = new JTextField();
		textField_6.setBounds(146, 26, 188, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		label_1 = new JLabel("Parola:");
		label_1.setBounds(90, 60, 46, 14);
		panel_2.add(label_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(146, 57, 188, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		btnNewButton = new JButton("Kay\u0131t/Giri\u015F");
		btnNewButton.setBounds(155, 212, 132, 33);
		btnNewButton.setVisible(true);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		randomNumbers = new SecureRandom();
		
		id =100+randomNumbers.nextInt(100);
		textField.setText(""+id);
		textField.setEditable(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(rdbtnNewRadioButton_1.isSelected())
		{
			panel_1.setVisible(true);
			panel_2.setVisible(false);
			btnNewButton.setVisible(true);		
		}
		else if(rdbtnNewRadioButton.isSelected())
		{
			panel_1.setVisible(false);
			panel_2.setVisible(true);
			btnNewButton.setVisible(true);	
		}
		
		if(e.getActionCommand().equals(btnNewButton.getText()))
		{
			
			if(panel_1.isVisible()==true) 
			{
				
				
				if(rdbtnNewRadioButton_2.isSelected())
				{
					unvan = rdbtnNewRadioButton_2.getText();
				}
				else if(rdbtnHakem.isSelected())
				{
					unvan = rdbtnHakem.getText();
				}
				else if(rdbtnBakan.isSelected())
				{
					unvan = rdbtnBakan.getText();
				}
				

				
				ad = textField_1.getText();
				soyad = textField_2.getText();
				parola = textField_3.getText();
				//String mail = textField_4.getText();
				//String telefon = textField_5.getText();
				//String yer = textField_8.getText();
				
				
				if(unvan.isEmpty() || ad.isEmpty() || soyad.isEmpty() || parola.isEmpty() /*|| mail.isEmpty() || telefon.isEmpty() || yer.isEmpty()*/)
				{
					JOptionPane.showMessageDialog(frame, "Boþ býrakýlmamalý!!!", "Error", JOptionPane.ERROR_MESSAGE);	
				}
				
				else
				{
						String AD = ad + soyad;
						sqlGirisBilgisiVeriGir k1=new sqlGirisBilgisiVeriGir(id,AD,parola,unvan);
						k1.sqlKullaniciVeriGir();
								
						if(rdbtnNewRadioButton_2.isSelected())
						{
								frame.dispose();
								yazar b = new yazar();
								b.frame.setVisible(true);
	
							
						}
						else if(rdbtnHakem.isSelected())
						{
								frame.dispose();
								hakem b = new hakem();
								b.frame.setVisible(true);
							
						}
						else if(rdbtnBakan.isSelected())
						{
	
								frame.dispose();
								baskanilksayfa b = new baskanilksayfa();
								b.frmBakan.setVisible(true);
								
						}
				}
								
				
			}					
				/*	
					System.out.println(unvan);
					System.out.println(id);
					System.out.println(ad);
					System.out.println(soyad);
					System.out.println(parola);
					System.out.println(mail);
					System.out.println(telefon);
					System.out.println(yer);
					unvan = "";
					id = "";
					ad = "";
					soyad = "";
					parola = "";
					mail = "";
					telefon = "";
					yer = "";
					*/

			else if(panel_2.isVisible()==true) 
			{
				girilenId=textField_6.getText();
				parolaGirilen=textField_7.getText();
			
				if(girilenId.isEmpty() || parolaGirilen.isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Boþ býrakýlmamalý!!!", "Error", JOptionPane.ERROR_MESSAGE);	
				}
				
				else 
				{
					
					sqlGirisBilgisiKarsilastir k2 = new sqlGirisBilgisiKarsilastir();
					
					girilenId=textField_6.getText();
					parolaGirilen=textField_7.getText();
					
					password=k2.sqlIDGetir(Integer.parseInt(girilenId));
					
					k2.sqlKullaniciTipiGetir(Integer.parseInt(girilenId));
					String kullanici_tipi=k2.getKullanici_tipi();
					
					//System.out.println(Integer.parseInt(parolaGirilen));
					//System.out.println(password);
						
					if(password==Integer.parseInt(girilenId)) 
					{
						
						String Yazar="Yazar";
						String Hakem="Hakem";
						String Baskan="Baþkan";
						
						if(Yazar.equals(k2.getKullanici_tipi())) {
							
							sqlYazarBilgisiGir y1=new sqlYazarBilgisiGir();						
							String[] deneme = y1.sqlYazarBilgiGetir(Integer.parseInt(girilenId)).clone();
							
							yazarKisi yk = new yazarKisi(deneme[0],deneme[1],deneme[2],
									deneme[3],deneme[4],deneme[5],deneme[6],deneme[7],deneme[8],
									deneme[9],deneme[10],deneme[11],deneme[12],deneme[13],deneme[14],
									deneme[15],deneme[16],deneme[17],deneme[18],deneme[19],deneme[20]);
							
									frame.dispose();
									yazar b = new yazar();
									b.frame.setVisible(true);
									
									b.btnNewButton.setVisible(true);
									
									b.ad.setText("Ad,Soyad :");
									b.add.setText(yk.yazar_adisoyadi);;
									b.soyad.setVisible(false);
									b.textField_3.setText(yk.yazar_mail);
									b.textField_3.setEditable(false);
									b.textField_4.setText(yk.yazar_telefon);
									b.textField_4.setEditable(false);
									b.textField_5.setText(yk.yazar_kurum);
									b.textField_5.setEditable(false);
									b.textField.setText(yk.yazar_Bbaslik);
									b.textField.setEditable(false);
									b.textArea.setText(yk.yazar_Bozet);
									b.textArea.setEditable(false);
									b.textField_1.setText(yk.yazar_anhkelm);
									b.textField_1.setEditable(false);
									
									b.chckbxElektrik.setSelected("bos".equalsIgnoreCase(yk.y_elektrik_data)? false:true);
									b.chckbxElektrik.setEnabled(false);
									b.chckbxElektronik.setSelected("bos".equalsIgnoreCase(yk.y_elektronik_data)? false:true);
									b.chckbxElektronik.setEnabled(false);
									b.chckbxBiyomedikal.setSelected("bos".equalsIgnoreCase(yk.y_biyomedikal_data)? false:true);
									b.chckbxBiyomedikal.setEnabled(false);
									b.chckbxProgramlama.setSelected("bos".equalsIgnoreCase(yk.y_programlama_data)? false:true);
									b.chckbxProgramlama.setEnabled(false);
									b.chckbxKontrol.setSelected("bos".equalsIgnoreCase(yk.y_kontrol_data)? false:true);
									b.chckbxKontrol.setEnabled(false);
									b.chckbxFizik.setSelected("bos".equalsIgnoreCase(yk.y_fizik_data)? false:true);
									b.chckbxFizik.setEnabled(false);
									b.chckbxKimya.setSelected("bos".equalsIgnoreCase(yk.y_kimya_data)? false:true);
									b.chckbxKimya.setEnabled(false);
									b.chckbxMatematik.setSelected("bos".equalsIgnoreCase(yk.y_matematik_data)? false:true);
									b.chckbxMatematik.setEnabled(false);
									b.chckbxAstrofizik.setSelected("bos".equalsIgnoreCase(yk.y_astrofizik_data)? false:true);
									b.chckbxAstrofizik.setEnabled(false);
									b.chckbxTp.setSelected("bos".equalsIgnoreCase(yk.y_tip_data)? false:true);
									b.chckbxTp.setEnabled(false);
									b.chckbxMekanikDizayn.setSelected("bos".equalsIgnoreCase(yk.y_mekanikdizayn_data)? false:true);
									b.chckbxMekanikDizayn.setEnabled(false);
									b.chckbxTelekominikasyon.setSelected("bos".equalsIgnoreCase(yk.y_telekominikasyon_data)? false:true);
									b.chckbxTelekominikasyon.setEnabled(false);
									
									b.textArea_1.setText(yk.yazar_bildiri);
									b.textArea_1.setEditable(false);
									b.button.setEnabled(false);
							
						}
						
						else if(Hakem.equals(k2.getKullanici_tipi())) {
							
							sqlHakemBilgisiGir h1=new sqlHakemBilgisiGir();
							String[] deneme = h1.sqlHakemBilgiGetir(Integer.parseInt(girilenId)).clone();
							hakemKisi hk = new hakemKisi(deneme[0],deneme[1],deneme[2],
									deneme[3],deneme[4],deneme[5],deneme[6],deneme[7],deneme[8],
									deneme[9],deneme[10],deneme[11],deneme[12],deneme[13],deneme[14],
									deneme[15],deneme[16]);
							
							
									frame.dispose();
									hakem b = new hakem();
									b.frame.setVisible(true);
									
									b.btnNewButton_1.setVisible(true);
									
									b.lblNewLabel.setText("Ad,Soyad :");
									b.label_4.setText(hk.hakem_adisoyadi);
									b.lblNewLabel_1.setVisible(false);
									b.textField.setText(hk.hakem_mail);
									b.textField.setEditable(false);
									b.textField_1.setText(hk.hakem_telefon);
									b.textField_1.setEditable(false);
									b.textField_2.setText(hk.hakem_kurum);
									b.textField_2.setEditable(false);
									
									b.chckbxElektrik.setSelected("bos".equalsIgnoreCase(hk.elektrik_data)? false:true);
									b.chckbxElektrik.setEnabled(false);
									b.chckbxElektronik.setSelected("bos".equalsIgnoreCase(hk.elektronik_data)? false:true);
									b.chckbxElektronik.setEnabled(false);
									b.chckbxBiyomedikal.setSelected("bos".equalsIgnoreCase(hk.biyomedikal_data)? false:true);
									b.chckbxBiyomedikal.setEnabled(false);
									b.chckbxProgramlama.setSelected("bos".equalsIgnoreCase(hk.programlama_data)? false:true);
									b.chckbxProgramlama.setEnabled(false);
									b.chckbxKontrol.setSelected("bos".equalsIgnoreCase(hk.kontrol_data)? false:true);
									b.chckbxKontrol.setEnabled(false);
									b.chckbxFizik.setSelected("bos".equalsIgnoreCase(hk.fizik_data)? false:true);
									b.chckbxFizik.setEnabled(false);
									b.chckbxKimya.setSelected("bos".equalsIgnoreCase(hk.kimya_data)? false:true);
									b.chckbxKimya.setEnabled(false);
									b.chckbxMatematik.setSelected("bos".equalsIgnoreCase(hk.matematik_data)? false:true);
									b.chckbxMatematik.setEnabled(false);
									b.chckbxAstrofizik.setSelected("bos".equalsIgnoreCase(hk.astrofizik_data)? false:true);
									b.chckbxAstrofizik.setEnabled(false);
									b.chckbxTp.setSelected("bos".equalsIgnoreCase(hk.tip_data)? false:true);
									b.chckbxTp.setEnabled(false);
									b.chckbxMekanikDizayn.setSelected("bos".equalsIgnoreCase(hk.mekanikdizayn_data)? false:true);
									b.chckbxMekanikDizayn.setEnabled(false);
									b.chckbxTelekominikasyon.setSelected("bos".equalsIgnoreCase(hk.telekominikasyon_data)? false:true);
									b.chckbxTelekominikasyon.setEnabled(false);
							
									b.btnNewButton.setEnabled(false);
							
							
							
							
							
						}
						
						else if(Baskan.equals(k2.getKullanici_tipi())) 
						{
						
									sqlBaskanBilgisiGir b1=new sqlBaskanBilgisiGir();	
									
									String[] deneme =new String[5];
									
									deneme= b1.sqlBaskanBilgiGetir(Integer.parseInt(girilenId)).clone();
									
									baskanKisi bk = new baskanKisi(deneme[0],deneme[1],deneme[2],deneme[3],deneme[4]);

									frame.dispose();
									baskan b = new baskan();
									b.frame.setVisible(true);
									
									System.out.println("**"+bk.baskan_kurum);	
									
									b.lblNewLabel_2.setText(bk.baskan_adsoyad);
									
									
									bildiriHakemEsleme.esleme();
									int bildiriSayisi = bildiriHakemEsleme.yazarSayisi();
									
									//for(int i = 0 ; i < bildiriSayisi ; i++ )
									//{
									
										
									hakemBildiriEsleme.tersEsleme();
										int hakemSayisi = bildiriHakemEsleme.konuID1[0].length;
										
										sonucKonuID = new String[bildiriSayisi][(2*hakemSayisi-1)];
										
										
										
										for(int z=0;z<bildiriHakemEsleme.yazarSayisi();z++) {
											
											for(int c=0;c<bildiriHakemEsleme.hakemSayisi();c++) {
												
												if(sonucKonuID[z][c]==null) {
													sonucKonuID[z][c]="bos";
												}
												sonucKonuID[z][c]=hakemBildiriEsleme.konuID1[z][c];
												
											}
											
											
										}
/*										
										for(int z=0;z<bildiriSayisi;z++) {
											
											for(int c=0;c<2*hakemSayisi-1;c++) {
												
												System.out.println(sonucKonuID[z][c]);
												System.out.println("**************************************");
											}
											
											
										}
*/										
										for(int i=0;i<bildiriSayisi;i++) {
											
											//b.area.append(bildiriHakemEsleme.konuID1[i][0] + "\n");	
									
											b.area.append(bildiriHakemEsleme.konuID1[i][0].toUpperCase() + "\n\n");
											
											
										for(int k = 1 ; k < hakemSayisi ; k++)
										{
											
											b.area.append(hakemAdGetir(bildiriHakemEsleme.konuID1[i][k]) + "\n");
																
											
											/*if(!bildiriHakemEsleme.konuID1[i][k].equals(null)) {
	
												
												System.out.println(bildiriHakemEsleme.konuID1[i][k]);
												
											}
											else {
												break;
											}*/

										}
										System.out.println("****************************");
										b.area.append("\n");
										
										}
										
									//}
											
									
									
									
							
						}
						
						else
							System.out.println("Veritabaný Hatasý");
						
						
									
					//System.out.println(textField_6.getText());
					//System.out.println(textField_7.getText());
					
					}
					
					else 
					{
						JOptionPane.showMessageDialog(frame, "ID ve Parola uyumsuz\nTekrar deneyiniz..", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
					
					
					
					
					
					
				}
				

				
				
				
			}
			
			
			
			
			
		}
		
			
		
		
		
		
	}


	public static String hakemAdGetir(String id) {
		
		String adsoyad = null;
		String a=" ";
		if(id!=null) {
			
			
			int idInt = Integer.parseInt(id);
		            Connection conn = null;
		            Statement stmt = null;
		            try{
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Veritabanina baglaniliyor...");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    System.out.println("Baglanti basarili...");
		    
		    //Sorgular calýstýrlýr.
		    System.out.println("Deyim oluþturuluyor...");
		    stmt = conn.createStatement();
		    String sql = "SELECT adsoyad FROM konferans.hakem_bilgi WHERE hakem_id="+idInt+";";
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    // Veriler ayýklanýr.
		    while(rs.next()){
			    
		    	// Sutunlara göre degerlerý alýyoruz
		       
		        adsoyad = rs.getString("adsoyad");
		        
		        
		        //Verileri görüntüle - yaz
		       
		        System.out.println("ADI VE SOYADI : " + adsoyad);
		        
		        
		    }
		    rs.close();
		    }catch(SQLException se){
		    	se.printStackTrace();
		    	}catch(Exception e){
		    		e.printStackTrace();
		    		}
		            finally{
		            	try{
		            		if(stmt!=null)
		            			conn.close();
		                }catch(SQLException se){
		                }
		                try{
		                    if(conn!=null)
		                        conn.close();
		                }catch(SQLException se){
		                    se.printStackTrace();
		                }
		            }
		            System.out.println("Gule gule!");
		            
		            return adsoyad;
		    
		}
		else {
			return a;
		}
		
		    
		            }

}

