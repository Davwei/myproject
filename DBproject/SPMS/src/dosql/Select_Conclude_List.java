package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_Conclude_List {
	Object[][] info;
	public  Select_Conclude_List() {
		ResultSet rs;
		String sql1="";
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
				
				info[count][0] = rs.getString(1);
				
				info[count][1] = rs.getString(2);
				
				info[count][2] = rs.getString(3);
				
				if(rs.getBoolean(4)){
					info[count][3] ="PASS";
				}else{
					info[count][3] ="UnderOperate";
				}
				
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
		Select_Conclude_List scl =new Select_Conclude_List();
		return scl.info;
	}
	
	

}
