package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

import utils.Stu;

public class Insert_Proj {
	
	public Insert_Proj(String s,String name) throws SQLException{
		Conn c,c1;
		String sql1 ="Select Proj_ID from Proj";
		int count =0;
		ResultSet rs;
		
		
		c =new Conn(sql1);
		rs =c.stmt.executeQuery(sql1);
		while(rs.next())
			count++;
		
		String str=String.valueOf(count+1).toString();
		
		String sql="INSERT INTO `Proj` (`Proj_ID`,`Proj_Name`)VALUES('"+str+"','"+name+"')";
		c1 =new Conn(sql);
		
		c1.stmt.executeUpdate(sql);
			
			
			
		
		
	}

}
