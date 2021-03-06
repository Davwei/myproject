package dosql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sup_Insert_Conclude {
	public Sup_Insert_Conclude(String s,String team){
		Conn c1 =null,c2 = null;
		String sql1="Select Conclude_ID from Conclude_List";
		int count =0;
		ResultSet rs,rs1;
		c1 = new Conn(sql1);
		try {
			rs =c1.stmt.executeQuery(sql1);
			while(rs.next())
				count++;
			c1.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		String sql2="Insert Into Conclude_List (`Conclude_ID`,`Team_ID`) VALUES (?,?)";// where '"+s+"' in (select Stu_ID from Team where(Team_ID = '"+team+"'))
		try {
			c2 =new Conn(sql2);
			String str=String.valueOf(count+1).toString();
			c2.pst.setString(1, str);
			c2.pst.setString(2,team);
			c2.pst.executeUpdate();
			
			c2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
