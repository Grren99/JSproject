package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommentDAO;
import com.vo.CommentVO;

public class CommentUpdateFomrAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "Project/CommentUpdate.jsp";
		
		String num = requset.getParameter("num");
		
		CommentDAO cdao = CommentDAO.getinstance();
		CommentVO cvo = cdao.selectCommentBynum(num);
		requset.setAttribute("comment", cvo);
		
		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
		
	}
}
