package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_Teammate_List {
	Object[][] info;
	public Select_Teammate_List(String s){//this is  a team id
		
		Conn c;
		String sql = "Select Team.Stu_ID,Stu_Name from Team, Stu where Team_ID ='"+s+"' and Team.Stu_ID =Stu.Stu_ID";
		ResultSet rs;
		c =new Conn(sql);
		try {
			rs = c.stmt.executeQuery(sql);
			int count =0;
			while(rs.next()){
				count++;
				
			}
			System.out.println(count);
			info =new Object[count][2];
			
			count=0;
			rs =c.stmt.executeQuery(sql);
			while(rs.next()){
				
				info[count][0] = rs.getString(1);
				//System.out.println(info[count][0].toString());
				info[count][1] = rs.getString(2);
				
				count++;
				}
			
			
			
			c.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Object[][] getInfo(String s){
		Select_Teammate_List stl =new Select_Teammate_List(s);
		
		return stl.info;
		
	}
}