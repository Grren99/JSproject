package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CategoryDAO;
import com.vo.CategoryVO;

public class WriteView implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String url ="Project/Writeview.jsp";
		String num = requset.getParameter("num");
		
		CategoryDAO cdao = CategoryDAO.getinstance();
		CategoryVO cvo = cdao.getCategory(num);
		
		String path = requset.getServletContext().getRealPath("/save");
		
		requset.setAttribute("category", cvo);
		requset.setAttribute("imagePath", path);
		
		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
		
	}
}
