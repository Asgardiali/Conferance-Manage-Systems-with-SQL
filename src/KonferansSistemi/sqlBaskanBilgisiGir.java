package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlBaskanBilgisiGir {
	


			// JDBC driver ve Veritabaný URL
			// Veritabaný kullanýcý adý ve þifresi
			static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
			static final String USER = "root";
			static final String PASS = "1234";
			
			private int baskan_id;
			private String baskan_adsoyad;
			private String baskan_mail;
			private String baskan_telefon;
			private String baskan_kurum;
			
			public sqlBaskanBilgisiGir() {
				
			}
			
			public sqlBaskanBilgisiGir(int baskan_id, String baskan_adsoyad, String baskan_mail, String baskan_telefon,String baskan_kurum) {
				
				this.setBaskan_id(baskan_id);
				this.setBaskan_adsoyad(baskan_adsoyad);
				this.setBaskan_mail(baskan_mail);
				this.setBaskan_telefon(baskan_telefon);
				this.setBaskan_kurum(baskan_kurum);
			}
			
			public void sqlBaskanBilgisiGiris(){
					
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
			            stmt.executeUpdate(gonderBaskanSql(getBaskan_id(),getBaskan_adsoyad(),getBaskan_mail(),getBaskan_telefon(),getBaskan_kurum()));
			        
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
			
			public String gonderBaskanSql(int baskan_id, String baskan_adsoyad, String baskan_mail, String baskan_telefon,String baskan_kurum) 
			{
				String sql = "INSERT INTO baskan_bilgi " + "VALUES ("+"'"+ baskan_id +"'"+","+"'"+ baskan_adsoyad +"'"+","+"'"+ baskan_mail+"'"+","+"'"+baskan_telefon+"'"+","+"'"+baskan_kurum+"');";
		        return sql;
			}


		
			
			public String[] sqlBaskanBilgiGetir(int girilenId) {
		    	
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
					String sql = "SELECT * FROM konferans.baskan_bilgi WHERE baskan_id="+girilenId+";";
					ResultSet rs = stmt.executeQuery(sql);
					
					// Veriler ayýklanýr.
					while(rs.next()){
					
					// Sutunlara göre degerlerý alýyoruz		
					  setBaskan_id(rs.getInt("baskan_id"));
					  setBaskan_adsoyad(rs.getString("baskan_adsoyad"));
					  setBaskan_mail(rs.getString("baskan_mail"));
					  setBaskan_telefon(rs.getString("baskan_telefon"));
					  setBaskan_kurum(rs.getString("baskan_kurum"));   
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
					        
					        String[] str= {Integer.toString(getBaskan_id()),getBaskan_adsoyad(),getBaskan_mail(),getBaskan_telefon(),getBaskan_kurum()};
					        
					        for(int i=0;i<5;i++)
					        	System.out.println(str[i]);
					        
							return str;
					        }
			
			public int getBaskan_id() {
				return baskan_id;
			}

			public void setBaskan_id(int baskan_id) {
				this.baskan_id = baskan_id;
			}

			public String getBaskan_adsoyad() {
				return baskan_adsoyad;
			}

			public void setBaskan_adsoyad(String baskan_adsoyad) {
				this.baskan_adsoyad = baskan_adsoyad;
			}

			public String getBaskan_mail() {
				return baskan_mail;
			}

			public void setBaskan_mail(String baskan_mail) {
				this.baskan_mail = baskan_mail;
			}

			public String getBaskan_telefon() {
				return baskan_telefon;
			}

			public void setBaskan_telefon(String baskan_telefon) {
				this.baskan_telefon = baskan_telefon;
			}

			public String getBaskan_kurum() {
				return baskan_kurum;
			}

			public void setBaskan_kurum(String baskan_kurum) {
				this.baskan_kurum = baskan_kurum;
			}

			
}
