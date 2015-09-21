package dosql;

import java.sql.SQLException;

public class Delete_Team {
	public Delete_Team(String s,String team){
		Conn c;
		
		String sql ="Delete from Team where (Team_ID ='"+team+"') and (Stu_ID ='"+s+"') and isCap !='1'";
		c = new Conn(sql);
		try {
			c.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
