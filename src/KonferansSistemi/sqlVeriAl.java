package KonferansSistemi;

import java.sql.*;


public class sqlVeriAl {
	
	
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/konferans";
    static final String USER = "root";
    static final String PASS = "1234";
    
    public static void main(String[] args) {
    	    		
    		String adsoyad = null;
    		String id="137";
    		int idInt = Integer.parseInt(id);
    		            Connection conn = null;
    		            Statement stmt = null;
    		            try{
    		    Class.forName("com.mysql.jdbc.Driver");
    		    System.out.println("Veritabanina baglaniliyor...");
    		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		    System.out.println("Baglanti basarili...");
    		    
    		    //Sorgular calýstýrlýr.
    		    System.out.println("Deyim oluþturuluyor...");
    		    stmt = conn.createStatement();
    		    String sql = "SELECT adsoyad FROM konferans.hakem_bilgi WHERE hakem_id="+id+";";
    		    ResultSet rs = stmt.executeQuery(sql);
    		    
    		    // Veriler ayýklanýr.
    		    
    		    while(rs.next()){
    		    
    		    	// Sutunlara göre degerlerý alýyoruz
    		       
    		        adsoyad = rs.getString("adsoyad");
    		        
    		        
    		        //Verileri görüntüle - yaz
    		       
    		        System.out.println("ADI VE SOYADI : " + adsoyad);
    		        
    		        
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
    		            
    		            
    }
}
    		          
  