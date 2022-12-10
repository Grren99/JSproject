package com.wnsrl.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CategoryDAO;
import com.vo.CategoryVO;

public class MainListAction implements Action {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String url = "Project/Main.jsp";
		CategoryDAO cdao = CategoryDAO.getinstance();

		List<CategoryVO> categorylist = cdao.selectAllCategoryMain();
		requset.setAttribute("categorylist", categorylist);

		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
	}
}
