package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Select_Stu_List {
	Object[][] info;
	public static Object[][] getInfo() {
		 Select_Stu_List ssl =new  Select_Stu_List();
		return ssl.info;
	}
	
	public Select_Stu_List(){
		ResultSet rs=null;
		
		String sql1="SELECT Stu_ID,Stu_Name,Stu_Class from Stu";
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
				
				info[count][0] = rs.getString("Stu_ID");
				
				info[count][1] = rs.getString("Stu_Name");
				
				info[count][2] = rs.getString("Stu_Class");
				
				
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
