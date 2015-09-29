package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

import utils.Stu;

public class Insert_Teammate {
	
	public Insert_Teammate(String sid,String Teamid,String s) throws SQLException{
		
		ResultSet rs;
		String sql1="Select Team_ID from Team where Stu_ID ='"+s+"' and Team_ID ='"+Teamid+"'and isCap = '1' ";
		Conn c1 =new Conn(sql1);
		rs=c1.stmt.executeQuery(sql1);
		int count =0;
		while(rs.next())
			count++;
		if(count==0){
			//wrong insert
		}else{
		String sql="INSERT INTO `Team` (`Team_ID`, `Stu_ID`)VALUES('"+Teamid+"','"+sid+"')";
		Conn c =new Conn(sql);
		
		c.pst.executeUpdate(sql);
			
			
			
		c.close();}
		
	}

}
