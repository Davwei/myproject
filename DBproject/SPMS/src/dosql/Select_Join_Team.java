package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_Join_Team {
	
	Object[][] info;
	public Select_Join_Team(String s){//s is the Team leader's Stu_ID
		ResultSet rs;
		String sql="Select Join_Team.Team_ID,Join_Team.Stu_ID,Self_Intro from Join_Team,Team Where Join_Team.Team_ID = Team.Team_ID and Team.Stu_ID='"+s+"' and isCap = 1";
		Conn c =new Conn(sql);
		try {
			rs=c.stmt.executeQuery(sql);
			//rs=c.stmt.getResultSet();
			int count=0;
			
			while(rs.next())
				count++;
			
			info =new Object[count][3];
			count=0;
			rs=c.stmt.executeQuery(sql);
			while(rs.next()){
				info[count][0]=rs.getString(1);
				info[count][1]=rs.getString("Join_Team.Stu_ID"); 
				
				info[count][2]=rs.getString("Self_Intro"); 
				
				count++;				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Object[][] getInfo(String s) {
		Select_Join_Team sjt =new Select_Join_Team(s);
		return sjt.info;
	}
	
	
}
