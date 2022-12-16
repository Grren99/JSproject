<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko" class="width-1300 navbar-scroll">
<jsp:include page="../Side/Header.jsp" />
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />

<title></title>
<!-- Favicon-->
<!-- Core theme CSS (includes Bootstrap)-->
<body>
	<form method="post" action="MainServlet?command=Comment_write_list">
	<input type="hidden" name="command" value="Write_view">
	
		<table class="table table-striped"
			style="text-align: center; border: 1px solid #dddddd">
			<tr>
				<td style="border-bottom: none;" valign="middle">
				<input type="hidden" name="category_num" value="${category.num}">
				<input type="text" name="comname" value="${loginuser.name}" readonly="readonly" style="text-align: center;">
				</td>
				<!--  -->
				<td><input type="text" style="height: 100px; width: 800px;"
					class="form-control" placeholder="상대방을 존중하는 댓글을 남깁시다."
					name="content"></td>
				<td><br> <br>
				 <input type="submit" class="btn-dark pull" value="댓글 작성"></td>
			</tr>
		</table>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="js/scripts.js"></script>