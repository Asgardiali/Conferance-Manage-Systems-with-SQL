package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Deneme2 {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
    static final String USER = "root";
    static final String PASS = "1234";
    
    static String hakem_id;
    static String hakem_adisoyadi;
    static String hakem_mail;
    static String hakem_telefon;
    static String hakem_kurum;
    static String elektrik_data;
    static String elektronik_data;
    static String biyomedikal_data;
    static String programlama_data;
    static String kontrol_data;
    static String fizik_data;
    static String kimya_data;
    static String matematik_data;
    static String astrofizik_data;
    static String tip_data;
    static String mekanikdizayn_data;
    static String telekominikasyon_data;
    static String [] konuID1=new String[100];
    static int number=0;
    static int hakemSayi=0;

    
public static void main(String[] args) {
	
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
	    String sql = "SELECT * FROM konferans.hakem_bilgi WHERE elektrik LIKE '%Elektrik%';";
	    ResultSet rs = stmt.executeQuery(sql);
	    
	    // Veriler ayýklanýr.
	
	    
	    
	    while(rs.next()){
	    
	    	// Sutunlara göre degerlerý alýyoruz
	    	hakem_id  =Integer.toString(rs.getInt("hakem_id"));
	        elektrik_data= rs.getString("elektrik");
	        
	        konuID1[number]=hakem_id;
	        number++;
	        //System.out.println(hakem_id);
	        
	        
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
	
	for(int i=0;i<=number-1;i++) {
		System.out.println(konuID1[i]);
	}
	
	
}


public static int hakemSayisi() {
	
	
	
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
			String sql = "SELECT hakem_id FROM konferans.hakem_bilgi ;";
			ResultSet rs = stmt.executeQuery(sql);
				
			while(rs.next()){
				hakemSayi++;				
				// Sutunlara göre degerlerý alýyoruz
				hakem_id  =Integer.toString(rs.getInt("hakem_id"));
			
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
    return hakemSayi;
    }
}


