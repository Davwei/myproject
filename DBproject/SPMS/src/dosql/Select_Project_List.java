package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Select_Project_List {
	
	Object[][] info;
	public static Object[][] getInfo() {
		Select_Project_List spl =new Select_Project_List();
		return spl.info;
	}
	
	public Select_Project_List(){
		ResultSet rs=null;
		
		String sql1="SELECT Proj_ID,Proj_Name from Proj";
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
				
				info[count][0] = rs.getString("Proj_ID");
				
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
		
		}
	
	
	

