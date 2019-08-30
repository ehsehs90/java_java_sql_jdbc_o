package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test04_insert {

	public static void main(String[] args) {

		String sql = "insert into book(bookno,title,price) " + 
				"values((select nvl(max(bookno),0)+1 from book) , ?, ?)";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "jQuery");
			ps.setInt(2,  21000);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}
