package test;

import java.sql.*;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;

public class Test {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;DataBaseName=bbs";
	private static final String DBNAME = "sa";
	private static final String DBPASS = "sa123456";
	
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		User user = new User();
		user.setUName("qqq");
		user.setUPass("qqq");
		user.setHead("qqq.gif");
		user.setRegTime(new Date(System.currentTimeMillis()));
		user.setGender(1);
		userDao.addUser(user);
	}
	public int addUser(User user){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,DBNAME,DBPASS);
			String sql = "insert into TBL_USER(uName,uPass,head,regTime,gender) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);//预编译
			ps.setString(1, user.getUName());
			ps.setString(2, user.getUPass());
			ps.setString(3, user.getHead());
			//ps.setDate(4, user.getRegTime());
			ps.setInt(5, user.getGender());
			
			int num = ps.executeUpdate();
			
			if(num > 0) {
				return 1;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		} finally {
			try {
			
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	public User findUser(int uId) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,DBNAME,DBPASS);
			String sql = "select * from TBL_USER where uId='" + uId +"'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			User user = null;
			if(rs.next()) {
				user = new User();
				user.setUId(rs.getInt("uId"));
				user.setUName(rs.getString("uName"));
				user.setUPass(rs.getString("uPass"));
				user.setHead(rs.getString("head"));
			}
			return user;
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	public User findUser(String uName) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,DBNAME,DBPASS);
			String sql = "select * from TBL_USER where uName='" + uName +"'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			User user = null;
			if(rs.next()) {
				user = new User();
				user.setUId(rs.getInt("uId"));
				user.setUName(rs.getString("uName"));
				user.setUPass(rs.getString("uPass"));
				user.setHead(rs.getString("head"));
			}
			return user;
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
}
