package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class veriCekmeHakem {

	
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
    static hakemKisi hakem;
    static int hakemSayi=0;
    static int number=0;
    static hakemKisi [] hakemBilgi ;
    static int k=0;
    
    public static void main(String[] args) {
    	
    	number=hakemSayisi();
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
		    String sql = "SELECT * FROM konferans.hakem_bilgi WHERE hakem_id>=100 ;";
		    ResultSet rs1 = stmt.executeQuery(sql);
		    
		    // Veriler ayýklanýr.
		
		    
		    
		    while(rs1.next()){
		    
		    	// Sutunlara göre degerlerý alýyoruz
		    	hakem_id  =Integer.toString(rs1.getInt("hakem_id"));
		        hakem_adisoyadi = rs1.getString("adsoyad");
		        hakem_mail= rs1.getString("hakem_mail");
		        hakem_telefon= rs1.getString("hakem_telefon");
		        hakem_kurum= rs1.getString("hakem_kurum");
		        elektrik_data= rs1.getString("elektrik");
		        elektronik_data= rs1.getString("elektronik");
		        biyomedikal_data= rs1.getString("biyomedikal");        
		        programlama_data  =rs1.getString("programlama");
		        kontrol_data = rs1.getString("kontrol");
		        fizik_data= rs1.getString("fizik");
		        kimya_data= rs1.getString("kimya");
		        matematik_data= rs1.getString("matematik");
		        astrofizik_data= rs1.getString("astrofizik");
		        tip_data= rs1.getString("tip");
		        mekanikdizayn_data= rs1.getString("mekanikdizayn");
		        telekominikasyon_data= rs1.getString("telekominikasyon");
		        
		        hakemBilgi = new hakemKisi[number];
		        
		        
		        
		        
		       hakem=new hakemKisi(hakem_id, hakem_adisoyadi, hakem_mail, hakem_telefon,
		        		hakem_kurum, elektrik_data, elektronik_data, biyomedikal_data,
		        		programlama_data, kontrol_data, fizik_data, kimya_data, matematik_data,
		        		astrofizik_data, tip_data, mekanikdizayn_data, telekominikasyon_data);
		        
		        hakemBilgi[k]=hakem;
		        System.out.println(hakemBilgi[k].elektrik_data);
				System.out.println(hakemBilgi[k].elektronik_data);
				System.out.println(hakemBilgi[k].biyomedikal_data);
				System.out.println(hakemBilgi[k].programlama_data);
				System.out.println(hakemBilgi[k].kontrol_data);
				System.out.println(hakemBilgi[k].fizik_data);
				System.out.println(hakemBilgi[k].kimya_data);
				System.out.println(hakemBilgi[k].matematik_data);
				System.out.println(hakemBilgi[k].astrofizik_data);
				System.out.println(hakemBilgi[k].tip_data);
				System.out.println(hakemBilgi[k].mekanikdizayn_data);
				System.out.println(hakemBilgi[k].telekominikasyon_data);
				System.out.println("**********************************");
		        k++;
		        }
		    
		    
		    /*
		    for(int i=0;i<number-1;i++) {
				
			}
		    */
		    rs1.close();
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
    	for(int e=0;e<hakemSayisi();e++) {
    		System.out.println(hakemBilgi[k].hakem_id);
    	}
    	
    	
    	}  
    
    
 public static int hakemSayisi() {
	 
	 hakemSayi=0;
    	
    	
    	
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
				ResultSet rs1 = stmt.executeQuery(sql);
					
				while(rs1.next()){
					hakemSayi++;				
					// Sutunlara göre degerlerý alýyoruz
					hakem_id  =Integer.toString(rs1.getInt("hakem_id"));
				
				}
				rs1.close();
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


				
				
