package dosql;

import java.sql.*;
import java.util.ArrayList;

public class Select_Team_List {
	ResultSet rs;
	public ArrayList<String>[][] al ;
	//�����Ķ���
	public Select_Team_List(){
	String sql =" ";//new a table about the num of team with its status is true
	
	try {
		Conn c = new Conn(sql);
		rs=c.stmt.executeQuery(sql);
		
		//set a table with \certain\ columns
		//used\ while(rs.next())\ to filled the table up
		
		
		
		c.close();
		rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
