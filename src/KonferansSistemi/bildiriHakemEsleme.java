package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bildiriHakemEsleme {
	
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
    static String[][] hakemDepo= new String[100][14];;
    static int k=0;
    static String[] konular=new String[12]; 
    
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
    static yazarKisi [] yazarBilgi;
    static int yazarSayi=0;
    static int number=0;
    static int boy=0;
    static String[][] yazarDepo= new String[100][15];
    static int t=0;
    
    static String[][] idBildiriBilgileri=new String[100][10]; 
    
    static String [][] konuID1= new String[yazarSayisi()+1][hakemSayisi()+1];
    
    public static String[][] esleme() {
    	
    	//String konular[]= {"Elektrik","Elektronik","Biyomedikal","Programlama","Kontrol","Fizik","Kimya","Matematik","Astrofizik","Týp","MekanikDizayn","Telekominikasyon"};
    	
    	number1=yazarSayisi();
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
		    String sql = "SELECT * FROM konferans.yazar_bilgi WHERE yazar_id>=100 ;";
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    
	    		    
		    
    
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
        
        
        yazarBilgi = new yazarKisi[number1];
        
        	yazar = new yazarKisi( yazar_id,  yazar_adisoyadi,  yazar_mail,  yazar_telefon,
        			yazar_kurum,  yazar_Bbaslik,  yazar_Bozet,  yazar_anhkelm,  yazar_bildiri,
        			y_elektrik_data,  y_elektronik_data,  y_biyomedikal_data,  y_programlama_data,
        			y_kontrol_data,  y_fizik_data,  y_kimya_data,  y_matematik_data,  y_astrofizik_data,
        			y_tip_data,  y_mekanikdizayn_data,  y_telekominikasyon_data);
        	
        	yazarBilgi[t]=yazar;
        	
        	
        		yazarDepo[t][0]=yazarBilgi[t].y_elektrik_data;
        		yazarDepo[t][1]=yazarBilgi[t].y_elektronik_data;
        		yazarDepo[t][2]=yazarBilgi[t].y_biyomedikal_data;
        		yazarDepo[t][3]=yazarBilgi[t].y_programlama_data;
        		yazarDepo[t][4]=yazarBilgi[t].y_kontrol_data;
        		yazarDepo[t][5]=yazarBilgi[t].y_fizik_data;
        		yazarDepo[t][6]=yazarBilgi[t].y_kimya_data;
        		yazarDepo[t][7]=yazarBilgi[t].y_matematik_data;
        		yazarDepo[t][8]=yazarBilgi[t].y_astrofizik_data;
        		yazarDepo[t][9]=yazarBilgi[t].y_tip_data;
        		yazarDepo[t][10]=yazarBilgi[t].y_mekanikdizayn_data;
        		yazarDepo[t][11]=yazarBilgi[t].y_telekominikasyon_data;
        		yazarDepo[t][12]=yazarBilgi[t].yazar_id;
        		yazarDepo[t][13]=yazarBilgi[t].yazar_adisoyadi;
        		yazarDepo[t][14]=yazarBilgi[t].yazar_Bbaslik;

        	
        	
			System.out.println(yazarBilgi[t].y_elektrik_data);
			System.out.println(yazarBilgi[t].y_elektronik_data);
			System.out.println(yazarBilgi[t].y_biyomedikal_data);
			System.out.println(yazarBilgi[t].y_programlama_data);
			System.out.println(yazarBilgi[t].y_kontrol_data);
			System.out.println(yazarBilgi[t].y_fizik_data);
			System.out.println(yazarBilgi[t].y_kimya_data);
			System.out.println(yazarBilgi[t].y_matematik_data);
			System.out.println(yazarBilgi[t].y_astrofizik_data);
			System.out.println(yazarBilgi[t].y_tip_data);
			System.out.println(yazarBilgi[t].y_mekanikdizayn_data);
			System.out.println(yazarBilgi[t].y_telekominikasyon_data);
			System.out.println("**********************************");
			t++;
		      
    }
    //rs.close();
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
    	
    	
    	number=hakemSayisi();
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
		    String sql1 = "SELECT * FROM konferans.hakem_bilgi WHERE hakem_id>=100 ;";
		    ResultSet rs1 = stmt1.executeQuery(sql1);
		    
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
		        
		        hakemDepo[k][0]=hakemBilgi[k].elektrik_data;
		        hakemDepo[k][1]=hakemBilgi[k].elektronik_data;
		        hakemDepo[k][2]=hakemBilgi[k].biyomedikal_data;
		        hakemDepo[k][3]=hakemBilgi[k].programlama_data;
		        hakemDepo[k][4]=hakemBilgi[k].kontrol_data;
		        hakemDepo[k][5]=hakemBilgi[k].fizik_data;
		        hakemDepo[k][6]=hakemBilgi[k].kimya_data;
		        hakemDepo[k][7]=hakemBilgi[k].matematik_data;
		        hakemDepo[k][8]=hakemBilgi[k].astrofizik_data;
		        hakemDepo[k][9]=hakemBilgi[k].tip_data;
		        hakemDepo[k][10]=hakemBilgi[k].mekanikdizayn_data;
		        hakemDepo[k][11]=hakemBilgi[k].telekominikasyon_data;
		        hakemDepo[k][12]=hakemBilgi[k].hakem_id;
		        hakemDepo[k][13]=hakemBilgi[k].hakem_adisoyadi;
		        
		        
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
		    
		    //rs1.close();
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
    	
/*    	for(int y=0;y<12;y++)
    		System.out.println(yazarDepo[1][y]);
    	
    	
    	if(hakemDepo[0][0].equals(yazarDepo[2][0])) {
    		
    		System.out.println("deneme");
    		
    	}
    	else
    		System.out.println("girmedi"); 
*/
    	
    	
		int b=1;
		for(int t=0;t<yazarSayisi();t++) 
		{
			b=1;
			konuID1[t][0]=yazarDepo[t][14];
			
			for(k=0;k<hakemSayisi();k++) 
			{
				
				for(int z=0;z<12;z++) 
				{
					
					if(!yazarDepo[t][13].equals(hakemDepo[k][13]))
					{
						
						if(yazarDepo[t][z].equals(hakemDepo[k][z]))
						{
		    		    				
		    				konuID1[t][b]=hakemDepo[k][12];
		    				b++;
		    				break;
		    				}
						}
					else 
					{
						break;
						}
					}
				}
			}
		
		for(int t=0;t<yazarSayisi();t++){
			
			for(int s=0;s<b;s++) {
				
				//System.out.println(konuID1[t][s]);
				
			}
			
		}
		
		 return konuID1;
    }
    
    public static int yazarSayisi() {
    	yazarSayi=0;
    	
    	
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
