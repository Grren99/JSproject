<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko" class="width-1300 navbar-scroll">
<jsp:include page="../Side/Header.jsp" />
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<style>
	.img_update img{
	width: 220px;
	margin-right: -30px;
}
</style>
<title></title>
<!-- Favicon-->
<!-- Core theme CSS (includes Bootstrap)-->
<form action="MainServlet?command=Update_list" method="post" enctype="multipart/form-data">
	<input type="hidden" name="command" value="Update_list">
	<input type="hidden" name="num" value="${category.num }">
	<input type="hidden" name="name" value="${categorylist.categoryname }">
	<input type="hidden" name="noimage" value="${category.image }">
	<div class="d-flex" id="wrapper">
		<jsp:include page="../Side/siderbar.jsp"></jsp:include>
		<!-- wrapper -->
		<div id="page-content-wrapper">
			<!-- Top navigation-->
			<jsp:include page="../Side/navbar.jsp"></jsp:include>
			<div class="content-wrapper clearfix">
				<div class="category-top">
					<div class="category-top-left" style="text-align: center">
						<h1 class="category-title">업데이트 하는 게시판입니다</h1>
						<p class="category-desc">업데이트 내용의 부적절한 내용이 있을시 제제됩니다</p>
					</div>
					<div class="img_update">
					<img class="category-image" src="Image/update1.jpeg" />
					<img class="category-image" src="Image/update2.jpeg" />
					<img class="category-image" src="Image/update1.jpeg" />
					<img class="category-image" src="Image/update2.jpeg" />
					<img class="category-image" src="Image/update1.jpeg" />
					</div>
				</div>
<%-- 				<c:forEach var="category" items="${cvo }"> --%>
				<div class="input-group title-input-group">
					<div class="input-group-prepend" style="margin-top: 30px;">
						<span class="input-group-text">제목</span>
					</div>
					<input type="text" class="form-control" name="title" value="${category.title }"/>
				</div>
				<textarea class="content-textarea form-control"
					placeholder="내용을 입력해주세요." name="content" style="width: 100%;">${category.content }</textarea>
					<input type="file" name="image">
				<input type="text" class="form-control" name="name"
					placeholder="종을 입력해 주세요" value="${category.name }">
<%-- 					</c:forEach> --%>
				<div class="write-bottom">
				<input type="submit" value="수정">
				<input type="reset" value="다시 작성">
				<input type="button" value="목록보기" onclick="location.href='MainServlet?command=Category_list'">
				</div>
			</div>
		</div>
	</div>
</form>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="js/scripts.js"></script>
<jsp:include page="../Side/Footer.jsp"></jsp:include>