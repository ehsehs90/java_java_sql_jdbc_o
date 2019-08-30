package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test03 {

	public static void main(String[] args) {
		String sname = JOptionPane.showInputDialog("search emp");
		sname = "%" + sname + "%";
		String sql = "select * from emp where upper(ename) like ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, sname.toUpperCase());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.println(rs.getDate("hiredate"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			JDBCUtil.close(con, ps, rs);
		}
	}

}
