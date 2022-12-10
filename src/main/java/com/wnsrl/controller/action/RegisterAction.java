package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.vo.UserVO;

public class RegisterAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "Project/login.jsp";
		
		String userid = requset.getParameter("userid");
		String password = requset.getParameter("password");
		String name = requset.getParameter("name");
		
		UserVO uvo = new UserVO();
		uvo.setUserid(userid);
		uvo.setPassword(password);
		uvo.setName(name);
		
		HttpSession session = requset.getSession();
		UserDAO udao = UserDAO.getInstance();
		
		int result = udao.insertUser(uvo);
		if(result == 1) {
			session.setAttribute("username", uvo.getUserid());
		}else {
		}
		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
		
	}
}
