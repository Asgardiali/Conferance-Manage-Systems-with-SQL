package KonferansSistemi;

import java.sql.*;

public class sqlGirisBilgisiVeriGir {
	
	// JDBC driver ve Veritabaný URL
	// Veritabaný kullanýcý adý ve þifresi
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
	static final String USER = "root";
	static final String PASS = "1234";
	
	private int id;
	private String kullanici_adi;
	private String parola;
	private String kullanici_tipi;
	
	public sqlGirisBilgisiVeriGir(int id, String kullanici_adi, String parola, String kullanici_tipi) {
			
		this.id=id;
		this.kullanici_adi=kullanici_adi;
		this.parola=parola;
		this.kullanici_tipi=kullanici_tipi;
		
	}

	
	public void sqlKullaniciVeriGir(){
			
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
	             
	            stmt.executeUpdate(gonderKullaniciSql(getId(),getKullanici_adi(),getParola(),getKullanici_tipi()));
	        
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
	
	public String gonderKullaniciSql(int id,String kullanici_adi,String parola,String kullanici_tipi) {
		String sql = "INSERT INTO giris_bilgi " + "VALUES ("+ id +","+"'"+ kullanici_adi +"'"+","+"'"+ parola +"'"+","+"'"+ kullanici_tipi +"'"+");";
        return sql;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getKullanici_tipi() {
		return kullanici_tipi;
	}

	public void setKullanici_tipi(String kullanici_tipi) {
		this.kullanici_tipi = kullanici_tipi;
	}
	

}

