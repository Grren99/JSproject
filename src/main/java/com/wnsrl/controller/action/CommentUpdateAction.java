package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommentDAO;
import com.vo.CommentVO;

public class CommentUpdateAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		requset.setCharacterEncoding("UTF-8");
		CommentVO cvo = new CommentVO();
		
		cvo.setNum(Integer.parseInt(requset.getParameter("num")));
		cvo.setContent(requset.getParameter("content"));
		
		requset.setAttribute("comment", cvo);
		
		CommentDAO cdao = CommentDAO.getinstance();
		cdao.updateCommet(cvo);
		
		response.sendRedirect("MainServlet?command=Comment_Update_form");;
		
		
		
	}
}
