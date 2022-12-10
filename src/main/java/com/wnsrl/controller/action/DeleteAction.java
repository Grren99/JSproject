package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CategoryDAO;

public class DeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String num = requset.getParameter("num");
		
		CategoryDAO cdao = CategoryDAO.getinstance();
		cdao.deleteCategory(num);
		new MainListAction().execute(requset, response);
		
	}
}
