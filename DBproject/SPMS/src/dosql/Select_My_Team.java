package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

import utils.Stu;

public class Select_My_Team {
	
	Object[][] info;
	public Select_My_Team(String s){
		ResultSet rs=null;
		
		String sql1="select Apply_List.Team_ID ,Proj_Name from Apply_List,Proj where (Apply_List.Team_ID in( select b.Team_ID from Team as b where Stu_ID ='"+s+"' ) AND Apply_List.Proj_ID =Proj.Proj_ID)";
		Conn c =new Conn(sql1);
		int count = 0;
			
		try {
			rs=c.pst.executeQuery();
			
			while(rs.next()){
			count++;
			}
			info = new Object[count][2];
			
			count=0;
			rs =c.pst.executeQuery(sql1);
			while(rs.next()){
				
				info[count][0] = rs.getString("Team_ID");
				
				info[count][1] = rs.getString("Proj_Name");
						
				count++;
				}
			
			
			
			c.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	public static Object[][] getInfo(String s) {
		
		Select_My_Team smt =new Select_My_Team(s);
		return smt.info;
	}
	
	

}
