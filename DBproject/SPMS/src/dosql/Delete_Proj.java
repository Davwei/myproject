package dosql;

import java.sql.SQLException;

public class Delete_Proj {
	public Delete_Proj(String id){
		Conn c;
		
		String sql ="Delete from Proj where Proj_ID ='"+id+"'";
		c = new Conn(sql);
		try {
			c.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}