package KonferansSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlGirisBilgisiKarsilastir {

	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
    static final String USER = "root";
    static final String PASS = "1234";
    
    private int id;
	private String kullanici_adi;
	private String parola;
	private String kullanici_tipi;

    
 /*   public sqlGirisBilgisiKarsilastir(int id,String kullanici_adi,String parola,String kullanici_tipi) {
    	
    	this.setParola(parola);
    	this.setId(id);
    	this.setKullanici_adi(kullanici_adi);
    	this.setKullanici_tipi(kullanici_tipi);
    	
    }
  */  
    public int sqlIDGetir(int girilenId) {
    	
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
						String sql = "SELECT * FROM konferans.giris_bilgi WHERE ID="+girilenId+";";
						ResultSet rs = stmt.executeQuery(sql);
						
						// Veriler ayýklanýr.
						while(rs.next()){
						
						// Sutunlara göre degerlerý alýyoruz
						    setId(rs.getInt("ID"));
						 //   setKullanici_adi(rs.getString("kullanici_adi"));
						 //   setParola(rs.getString("parola"));
						 //   setKullanici_tipi(rs.getString("kullanici_tipi"));
						   					    
						 //Verileri görüntüle - yaz
						    System.out.println("ID : " + getId());
						 //   System.out.println("ADI VE SOYADI : " + getKullanici_adi());
						 //   System.out.println("PAROLA : " + getParola());
						 //   System.out.println("KULLANICI TÝPÝ : " + getKullanici_tipi());
						    
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
						        
								return id;
						        }
    
    public String sqlKullaniciTipiGetir(int girilenId) {
    	
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
			String sql = "SELECT kullanici_tipi FROM konferans.giris_bilgi WHERE ID="+girilenId+";";
			ResultSet rs = stmt.executeQuery(sql);
			
			// Veriler ayýklanýr.
			while(rs.next()){
			
			// Sutunlara göre degerlerý alýyoruz
			  //  setId(rs.getInt("ID"));
			 //   setKullanici_adi(rs.getString("kullanici_adi"));
			 //   setParola(rs.getString("parola"));
			    setKullanici_tipi(rs.getString("kullanici_tipi"));
			   					    
			 //Verileri görüntüle - yaz
			  //  System.out.println("ID : " + getId());
			 //   System.out.println("ADI VE SOYADI : " + getKullanici_adi());
			 //   System.out.println("PAROLA : " + getParola());
			    System.out.println("KULLANICI TÝPÝ : " + getKullanici_tipi());
			    
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
			        
			        return kullanici_tipi;
			        }


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKullanici_tipi() {
		return kullanici_tipi;
	}

	public void setKullanici_tipi(String kullanici_tipi) {
		this.kullanici_tipi = kullanici_tipi;
	}

	public String getKullanici_adi() {
		return kullanici_adi;
	}

	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
    }
