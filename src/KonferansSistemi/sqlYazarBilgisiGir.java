package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlYazarBilgisiGir {

		// JDBC driver ve Veritabaný URL
		// Veritabaný kullanýcý adý ve þifresi
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
		static final String USER = "root";
		static final String PASS = "1234";
		
		private int yazar_id;
		private String adsoyad;
		private String yazar_mail;
		private String yazar_telefon;
		private String yazar_kurum;
		private String bildiri_basligi;
		private String bildiri_ozet;
		private String keywords;
		private String bildiri;
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
		
		public sqlYazarBilgisiGir() {
			
		}
		
		public sqlYazarBilgisiGir(int yazar_id, String adsoyad, String yazar_mail, String yazar_telefon,String yazar_kurum,String bildiri_basligi,String bildiri_ozet,String keywords,
				String bildiri,String elektrik,String elektronik,String biyomedikal,String programlama,String  kontrol,String fizik,String kimya,String matematik,
				String astrofizik,String tip,String mekanikdizayn,String telekominikasyon) {
			
			this.setYazar_id(yazar_id);
			this.setAdsoyad(adsoyad);
			this.setYazar_mail(yazar_mail);
			this.setYazar_telefon(yazar_telefon);
			this.setYazar_kurum(yazar_kurum);
			this.setBildiri_basligi(bildiri_basligi);
			this.setBildiri_ozet(bildiri_ozet);
			this.setKeywords(keywords);
			this.setBildiri(bildiri);
			sqlYazarBilgisiGir.elektrik=elektrik;
			sqlYazarBilgisiGir.elektronik=elektronik;
			sqlYazarBilgisiGir.biyomedikal=biyomedikal;
			sqlYazarBilgisiGir.programlama=programlama;
			sqlYazarBilgisiGir.kontrol=kontrol;
			sqlYazarBilgisiGir.fizik=fizik;
			sqlYazarBilgisiGir.kimya=kimya;
			sqlYazarBilgisiGir.matematik=matematik;
			sqlYazarBilgisiGir.astrofizik=astrofizik;
			sqlYazarBilgisiGir.tip=tip;
			sqlYazarBilgisiGir.mekanikdizayn=mekanikdizayn;
			sqlYazarBilgisiGir.telekominikasyon=telekominikasyon;	
			
		}
		
		public void sqlYazarBilgisiGiris(){
				
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
		            stmt.executeUpdate(gonderYazarSql(getYazar_id(),getAdsoyad(),getYazar_mail(),getYazar_telefon(),getYazar_kurum(),getBildiri_basligi(),getBildiri_ozet(),
		            		getKeywords(),getBildiri(),elektrik,elektronik,biyomedikal,programlama,kontrol,fizik,kimya,matematik,astrofizik,tip,mekanikdizayn,telekominikasyon));
		        
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
		
		public String gonderYazarSql(int yazar_id, String adsoyad, String yazar_mail, String yazar_telefon,String yazar_kurum,String bildiri_basligi,String bildiri_ozet,String keywords,
				String bildiri,String elektrik,String elektronik,String biyomedikal,String programlama,String  kontrol,String fizik,String kimya,String matematik,
				String astrofizik,String tip,String mekanikdizayn,String telekominikasyon) 
		{
			String sql = "INSERT INTO yazar_bilgi " + "VALUES ("+"'"+ yazar_id +"'"+","+"'"+ adsoyad +"'"+","+"'"+ yazar_mail+"'"+","+"'"+yazar_telefon+"'"+","+"'"+yazar_kurum+"'"+","+"'"+bildiri_basligi+"'"+","+"'"+bildiri_ozet+"'"+","+"'"+keywords+"'"+","+"'"+bildiri+"'"
					+","+"'"+elektrik+"'"+","+"'"+elektronik+"'"+","+"'"+biyomedikal+"'"+","+"'"+programlama+"'"+","+"'"+kontrol+"'"+","+"'"+fizik+"'"+","+"'"+kimya+"'"+","+"'"+matematik+"'"+","+"'"+astrofizik+"'"+","+"'"+tip+"'"+","+"'"+mekanikdizayn+"'"+","+"'"+telekominikasyon+"');";
	        return sql;
		}
		
		 public String[] sqlYazarBilgiGetir(int girilenId) {
		    	
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
					String sql = "SELECT * FROM konferans.yazar_bilgi WHERE yazar_id="+girilenId+";";
					ResultSet rs = stmt.executeQuery(sql);
					
					// Veriler ayýklanýr.
					while(rs.next()){
					
					// Sutunlara göre degerlerý alýyoruz		
					  setYazar_id(rs.getInt("yazar_id"));
					  setAdsoyad(rs.getString("adsoyad"));
					  setYazar_mail(rs.getString("yazar_mail"));
					  setYazar_telefon(rs.getString("yazar_telefon"));
					  setYazar_kurum(rs.getString("yazar_kurum"));
					  setBildiri_basligi(rs.getString("bildiri_basligi"));
					  setBildiri_ozet(rs.getString("bildiri_ozet"));
					  setKeywords(rs.getString("keywords"));
					  setBildiri(rs.getString("bildiri"));
					  	sqlYazarBilgisiGir.elektrik=rs.getString("elektrik");
					  	sqlYazarBilgisiGir.elektronik=rs.getString("elektronik");
						sqlYazarBilgisiGir.biyomedikal=rs.getString("biyomedikal");
						sqlYazarBilgisiGir.programlama=rs.getString("programlama");
						sqlYazarBilgisiGir.kontrol=rs.getString("kontrol");
						sqlYazarBilgisiGir.fizik=rs.getString("fizik");
						sqlYazarBilgisiGir.kimya=rs.getString("kimya");
						sqlYazarBilgisiGir.matematik=rs.getString("matematik");
						sqlYazarBilgisiGir.astrofizik=rs.getString("astrofizik");
						sqlYazarBilgisiGir.tip=rs.getString("tip");
						sqlYazarBilgisiGir.mekanikdizayn=rs.getString("mekanikdizayn");
						sqlYazarBilgisiGir.telekominikasyon=rs.getString("telekominikasyon");					    
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
					        
					        String[] str= {Integer.toString(getYazar_id()),getAdsoyad(),getYazar_mail(),getYazar_telefon(),getYazar_kurum(),getBildiri_basligi(),getBildiri_ozet(),
					        		getKeywords(),getBildiri(),sqlYazarBilgisiGir.elektrik,sqlYazarBilgisiGir.elektronik,sqlYazarBilgisiGir.biyomedikal,sqlYazarBilgisiGir.programlama,
					        		sqlYazarBilgisiGir.kontrol,sqlYazarBilgisiGir.fizik,sqlYazarBilgisiGir.kimya,sqlYazarBilgisiGir.matematik,sqlYazarBilgisiGir.astrofizik,sqlYazarBilgisiGir.tip,
					        		sqlYazarBilgisiGir.mekanikdizayn,sqlYazarBilgisiGir.telekominikasyon};
					        for(int i=0;i<=20;i++)
					        	System.out.println(str[i]);
					        
							return str;
					        }


		public int getYazar_id() {
			return yazar_id;
		}

		public void setYazar_id(int yazar_id) {
			this.yazar_id = yazar_id;
		}

		public String getAdsoyad() {
			return adsoyad;
		}

		public void setAdsoyad(String adsoyad) {
			this.adsoyad = adsoyad;
		}

		public String getYazar_mail() {
			return yazar_mail;
		}

		public void setYazar_mail(String yazar_mail) {
			this.yazar_mail = yazar_mail;
		}

		public String getYazar_telefon() {
			return yazar_telefon;
		}

		public void setYazar_telefon(String yazar_telefon) {
			this.yazar_telefon = yazar_telefon;
		}

		public String getYazar_kurum() {
			return yazar_kurum;
		}

		public void setYazar_kurum(String yazar_kurum) {
			this.yazar_kurum = yazar_kurum;
		}

		public String getBildiri_basligi() {
			return bildiri_basligi;
		}

		public void setBildiri_basligi(String bildiri_basligi) {
			this.bildiri_basligi = bildiri_basligi;
		}

		public String getBildiri_ozet() {
			return bildiri_ozet;
		}

		public void setBildiri_ozet(String bildiri_ozet) {
			this.bildiri_ozet = bildiri_ozet;
		}

		public String getKeywords() {
			return keywords;
		}

		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}

		public String getBildiri() {
			return bildiri;
		}

		public void setBildiri(String bildiri) {
			this.bildiri = bildiri;
		}

		
		
		
		
	}




