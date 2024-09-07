package nguyen.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryImpl {
	private Connection conn;
	
	public CategoryImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public void findAll() {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Users WHERE ID > ? ";
	        try {
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, 0);
	            ResultSet rs = stmt.executeQuery();
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String email = rs.getString("email");
	                String password = rs.getString("password");
	                String role = rs.getString("role");
	                System.out.format("id:%d-email:%s-password:%s-role:%s", id, email, password, role).println();
	            }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}

	public void find() {
		// TODO Auto-generated method stub
		int id = 0;
		String sql = "SELECT * FROM USERS WHERE ID = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                System.out.format("id:%d-email:%s-password:%s-role:%s", id, email, password, role).println();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}

	public void select() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CATEGORIES";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String description = rs.getString("description");
				System.out.format("id:%d - name:%s - description:%s", id, name, description).println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete() {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM CATEGORIES WHERE ID = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao nam");
			stmt.setString(2, "Ao nu");
			stmt.setString(3, "Ao Dong tinh");
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void upadte() {
		// TODO Auto-generated method stub
		String sql = "UPDATE CATEGORIES SET NAME = ?, DESCRIPTION = ? WHERE ID = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao nam");
			stmt.setString(2, "Ao nu");
			stmt.setString(3, "Ao Dong tinh");
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert() {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CATEGORIES(NAME, DESCRIPTION) VALUES (?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao nam");
			stmt.setString(2, "Ao nu");
			stmt.setString(3, "Ao Dong tinh");
			
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
