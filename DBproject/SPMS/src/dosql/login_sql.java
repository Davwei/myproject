package dosql;

import java.sql.*;
import front.*;
public class login_sql {
	Stu_front s;
	public login_sql(){
		
	}
	public static void main(String args[]){
		//if(login_sql.check1("201300301249", "123"))System.out.println("Yes!!");
		
	}
	public static boolean check1(String ID, String pw) {
		boolean isfeat=false;
		Conn c3 =null;
		ResultSet rs=null;
		int count=0;
		try {
			String sql1="Select `Stu_ID` from `Stu` Where Stu_ID='"+ID+"'AND passw='"+pw+"'";
			c3 =new Conn(sql1);
			rs = c3.stmt.executeQuery(sql1);
			while(rs.next())count++;			
			if(count==1)isfeat =true;
			//System.out.println("count is "+count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			c3.close();
		}
		return isfeat;
	}
	public static boolean check2(String ID, String pw) {
		boolean isfeat=false;
		Conn c3 =null;
		ResultSet rs=null;
		int count=0;
		try {
			String sql1="Select `Tea_ID` from `Tea` Where Tea_ID='"+ID+"'AND passw='"+pw+"'";
			c3 =new Conn(sql1);
			rs = c3.stmt.executeQuery(sql1);
			while(rs.next())count++;			
			if(count==1)isfeat =true;
			//System.out.println("count is "+count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			c3.close();
		}
		return isfeat;
	}
	public static boolean check3(String ID, String pw) {
		boolean isfeat=false;
		Conn c3 =null;
		ResultSet rs=null;
		int count=0;
		try {
			String sql1="Select `Admin_ID` from `Admin` Where Admin_ID='"+ID+"'AND passw='"+pw+"'";
			c3 =new Conn(sql1);
			rs = c3.stmt.executeQuery(sql1);
			while(rs.next())count++;			
			if(count==1)isfeat =true;
			//System.out.println("count is "+count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			c3.close();
		}
		return isfeat;
	}
}
