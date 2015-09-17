package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_Tea_List {
	Object[][] info;
	public Select_Tea_List(){
		ResultSet rs=null;
		
		String sql1="SELECT Tea_ID,Tea_Name from Tea";
		Conn c =new Conn(sql1);
		int count = 0;
			
		try {
			rs=c.pst.executeQuery();
			
			while(rs.next()){
			count++;
			}
			info = new Object[count][3];
			
			count=0;
			rs =c.pst.executeQuery(sql1);
			while(rs.next()){
				
				info[count][0] = rs.getString("Tea_ID");
				
				info[count][1] = rs.getString("Tea_Name");
				
							
				count++;
				}
			
			
			
			c.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static Object[][] getInfo() {
		Select_Tea_List stl =new Select_Tea_List();
		return stl.info;
	}
	
}
