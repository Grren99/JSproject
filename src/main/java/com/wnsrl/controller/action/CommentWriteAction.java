package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommentDAO;
import com.vo.CategoryVO;
import com.vo.CommentVO;
import com.wnsrl.controller.action.Action;

public class CommentWriteAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		
		CommentVO cvo = new  CommentVO();
		
		
		cvo.setCategory_num(Integer.parseInt(requset.getParameter("category_num")));
		cvo.setComname(requset.getParameter("comname"));
		cvo.setContent(requset.getParameter("content"));
		
		
		CommentDAO cdao = CommentDAO.getinstance();
		cdao.insertComment(cvo);
		
		response.sendRedirect("Project/Main.jsp");
		
	}
}
