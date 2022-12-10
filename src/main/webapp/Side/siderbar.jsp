<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="border-end bg-white" id="sidebar-wrapper" style="background: #fcfca4 !important;">
	<div class="sidebar-heading border-bottom">
		<img alt="" src="Image/Logo.jpeg" width="200px;" height="150px" style="cursor: pointer; border-radius: 30px;" onclick="location.href='MainServlet?command=Main_list'"/>
	</div>
	<div class="list-group list-group-flush">
		<a
			class="list-group-item list-group-item-action list-group-item-light p-3"
			href="MainServlet?command=Category_list&categoryname=1">분양 등록</a> <a
			class="list-group-item list-group-item-action list-group-item-light p-3"
			href="MainServlet?command=Category_list&categoryname=2">분양 후기</a> <a
			class="list-group-item list-group-item-action list-group-item-light p-3"
			href="MainServlet?command=Category_list&categoryname=3">입양 등록</a> <a
			class="list-group-item list-group-item-action list-group-item-light p-3"
			href="MainServlet?command=Category_list&categoryname=4">입양 후기</a> <a
			class="list-group-item list-group-item-action list-group-item-light p-3"
			href="MainServlet?command=Category_list&categoryname=5">강아지 자랑</a> <a
			class="list-group-item list-group-item-action list-group-item-light p-3"
			href="MainServlet?command=Category_list&categoryname=6">동물병원 추천</a>
	</div>
</div>