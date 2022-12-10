package com.wnsrl.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteFormAction implements Action{

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String url="Project/Write.jsp";
		
		RequestDispatcher rd = requset.getRequestDispatcher(url);
		rd.forward(requset, response);
		
	}
}
