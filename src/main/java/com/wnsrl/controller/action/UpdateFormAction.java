package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CategoryDAO;
import com.vo.CategoryVO;

public class UpdateFormAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String url ="Project/Update.jsp";
		String num = requset.getParameter("num");
		
		CategoryDAO cdao = CategoryDAO.getinstance();
		CategoryVO cvo = cdao.getCategory(num);
		requset.setAttribute("category", cvo);
		
		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
		
	}
}
