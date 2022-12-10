package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;

public class BoardDAO {
	
	public BoardDAO() { 
		
	}
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getINstance() {
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
	
	
	
	
	
	
	
	
}
