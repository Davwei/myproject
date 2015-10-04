package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_Apply_List {
	
	Object[][] info;
	public Select_Apply_List(){
		ResultSet rs;
		String sql="Select * from Apply_List where status = 0";
		Conn c =new Conn(sql);
		try {
			rs=c.stmt.executeQuery(sql);
			//rs=c.stmt.getResultSet();
			int count=0;
			
			while(rs.next())
				count++;
			
			info =new Object[count][4];
			count=0;
			rs=c.stmt.executeQuery(sql);
			while(rs.next()){
				info[count][0]=rs.getString(1);
				info[count][1]=rs.getString(2); 
				
				info[count][2]=rs.getString(3); 
				info[count][3]=rs.getString(5); 
				count++;				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Object[][] getInfo() {
		Select_Apply_List sjt =new Select_Apply_List();
		return sjt.info;
	}
	
	
}
