package com.wnsrl.controller.action;

import java.io.IOException;
import java.text.Normalizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CategoryDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.vo.CategoryVO;

public class UpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		requset.setCharacterEncoding("UTF-8");
		CategoryVO cvo = new CategoryVO();

		String enType = "UTF-8";

		MultipartRequest multi = null;
		int maxSize = 10 * 1024 * 1024;
		ServletContext context = requset.getServletContext();
		String path = context.getRealPath("upload");
		

//		String path = requset.getSession().getServletContext().getRealPath("/save");

		System.out.println(path);
		try {
			multi = new MultipartRequest(requset, path, maxSize, enType, new DefaultFileRenamePolicy());

		} catch (Exception e) {
			e.printStackTrace();
		}
		////////////////// 메모매ㅔ모메모메모메모메
		int num = Integer.parseInt(multi.getParameter("num"));
		String image = multi.getFilesystemName("image");
		
		if(image != null) {
			image = Normalizer.normalize(image, Normalizer.Form.NFC);
		}
		String title = multi.getParameter("title");
		String content = multi.getParameter("content");
		String name = multi.getParameter("name");
		
		cvo.setNum(num);
		cvo.setImage(image);
		cvo.setTitle(title);
		cvo.setContent(content);
		cvo.setName(name);
		
		CategoryDAO cdao = CategoryDAO.getinstance();
		cdao.updateCategory(cvo);
//		requset.setAttribute("category", cvo);

		new MainListAction().execute(requset, response);

	}
}