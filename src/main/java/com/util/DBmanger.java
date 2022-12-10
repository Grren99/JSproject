package com.util;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class DBmanger {

	public static Connection getConnection() {
		Connection con = null;
		// dbcp 연결
		try {
			Context init = new InitialContext();
			Context env = (Context)init.lookup("java:/comp/env");
			DataSource ds = (DataSource)env.lookup("jdbc/TestDB");
			con = ds.getConnection();
			System.out.println("succees");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			con.close();
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection con, Statement st) {
		try {
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
