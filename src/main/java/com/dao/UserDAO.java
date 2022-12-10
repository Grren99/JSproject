package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.vo.UserVO;

public class UserDAO {
	
	public UserDAO() {
	}
	
	private static UserDAO instance = new UserDAO();
	
	public static UserDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection con = null;
		Context init = new InitialContext();
		Context env = (Context) init.lookup("java:/comp/env");
		DataSource ds = (DataSource) env.lookup("jdbc/TestDB");
		con = ds.getConnection();
		
		return con;
	}
	public int userCheck(String userid , String password) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from user where userid=?";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, userid);
			rs = ps.executeQuery();
			if(rs.next()) {
				if(password.equals(rs.getString("password"))) {
					result =2;
				}else {
					result =0;
				}
			}else {
				result= -1;
			}
			System.out.println(result);
			// 	 로그인 성공 = 2 // 비밀번호 다르면 = 0 // 아이디가 없으면 -1
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null)
					rs.close();
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			} catch (Exception e2) {
				
			}
		}
		return result;
	}
	
	public UserVO getUser(String userid) {
		String sql ="select * from user where userid=?";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		UserVO uvo = new UserVO();
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			rs = ps.executeQuery();
			if(rs.next()) {
				uvo.setUserid("userid");
				uvo.setPassword(rs.getString("password"));
				uvo.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null)
					rs.close();
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			} catch (Exception e2) {
				
			}
		}
		return uvo;
	}
	public int insertUser(UserVO uvo) {
		int result = 0;
		String sql = "insert into user values(?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, uvo.getUserid());
			ps.setString(2, uvo.getPassword());
			ps.setString(3, uvo.getName());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps !=null)
					ps.close();
				if(con != null)
					con.close();
			} catch (Exception e2) {
				
			}
		}
		
		return result;
	}
	
	
	
}
