package test.scott;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("JDBC Test");
		String sql = "select * from dept";
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pw = "TIGER";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("deptno")+" ");
				System.out.print(rs.getString("dname")+" ");
				System.out.println(rs.getString("loc"));
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("jdbc driver 확인 필요");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
				try {
					if(con != null)rs.close();
					if(con != null)st.close();
					if(con != null)con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("end");
	}

}
