package nguyen.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import nguyen.dev.data.CategoryImpl;
import nguyen.dev.data.ProductImpl;
import nguyen.dev.data.UserImpl;

public class MainAppCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = getConnection(); 
		CategoryImpl categoryImpl = new CategoryImpl(conn);
		categoryImpl.insert();
		categoryImpl.upadte();
		categoryImpl.delete();
		categoryImpl.select();
		categoryImpl.find();
		categoryImpl.findAll();
		
		UserImpl userImpl = new UserImpl(conn);
		userImpl.insert();
		
		ProductImpl productImpl = new ProductImpl(conn);
	}

	

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		final String DB_URL = "jdbc:mysql://localhost:3306/shop";
		final String USER = "root";
		final String PASS = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
