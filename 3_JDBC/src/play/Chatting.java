package play;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex.DeptVO;
import util.JDBCUtil;

public class Chatting {
	public String getLog(){
		String log = null;
		String sql = "select * from chatlog where chatdate = (select max(chatdate) from chatlog)";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				log = rs.getString("username") + rs.getString("log");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		return log;
	}
	
	public int insertLog(String username, String chatlog) {
		String sql = "insert into chatlog (chatlog, username) values (?, ?)";
		int row = 0;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, chatlog);
			ps.setString(2, username);
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		return row;
	}
}
