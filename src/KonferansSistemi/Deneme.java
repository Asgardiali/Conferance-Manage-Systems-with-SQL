package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Deneme {
	
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
    static int number1=0;
    static hakemKisi [] hakemBilgi ;
    static int k=0;
    
    static String yazar_id;
    static String yazar_adisoyadi;
    static String yazar_mail;
    static String yazar_telefon;
    static String yazar_kurum;
    static String yazar_Bbaslik;
    static String yazar_Bozet;
    static String yazar_anhkelm;
    static String yazar_bildiri;
    static String y_elektrik_data;
    static String y_elektronik_data;
    static String y_biyomedikal_data;
    static String y_programlama_data;
    static String y_kontrol_data;
    static String y_fizik_data;
    static String y_kimya_data;
    static String y_matematik_data;
    static String y_astrofizik_data;
    static String y_tip_data;
    static String y_mekanikdizayn_data;
    static String y_telekominikasyon_data;
    static yazarKisi yazar;
    static int yazarSayi;
    static int number=0;
    static int boy=0;
    static int t=0;
    static yazarKisi [] yazarBilgi;
    
    static String [] konuID1= {};
    
public static void main(String[] args) {
	
	
	
	for(int i=0;i<=yazarSayisi();i++) {
		
		for(int j=0;j<=hakemSayisi();j++) {
			
			
		}
	}
	
	System.out.println(hakemSayisi());
	System.out.println(hakemSayisi());
	System.out.println(hakemSayisi());
	int a=hakemSayisi();
	//System.out.println(a);
	
	while(k<=a) {
		
		k++;
		//System.out.println(k);
	}

	/*
	hakemKisi hakemKonu;
	while(k<=hakemSayisi()) {
		
		hakemKonu=hakemVeri(k);
		k++;
		System.out.println(hakemKonu);
	}
	*/
	
	
}
   





 public static int hakemSayisi() {
	 hakemSayi=0;
    	
    	
    	
        Connection conn = null;
        Statement stmt = null;
        try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				//System.out.println("Veritabanina baglaniliyor...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				//System.out.println("Baglanti basarili...");
				
				//Sorgular calýstýrlýr.
				//System.out.println("Deyim oluþturuluyor...");
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
 
 public static int yazarSayisi() {
	 
	 yazarSayi=0;
 	
 	
 		
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
				String sql = "SELECT yazar_id FROM konferans.yazar_bilgi ;";
				ResultSet rs = stmt.executeQuery(sql);
					
				while(rs.next()){
					yazarSayi++;
				
					// Sutunlara göre degerlerý alýyoruz
					yazar_id  =Integer.toString(rs.getInt("yazar_id"));
					
					
				    //Verileri görüntüle - yaz
				/*        System.out.println("ID : " + id);
				    System.out.println("ADI VE SOYADI : " + adiSoyadi);
				    System.out.println("MAIL : " + mail);
				*/        
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
     
     
     return yazarSayi;
 	
 }
 
 public static yazarKisi yazarVeri(int t) {
	 
	 number=yazarSayisi();
 	Connection conn1 = null;
 	Statement stmt1 = null;
 	try{
 		Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Veritabanina baglaniliyor...");
		    conn1 = DriverManager.getConnection(DB_URL, USER, PASS);
		    System.out.println("Baglanti basarili...");
		    
		    //Sorgular calýstýrlýr.
		    System.out.println("Deyim oluþturuluyor...");
		    stmt1 = conn1.createStatement();
		    String sql = "SELECT * FROM konferans.yazar_bilgi WHERE yazar_id>=100 ;";
		    ResultSet rs = stmt1.executeQuery(sql);
 
 // Veriler ayýklanýr.

 
 
 while(rs.next()){
 
	 	// Sutunlara göre degerlerý alýyoruz
	 	yazar_id  =Integer.toString(rs.getInt("yazar_id"));
	 	yazar_adisoyadi = rs.getString("adsoyad");
	 	yazar_mail= rs.getString("yazar_mail");
	 	yazar_telefon= rs.getString("yazar_telefon");
	 	yazar_kurum= rs.getString("yazar_kurum");
		yazar_Bbaslik = rs.getString("bildiri_basligi"); 
		yazar_Bozet = rs.getString("bildiri_ozet");
		yazar_anhkelm = rs.getString("keywords");
		yazar_bildiri = rs.getString("bildiri");
		
		y_elektrik_data= rs.getString("elektrik");
		y_elektronik_data= rs.getString("elektronik");
		y_biyomedikal_data= rs.getString("biyomedikal");        
		y_programlama_data  =rs.getString("programlama");
		y_kontrol_data = rs.getString("kontrol");
		y_fizik_data= rs.getString("fizik");
		y_kimya_data= rs.getString("kimya");
		y_matematik_data= rs.getString("matematik");
		y_astrofizik_data= rs.getString("astrofizik");
		y_tip_data= rs.getString("tip");
		y_mekanikdizayn_data= rs.getString("mekanikdizayn");
		y_telekominikasyon_data= rs.getString("telekominikasyon");
     
     
     yazarBilgi = new yazarKisi[number];
     
     	yazar = new yazarKisi( yazar_id,  yazar_adisoyadi,  yazar_mail,  yazar_telefon,
     			yazar_kurum,  yazar_Bbaslik,  yazar_Bozet,  yazar_anhkelm,  yazar_bildiri,
     			y_elektrik_data,  y_elektronik_data,  y_biyomedikal_data,  y_programlama_data,
     			y_kontrol_data,  y_fizik_data,  y_kimya_data,  y_matematik_data,  y_astrofizik_data,
     			y_tip_data,  y_mekanikdizayn_data,  y_telekominikasyon_data);
     	
     	yazarBilgi[t]=yazar;

     	for(int k=0;k<veriCekmeHakem.hakemSayisi();k++) {
    	
     	   	if((yazarBilgi[t].y_elektrik_data).equals(veriCekmeHakem.hakemBilgi[k].elektrik_data)) {
     	   		
     	   		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
 				boy++;
     	   	}
     	   	if((yazarBilgi[t].y_elektronik_data).equals(veriCekmeHakem.hakemBilgi[k].elektronik_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        			       		
	        	}
	        	if((yazarBilgi[t].y_biyomedikal_data).equals(veriCekmeHakem.hakemBilgi[k].biyomedikal_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;

	        	}
	        	if((yazarBilgi[t].y_programlama_data).equals(veriCekmeHakem.hakemBilgi[k].programlama_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}	        		        	
	        	if((yazarBilgi[t].y_kontrol_data).equals(veriCekmeHakem.hakemBilgi[k].kontrol_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_fizik_data).equals(veriCekmeHakem.hakemBilgi[k].fizik_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_kimya_data).equals(veriCekmeHakem.hakemBilgi[k].kimya_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_matematik_data).equals(veriCekmeHakem.hakemBilgi[k].matematik_data)){
	        		
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_astrofizik_data).equals(veriCekmeHakem.hakemBilgi[k].astrofizik_data)){
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_tip_data).equals(veriCekmeHakem.hakemBilgi[k].tip_data)){
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_mekanikdizayn_data).equals(veriCekmeHakem.hakemBilgi[k].mekanikdizayn_data)){
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
	        	if((yazarBilgi[t].y_telekominikasyon_data).equals(veriCekmeHakem.hakemBilgi[k].telekominikasyon_data)){
	        		konuID1[boy]=veriCekmeHakem.hakemBilgi[k].hakem_id;
	        		boy++;
	        		
	        	}
    
     
     }
 }
 rs.close();
 }catch(SQLException se){
 	se.printStackTrace();
 	}catch(Exception e){
 		e.printStackTrace();
 		}
         finally{
         	try{
         		if(stmt1!=null)
         			conn1.close();
             }catch(SQLException se){
             }
             try{
                 if(conn1!=null)
                     conn1.close();
             }catch(SQLException se){
                 se.printStackTrace();
             }
         }
	return yazarBilgi[t];
	

 }
 
 
 public static hakemKisi hakemVeri(int k) {
	 
		number1=hakemSayisi();
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
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    // Veriler ayýklanýr.
		
		    
		    
		    while(rs.next()){
		    
		    	// Sutunlara göre degerlerý alýyoruz
		    	hakem_id  =Integer.toString(rs.getInt("hakem_id"));
		        hakem_adisoyadi = rs.getString("adsoyad");
		        hakem_mail= rs.getString("hakem_mail");
		        hakem_telefon= rs.getString("hakem_telefon");
		        hakem_kurum= rs.getString("hakem_kurum");
		        elektrik_data= rs.getString("elektrik");
		        elektronik_data= rs.getString("elektronik");
		        biyomedikal_data= rs.getString("biyomedikal");        
		        programlama_data  =rs.getString("programlama");
		        kontrol_data = rs.getString("kontrol");
		        fizik_data= rs.getString("fizik");
		        kimya_data= rs.getString("kimya");
		        matematik_data= rs.getString("matematik");
		        astrofizik_data= rs.getString("astrofizik");
		        tip_data= rs.getString("tip");
		        mekanikdizayn_data= rs.getString("mekanikdizayn");
		        telekominikasyon_data= rs.getString("telekominikasyon");
		        
		        hakemBilgi = new hakemKisi[number1];
		        
		        
		        
		        
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
		return hakemBilgi[k];
    	
    	    	
 }
 }
