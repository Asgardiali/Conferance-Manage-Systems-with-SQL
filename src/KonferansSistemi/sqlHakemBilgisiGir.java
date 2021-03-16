package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlHakemBilgisiGir {

		// JDBC driver ve Veritabaný URL
		// Veritabaný kullanýcý adý ve þifresi
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
		static final String USER = "root";
		static final String PASS = "1234";
		
		private int hakem_id;
		private String adsoyad;
		private String hakem_mail;
		private String hakem_telefon;
		private String hakem_kurum;
		static String elektrik;
		static String elektronik; 
		static String biyomedikal;
		static String programlama;
		static String  kontrol;
		static String fizik;
		static String kimya;
		static String matematik;
		static String astrofizik;
		static String tip;
		static String mekanikdizayn;
		static String telekominikasyon;
		
		public sqlHakemBilgisiGir() {
			
		}
		
		public sqlHakemBilgisiGir(int hakem_id, String adsoyad, String hakem_mail, String hakem_telefon,String hakem_kurum,String elektrik,
				String elektronik,String biyomedikal,String programlama,String  kontrol,String fizik,String kimya,String matematik,
				String astrofizik,String tip,String mekanikdizayn,String telekominikasyon) {
				
			this.setHakem_id(hakem_id);
			this.setAdsoyad(adsoyad);
			this.setHakem_mail(hakem_mail);
			this.setHakem_telefon(hakem_telefon);
			this.setHakem_kurum(hakem_kurum);
			sqlHakemBilgisiGir.elektrik=elektrik;
			sqlHakemBilgisiGir.elektronik=elektronik;
			sqlHakemBilgisiGir.biyomedikal=biyomedikal;
			sqlHakemBilgisiGir.programlama=programlama;
			sqlHakemBilgisiGir.kontrol=kontrol;
			sqlHakemBilgisiGir.fizik=fizik;
			sqlHakemBilgisiGir.kimya=kimya;
			sqlHakemBilgisiGir.matematik=matematik;
			sqlHakemBilgisiGir.astrofizik=astrofizik;
			sqlHakemBilgisiGir.tip=tip;
			sqlHakemBilgisiGir.mekanikdizayn=mekanikdizayn;
			sqlHakemBilgisiGir.telekominikasyon=telekominikasyon;	
		}
		
		public void sqlHakemBilgisiGiris(){
				
			Connection conn = null; // Baðlantý
			Statement stmt = null; 
			
		try {
		            // JDBC driver kayit edilir
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            
		            // Baglanti acilir.
		            System.out.println("Veritabanina baglaniliyor...");
		            conn = DriverManager.getConnection(DB_URL, USER, PASS);
		            System.out.println("Baglanti basarili...");
		            
		            // Execute islemleri"
		            System.out.println("Kayitlar tabloya eklenecek...");
		            stmt = conn.createStatement();
		            
		            //KAYIT EKLEME YAPILIYOR.
		            ;
		            stmt.executeUpdate(gonderHakemSql(getHakem_id(),getAdsoyad(),getHakem_mail(),getHakem_telefon(),getHakem_kurum(),
		            		elektrik,elektronik,biyomedikal,programlama,kontrol,fizik,kimya,matematik,astrofizik,tip,mekanikdizayn,telekominikasyon));
		        
		            //KAYIT SÝLME YAPIYOR.
	/*	            String sql1 = "DELETE FROM bilgi_1 " + "WHERE yazar_id=108";
		            stmt.executeUpdate(sql1);
	*/
	            
		            System.out.println("Kayit ekleme basarili...");
		            } 
		catch (SQLException se) 
		{
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
		    e.printStackTrace();
		} 
		finally {
		try {
		     if (stmt != null)
		        conn.close();
		    } 
		catch (SQLException se) 
		{            				}
		try {
			if (conn != null)
				conn.close();
		    } 
		catch (SQLException se) 
		{
			se.printStackTrace();
		}
		
	        }
	    }
		
		public String gonderHakemSql(int hakem_id, String adsoyad, String hakem_mail, String hakem_telefon,String hakem_kurum,String elektrik,
				String elektronik,String biyomedikal,String programlama,String  kontrol,String fizik,String kimya,String matematik,
				String astrofizik,String tip,String mekanikdizayn,String telekominikasyon) 
		{
			String sql = "INSERT INTO hakem_bilgi " + "VALUES ("+"'"+ hakem_id +"'"+","+"'"+ adsoyad +"'"+","+"'"+ hakem_mail+"'"+","+"'"+hakem_telefon+"'"+","+"'"+hakem_kurum+"'"+","+"'"+elektrik
					+"'"+","+"'"+elektronik+"'"+","+"'"+biyomedikal+"'"+","+"'"+programlama+"'"+","+"'"+kontrol+"'"+","+"'"+fizik+"'"+","+"'"+kimya+"'"+","+"'"+matematik+"'"+","+"'"+
					astrofizik+"'"+","+"'"+tip+"'"+","+"'"+mekanikdizayn+"'"+","+"'"+telekominikasyon+"');";
	        return sql;
		}
		
		public String[] sqlHakemBilgiGetir(int girilenId) {
	    	
	    	Connection conn = null;
	        Statement stmt = null;
	        
	        try{
	        	
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Veritabanina baglaniliyor...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Baglanti basarili...");
				
				//Sorgular calýstýrlýr.
				System.out.println("Deyim oluþturuluyor...");
				stmt = conn.createStatement();
				String sql = "SELECT * FROM konferans.hakem_bilgi WHERE hakem_id="+girilenId+";";
				ResultSet rs = stmt.executeQuery(sql);
				
				// Veriler ayýklanýr.
				while(rs.next()){
				
				// Sutunlara göre degerlerý alýyoruz		
				  setHakem_id(rs.getInt("hakem_id"));
				  setAdsoyad(rs.getString("adsoyad"));
				  setHakem_mail(rs.getString("hakem_mail"));
				  setHakem_telefon(rs.getString("hakem_telefon"));
				  setHakem_kurum(rs.getString("hakem_kurum"));
				  
				  sqlHakemBilgisiGir.elektrik=rs.getString("elektrik");
				  sqlHakemBilgisiGir.elektronik=rs.getString("elektronik");
				  sqlHakemBilgisiGir.biyomedikal=rs.getString("biyomedikal");
				  sqlHakemBilgisiGir.programlama=rs.getString("programlama");
				  sqlHakemBilgisiGir.kontrol=rs.getString("kontrol");
				  sqlHakemBilgisiGir.fizik=rs.getString("fizik");
				  sqlHakemBilgisiGir.kimya=rs.getString("kimya");
				  sqlHakemBilgisiGir.matematik=rs.getString("matematik");
				  sqlHakemBilgisiGir.astrofizik=rs.getString("astrofizik");
				  sqlHakemBilgisiGir.tip=rs.getString("tip");
				  sqlHakemBilgisiGir.mekanikdizayn=rs.getString("mekanikdizayn");
				  sqlHakemBilgisiGir.telekominikasyon=rs.getString("telekominikasyon");					    
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
				        
				        String[] str= {Integer.toString(getHakem_id()),getAdsoyad(),getHakem_mail(),getHakem_telefon(),getHakem_kurum(),sqlHakemBilgisiGir.elektrik,sqlHakemBilgisiGir.elektronik,
				        		sqlHakemBilgisiGir.biyomedikal,sqlHakemBilgisiGir.programlama,sqlHakemBilgisiGir.kontrol,sqlHakemBilgisiGir.fizik,sqlHakemBilgisiGir.kimya,
				        		sqlHakemBilgisiGir.matematik,sqlHakemBilgisiGir.astrofizik,sqlHakemBilgisiGir.tip,sqlHakemBilgisiGir.mekanikdizayn,sqlHakemBilgisiGir.telekominikasyon};
				        
				        for(int i=0;i<=16;i++)
				        	System.out.println(str[i]);
				        
						return str;
				        }

		public int getHakem_id() {
			return hakem_id;
		}

		public void setHakem_id(int hakem_id) {
			this.hakem_id = hakem_id;
		}

		public String getAdsoyad() {
			return adsoyad;
		}

		public void setAdsoyad(String adsoyad) {
			this.adsoyad = adsoyad;
		}

		public String getHakem_mail() {
			return hakem_mail;
		}

		public void setHakem_mail(String hakem_mail) {
			this.hakem_mail = hakem_mail;
		}

		public String getHakem_telefon() {
			return hakem_telefon;
		}

		public void setHakem_telefon(String hakem_telefon) {
			this.hakem_telefon = hakem_telefon;
		}

		public String getHakem_kurum() {
			return hakem_kurum;
		}

		public void setHakem_kurum(String hakem_kurum) {
			this.hakem_kurum = hakem_kurum;
		}
		
		
		
	}




