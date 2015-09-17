package dosql;

import java.sql.SQLException;

import utils.Stu;

public class Insert_Join_Team {
	
	public Insert_Join_Team(String Teamid,String selfintro,String s) throws SQLException{
		
		
		
		String sql="INSERT INTO `Join_Team` (`Team_ID`, `Stu_ID`, `Self_Intro`)VALUES('"+Teamid+"','"+s+"','"+selfintro+"')";
		Conn c =new Conn(sql);
		
		c.stmt.executeUpdate(sql);
			
			
			
		c.close();
		
	}

}
