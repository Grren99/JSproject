package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommentDAO;

public class CommentDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		
		String num = requset.getParameter("num");
		
		CommentDAO cdao = CommentDAO.getinstance();
		cdao.CommentDeleteNum(num);
		
		
		response.sendRedirect("MainServlet?command=Comment_Update_form");

	}
}
