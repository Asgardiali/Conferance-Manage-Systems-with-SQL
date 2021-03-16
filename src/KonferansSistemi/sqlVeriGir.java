package KonferansSistemi;

import java.sql.*;


public class sqlVeriGir {
	
	// JDBC driver ve Veritabaný URL
	// Veritabaný kullanýcý adý ve þifresi
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
	static final String USER = "root";
	static final String PASS = "1234";
	
	int id=108;
	String adSoyad;
	String mail;
	String kurum;
	String tel;
	String bildiriAdi;
	String bildiriOzet;
	String keywords;
	String bildiriKonularý;
	String bildiri;
	 
	public sqlVeriGir(int id,String ad,String soyad, String parola, String mail, int telefon, String yer){
		
		
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
	            String sql = "INSERT INTO bilgi_1 " + "VALUES ("+ id +","+ adSoyad +","+ mail +","+ kurum +","+ tel +","+ bildiriAdi +","+ bildiriOzet +","+ keywords +","+ bildiriKonularý +","+ bildiri +");";
	            stmt.executeUpdate(sql);
	        
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
	
}

