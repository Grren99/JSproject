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
<style>
.img_write img {
	width: 243px;
	margin-right: -5px;
}
</style>
<title></title>
<!-- Favicon-->

<!-- enctype="multipart/form-data" -->

<form action="MainServlet?command=Write_list" method="post" enctype="multipart/form-data">
	<input type="hidden" name="command" value="Write_list">
	<input type="text" name="name" value="${categorylist.categoryname }">
	<div class="d-flex" id="wrapper">
		<jsp:include page="../Side/siderbar.jsp"></jsp:include>
		<!-- wrapper -->
		<div id="page-content-wrapper">
			<!-- Top navigation-->
			<jsp:include page="../Side/navbar.jsp"></jsp:include>
			<div class="content-wrapper clearfix">
				<div class="category-top">
					<div class="category-top-left">
						<h1 class="category-title" style="text-align: center;">게시판을
							잘확인하여 글을 작성 해주세요</h1>
					</div>
					<div class="img_write">
						<img class="category-image" src="Image/게시판작성2.jpeg" /> <img
							class="category-image" src="Image/게시판작성4.jpeg" /> <img
							class="category-image" src="Image/게시판작성2.jpeg" /> <img
							class="category-image" src="Image/게시판작성4.jpeg" /> <img
							class="category-image" src="Image/게시판작성2.jpeg" />
					</div>
				</div>
				<div class="input-group title-input-group">
					<select class="form-select" aria-label="Default select example"
						name="categoryname" id="categoryname"
						style="height: 38px; text-align: center; margin-top: 29px;">
						<option value="1">분양 등록 게시판</option>
						<option value="2">분양 후기 게시판</option>
						<option value="3">입양 등록 게시판</option>
						<option value="4">입양 후기 게시판</option>
						<option value="5">동물 자랑 게시판</option>
						<option value="6">병원 추천 게시판</option>
					</select>
					<div class="input-group-prepend" style="margin-top: 30px;">
						<span class="input-group-text">제목</span>
					</div>
					<input type="text" class="form-control" name="title" />
				</div>
				<textarea class="content-textarea form-control"
					placeholder="내용을 입력해주세요." name="content" style="width: 100%;"></textarea>
				<input type="text" class="form-control" name="name"
					placeholder="종을 입력해 주세요"> 
					<input type="file" name="image" >
				<input type="text" class="form-control" name="username"
					value="${loginuser.name }" readonly="readonly"
					style="text-align: center;">

				<div class="write-bottom">
					<input type="submit" value="작성">
					<input type="reset" value="지우기"> 
					<input type="button"
						value="목록보기"
						onclick="location.href='MainServlet?command=Category_list'">
				</div>
			</div>
		</div>
	</div>
</form>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="js/scripts.js"></script>
<jsp:include page="../Side/Footer.jsp"></jsp:include>