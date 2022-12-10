package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.vo.UserVO;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {

		String userid = requset.getParameter("userid");
		String password = requset.getParameter("password");
		String url = null;
		System.out.println(userid);

		UserDAO userdao = UserDAO.getInstance();
		userdao.userCheck(userid, password);
		int result = userdao.userCheck(userid, password);
		if (result == 2) {
			UserVO user = userdao.getUser(userid);

			HttpSession session = requset.getSession();
			session.setAttribute("loginuser", user);
			session.setAttribute("result", result);

			url = "MainServlet?command=Main_list";
		} else {
			url = "Project/login.jsp";
			if (result == 1) {
				requset.setAttribute("message", "비밀번호가 다릅니다");
			} else if (result == 0) {
				requset.setAttribute("message", "아이디가 없습니다");
			}
		}
		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);

	}
}
