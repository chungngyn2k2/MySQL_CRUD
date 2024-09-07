package nguyen.dev.data;

import java.sql.PreparedStatement;

import com.mysql.cj.Constants;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OderImpl {
	private Constants conn;
	
	public OderImpl(Constants conn) {
		super();
		this.conn = conn;
	}

	public boolean insert() {
        String sql = "INSERT INTO ORDERS(ID, CODE, STATUS, USER_ID) VALUES(NULL, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "order Code");
            stmt.setString(2, "order Status");
            stmt.setInt(3, 1); //1 là id của user

            stmt.execute();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
	
	public boolean update() {
        String sql = "UPDATE ORDERS SET code = ?, status = ?, user_id = ? WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "order Code");
            stmt.setString(2, "order Status");
            stmt.setInt(3, 1); //1 là id của user
            stmt.setInt(4, 2); //2 là id của order cần cập nhật
            return stmt.execute();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}	
