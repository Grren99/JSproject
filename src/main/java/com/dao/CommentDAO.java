package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.util.DBmanger;
import com.vo.CategoryVO;
import com.vo.CommentVO;

public class CommentDAO {

	private CommentDAO() {
	}

	private static CommentDAO instance = new CommentDAO();

	public static CommentDAO getinstance() {
		return instance;
	}
	
	public void insertComment(CommentVO cvo) {
		String sql ="insert into comment (category_num,comname,content) VALUES (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, cvo.getCategory_num());
			ps.setString(2, cvo.getComname());
			ps.setString(3, cvo.getContent());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBmanger.close(con, ps);
		}
	}
	
	public List<CommentVO> getComment(String num) {

		String sql = "select * from comment where category_num = ? ";
		List<CommentVO> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				CommentVO cvo = new CommentVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setCategory_num(rs.getInt("category_num"));
				cvo.setComname(rs.getString("comname"));
				cvo.setContent(rs.getString("content"));
				list.add(cvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBmanger.close(con, ps, rs);
		}
		return list;
	}
	
	public void updateCommet(CommentVO cvo) {
		String sql ="update comment set content=? where num=?";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, cvo.getContent());
			ps.setInt(2, cvo.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBmanger.close(con, ps);
		}
	}
	
	public CommentVO selectCommentBynum(String num) {
		
		String sql ="select * from comment where num=?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CommentVO cvo = new CommentVO();
		
		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				cvo.setNum(rs.getInt("num"));
				cvo.setCategory_num(rs.getInt("category_num"));
				cvo.setContent(rs.getString("content"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBmanger.close(con, ps, rs);
		}
		return cvo;
	}
	
	public void CommentDeleteNum(String num) {
		String sql = "delete from comment where num=?";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, num);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBmanger.close(con, ps);
		}
	}
	
}
