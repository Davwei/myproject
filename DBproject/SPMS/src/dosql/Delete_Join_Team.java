package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete_Join_Team {
	
	public Delete_Join_Team(String stu){
		Conn c = null;
		Conn c1 = null ;
		ResultSet rs;
		String team=null;
		String sql1="Select Team_ID from Team where Stu_ID ='"+stu+"' and isCap = 1";
		
		try {
			c1 =new Conn(sql1);
			rs=c1.stmt.executeQuery(sql1);
			while(rs.next())
				team =rs.getString(1);
			c1.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		String sql="DELETE FROM `Join_Team` WHERE (`Team_ID`='"+team+"') AND (`Stu_ID`='"+stu+"')";
		
		try {
			c =new Conn(sql);
			c.stmt.executeUpdate(sql);
			
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}