package dosql;

import java.sql.*;
import java.util.ArrayList;

public class Select_Team_List {
	Object[][] info;
	public Select_Team_List(){
		ResultSet rs=null;
		
		String sql1="SELECT Apply_List.Stu_ID,Stu_Name,Proj_ID FROM Apply_List,Stu WHERE (Apply_List.Stu_ID in (SELECT Team.Stu_ID FROM Team ,Stu WHERE isCap= 1 and Team.Stu_ID =Stu.Stu_ID) )and Apply_List.Stu_ID=Stu.Stu_ID";
		Conn c =new Conn(sql1);
		int count = 0;
			
		try {
			rs=c.pst.executeQuery();
			
			while(rs.next()){
			count++;
			}
			info = new Object[count][4];
			
			count=0;
			rs =c.pst.executeQuery(sql1);
			while(rs.next()){
				
				info[count][0] = rs.getString("Team_ID");
				
				info[count][1] = rs.getString("Stu_ID");
				
				info[count][2] = rs.getString("Stu_Name");
				
				info[count][3] = rs.getString("Proj_ID");
				
				count++;
				}
			
			
			
			c.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}



	public static Object[][] getObject(){
		Select_Team_List stl =new Select_Team_List();
		
		return stl.info;
		

	}
}