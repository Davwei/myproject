package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.Stu;

public class Insert_Want_Proj {
	
	public Insert_Want_Proj(String sid,String proj_id) throws SQLException{
		int count =0;
		String sql2 ="Select * from Apply_List where (Stu_ID ='"+sid+"' and Proj_ID ='"+proj_id+"')";
		String sql1 ="Select * from Apply_List";
		
		
		
		Conn c1 =new Conn(sql1);
		Conn c2 =new Conn(sql2);
		ResultSet rs1=null,rs2=null;
		rs2=c2.stmt.executeQuery(sql2);
		while(rs2.next())count++;
		if(count ==0){
			
			rs1=c1.stmt.executeQuery(sql1);
			while(rs1.next())count++;
			int aid =count+1;
			Calendar cal=Calendar.getInstance(); 
			/*int y,m,d;
			y=cal.get(cal.YEAR);
			m=cal.get(cal.MONTH);
			d=cal.get(cal.DATE);*/
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
			String date =sdf.format(cal.getTime());
			String sql="INSERT INTO `Apply_List` (`Apply_ID`, `Stu_ID`, `Proj_ID`,`Time`,`status`)VALUES('"+aid+"','"+sid+"','"+proj_id+"','"+date+"',0)";
			Conn c =new Conn(sql);
			c.stmt.executeUpdate(sql);
			c.close();
			
		}else{
			//being
		}
		
		
			
			
			
		c1.close();
		c2.close();
	}

}
