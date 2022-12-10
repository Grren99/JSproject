package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CategoryDAO;
import com.vo.CategoryVO;

public class UpdateAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		requset.setCharacterEncoding("UTF-8");
		CategoryVO cvo = new CategoryVO();
		
		cvo.setNum(Integer.parseInt(requset.getParameter("num")));
		cvo.setTitle(requset.getParameter("title"));
		cvo.setContent(requset.getParameter("content"));
		cvo.setName(requset.getParameter("name"));
		cvo.setImage(requset.getParameter("image"));
		
		
		CategoryDAO cdao = CategoryDAO.getinstance();
		cdao.updateCategory(cvo);
//		requset.setAttribute("category", cvo);
		
		new MainListAction().execute(requset, response);
		
		
	}
}
