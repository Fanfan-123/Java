package danfeng.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
public class DBUtil {
	private static String driver=null;
	private static String url=null;
	private static String username=null;
	private static String password=null;
	
	static{
		ResourceBundle rb=ResourceBundle.getBundle("danfeng.Utils.jdbc");
		driver =rb.getString("jdbc.driver");
		url =rb.getString("jdbc.url");
		password =rb.getString("jdbc.password");
		username =rb.getString("jdbc.username");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return conn;	
	}
	
	public static void close(Connection conn, Statement st, ResultSet rs) {
		try {
			if(rs!=null){
				rs.close();
			}
			
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {

			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	}
	
	public static void close(Connection conn,Statement st){
		close(conn,st,null);
	}
	public static void close(Connection conn){
		close(conn,null,null);
	}
	
	public static void main(String []args){
	}
}
	
