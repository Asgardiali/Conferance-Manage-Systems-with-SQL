package KonferansSistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;


public class taslakFrame {

	public JFrame frame;
	static String hakemAdVeri;
	
	public static int gecerliBildiriSayfasi = 1;
	public static int hakemBildiriSayisi;
	public static int hakemindex;
	//static boolean sec;
	//static String[][] bildiriID = new String[bildiriHakemEsleme.yazarSayisi()][bildiriHakemEsleme.hakemSayisi()];
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					taslakFrame window = new taslakFrame();
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
	public taslakFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.isResizable();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		int uzunluk = anaekran.sonucKonuID.length;
		
		//System.out.println(uzunluk);
		
		for(int i = 0 ; i < uzunluk; i++)
		{
			//sec=anaekran.sonucKonuID[i][0].equals(hakem.label_4.getText());
			
			if(anaekran.sonucKonuID[i][0].equals(hakem.label_4.getText()))
			{
				//System.out.println("ibne");
				
					hakemBildiriSayisi = (anaekran.sonucKonuID[i].length) - 1;
					hakemindex = i;
				
				
						frame.dispose();
						bildiriEkran b = new bildiriEkran();
						b.frame.setVisible(true);
						
						

				
			}
			
			
		}
		
		
		//System.out.println(hakem.label_4.getText());
		
		
		
		

		
	}
}
