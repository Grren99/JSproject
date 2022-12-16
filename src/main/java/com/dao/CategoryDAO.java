package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.util.DBmanger;
import com.vo.CategoryVO;

public class CategoryDAO {

	private CategoryDAO() {
	}

	private static CategoryDAO instance = new CategoryDAO();

	public static CategoryDAO getinstance() {
		return instance;
	}

	// Main 게시판 오름차순으로 보기
	public List<CategoryVO> selectAllCategoryMain() {

		String sql = "select * from category order by num desc";

		List<CategoryVO> list = new ArrayList<>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryVO cvo = new CategoryVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setCategoryname(rs.getInt("categoryname"));
				cvo.setTitle(rs.getString("title"));
				cvo.setContent(rs.getString("content"));
				cvo.setName(rs.getString("name"));
				cvo.setImage(rs.getString("image"));
				cvo.setUsername(rs.getString("username"));
				cvo.setCreated(rs.getString("created"));
				list.add(cvo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {

			}
		}

		return list;

	}

	// 카테고리 게시판 종류별로 보기
	public List<CategoryVO> selectAllCategory(int categoryname) {

		String sql = "select * from category where categoryname in(select ?)order by num desc";

		List<CategoryVO> list = new ArrayList<>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, categoryname);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryVO cvo = new CategoryVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setCategoryname(rs.getInt("categoryname"));
				cvo.setTitle(rs.getString("title"));
				cvo.setContent(rs.getString("content"));
				cvo.setName(rs.getString("name"));
				cvo.setImage(rs.getString("image"));
				cvo.setUsername(rs.getString("username"));
				cvo.setCreated(rs.getString("created"));
				list.add(cvo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {

			}
		}
		return list;

	}

	// num로 게시글 찾기
	public CategoryVO getCategory(String num) {
		CategoryVO cvo = null;

		String sql = "select * from Category where num=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();

			if (rs.next()) {
				cvo = new CategoryVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setCategoryname(rs.getInt("categoryname"));
				cvo.setTitle(rs.getString("title"));
				cvo.setContent(rs.getString("content"));
				cvo.setName(rs.getString("name"));
				cvo.setImage(rs.getString("image"));
				cvo.setUsername(rs.getString("username"));
				cvo.setCreated(rs.getString("created"));
			}

		} catch (Exception e) {
			e.addSuppressed(e);
		} finally {
			DBmanger.close(con, ps, rs);
		}
		return cvo;
	}

	// 게시글 쓰기
	public void insertWrite(CategoryVO cvo) {
		String sql = "insert into category(num,categoryname,title,content,name,image,username,created) values(null,?,?,?,?,?,?,default)";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, cvo.getCategoryname());
			ps.setString(2, cvo.getTitle());
			ps.setString(3, cvo.getContent());
			ps.setString(4, cvo.getName());
			ps.setString(5, cvo.getImage());
			ps.setString(6, cvo.getUsername());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanger.close(con, ps);
		}
	}

	public void updateCategory(CategoryVO cvo) {
		String sql = "update category set title=? ,content=? ,name=? ,image=? where num=?";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, cvo.getTitle());
			ps.setString(2, cvo.getContent());
			ps.setString(3, cvo.getName());
			ps.setString(4, cvo.getImage());
			ps.setInt(5, cvo.getNum());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanger.close(con, ps);
		}
	}

	public void deleteCategory(String num) {
		String sql = "delete from category where num=?";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBmanger.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, num);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBmanger.close(con, ps);
		}
	}
	
}
