package test.scott;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("JDBC start");
		String sql = "select deptno, round(avg(sal),2), count(*)"
				+ " from emp"
				+ " group by deptno";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.println(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, rs);
		}
		
		System.out.println("end");
	}

}
