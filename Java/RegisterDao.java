package registrationPack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import loginPack.loginBean;

public class RegisterDao {
	
	private String url="jdbc:mysql://localhost:3306/person";
	private String uname="root";
	private String password="root";
	//private String dbDriver="com.mysql.jdbc.Driver";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	/*String query="select * from students where id=2";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String name=rs.getString("NAME");
	*/
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, uname, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String insert(Member member)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into member values(?,?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, member.getUname());
		ps.setString(2, member.getPassword());
		ps.setString(3, member.getEmail());
		ps.setString(4, member.getPhone());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}
	
	
	public boolean validate(loginBean LoginBean)
	{
		boolean status = false;
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		String sql = "select * from member where uname=? and password=?";
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, LoginBean.getUsername());
		ps.setString(2, LoginBean.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


}
