package com.wnsrl.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CategoryDAO;
import com.dao.UserDAO;
import com.vo.CategoryVO;
import com.vo.UserVO;

public class CategoryAction implements Action {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {

		String url = "Project/Category.jsp";
		int categoryname = 0;
		
		/// 메모메모메모메
		if (requset.getParameter("categoryname") == null) {
			categoryname = Integer.parseInt(requset.getAttribute("categoryname").toString());
		} else {
			categoryname = Integer.parseInt(requset.getParameter("categoryname"));
		}
		//////////////////////
		
		
		System.out.println("dasdsadsada" + categoryname);

		CategoryDAO cdao = CategoryDAO.getinstance();
		List<CategoryVO> categorylist = cdao.selectAllCategory(categoryname);
		requset.setAttribute("categorylist", categorylist);
		requset.setAttribute("categoryname", categoryname);

//		HttpSession session = requset.getSession();
//		session.setAttribute("cate", categorylist);

		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
	}
}
