package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import util.JDBCUtil;
import vo.BookVO;

public class Test09_select_map {

	public static void main(String[] args) {
		
		String sql = "select * from book";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		Map<Integer, BookVO> books = new HashMap<Integer, BookVO>();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			//System.out.println("bookno\ttitle\tauthor\tprice\tpubdate");
			while(rs.next()) {
				/*
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getInt(4) + "\t");
				System.out.println(rs.getDate(5) + "\t");
				*/
				BookVO book = new BookVO();
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				book.setTitle(rs.getString("title"));
				book.setBookno(rs.getInt("bookno"));
				book.setPubdate(rs.getDate("pubdate").toString());
				books.put(book.getBookno(), book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			JDBCUtil.close(con, ps, rs);
		}
		books.forEach((i,b)->System.out.println(b));
	}

}
