package play;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Properties p = new Properties();
		String s;
		try {
			p.load(new FileInputStream("C:\\lib\\dbinfo.txt"));
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");

			System.out.println(driver);
			System.out.println(url);
			System.out.println(user);
			System.out.println(pw);
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pw);
			PreparedStatement ps = con.prepareStatement("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
