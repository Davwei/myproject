package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

import utils.Stu;

public class Insert_Teammate {
	
	public Insert_Teammate(String stu,String s) throws SQLException{
		String Teamid =null;
		ResultSet rs;
		String sql1="Select Team_ID from Team where Stu_ID ='"+stu+"' and isCap = '1'";
		Conn c1 =new Conn(sql1);
		rs=c1.stmt.executeQuery(sql1);
		while(rs.next())
			Teamid =rs.getString(1);
		
		String sql="INSERT INTO `Team` (`Team_ID`, `Stu_ID`)VALUES('"+Teamid+"','"+s+"')";
		Conn c =new Conn(sql);
		
		c.pst.executeUpdate(sql);
			
			
			
		c.close();
		
	}

}