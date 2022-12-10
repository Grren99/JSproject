package com.wnsrl.controller.action;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.Normalizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.CategoryDAO;
import com.mysql.cj.Session;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.vo.CategoryVO;

public class WriteAction implements Action {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		requset.setCharacterEncoding("UTF-8");
		
		System.out.println("넘어와짐넘어와짐");
		CategoryVO cvo = new CategoryVO();
		String enType = "UTF-8";
		
		
		MultipartRequest multi = null;
		int maxSize = 10 * 1024 * 1024;
		ServletContext context = requset.getServletContext();
		String path = context.getRealPath("upload");
		
//		String path = requset.getSession().getServletContext().getRealPath("/save");
		
		System.out.println(path);
		try{
            multi=new MultipartRequest(
                    requset
                    , path
                    , maxSize
                    , enType
                    , new DefaultFileRenamePolicy()); 
 
         }catch (Exception e) {
                e.printStackTrace();
         } 
		//////////////////메모매ㅔ모메모메모메모메
		String image = multi.getFilesystemName("image");
		//////////////////메메메메모모모모모모모모모모모모모모모모모모모모모뫃모모

		if(image != null) {
			image = Normalizer.normalize(image, Normalizer.Form.NFC);
		}
		
		int categoryname = Integer.parseInt(multi.getParameter("categoryname"));
		String title = multi.getParameter("title");
		String content = multi.getParameter("content");
		String name = multi.getParameter("name");
		String username = multi.getParameter("username");
		String created = multi.getParameter("created");
		
		cvo.setImage(image);
		cvo.setCategoryname(categoryname);
		cvo.setTitle(title);
		cvo.setContent(content);
		cvo.setName(name);
		cvo.setUsername(username);
		cvo.setCreated(created);
		
		CategoryDAO cdao = CategoryDAO.getinstance();
		cdao.insertWrite(cvo);
		
		requset.setAttribute("categoryname", categoryname);
		new CategoryAction().execute(requset, response);
		
		
		/*
		cvo.setCategoryname(Integer.parseInt(requset.getParameter("categoryname")));
		cvo.setTitle(requset.getParameter("title"));
		cvo.setContent(requset.getParameter("content"));
		cvo.setName(requset.getParameter("name"));
		cvo.setImage(requset.getParameter("image"));
		cvo.setUsername(requset.getParameter("username"));
		cvo.setCreated(requset.getParameter("created"));
		*/
		
//		CategoryDAO cdao = CategoryDAO.getinstance();
//		cdao.insertWrite(cvo);
//		new CategoryAction().execute(requset, response);
	}
}
