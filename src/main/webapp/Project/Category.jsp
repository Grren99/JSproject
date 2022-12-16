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

<title>분양게시판</title>
<!-- Favicon-->
<!-- Core theme CSS (includes Bootstrap)-->
<body>
		<input type="hidden" name="command" value="${categoryname }">
	<div class="d-flex" id="wrapper">
		<jsp:include page="../Side/siderbar.jsp"></jsp:include>
		<!-- wrapper -->
		<div id="page-content-wrapper">
			<!-- Top navigation-->
			<jsp:include page="../Side/navbar.jsp"></jsp:include>

			<div class="content-wrapper clearfix">
				<div class="category-top">
				
					<c:if test="${categorylist[0].categoryname == 1}">
						<img class="category-image" src="Image/parceladd.webp"
							style="width: 300px; height: 240px; display: block; margin: 0 auto;'" />
						<div class="category-top-left" style="text-align: center;">
							<h1 class="category-title" style="">분양 등록 게시판</h1>
							<p class="category-desc">이곳은 분양을 하고 싶은 동물을 등록 하는 페이지 입니다.</p>
							<ul class="nav nav-tabs">
								<li class="nav-item"><a class="nav-link active" href="#">전체</a></li>
							</ul>
						</div>
					</c:if>
					
					<c:if test="${categorylist[0].categoryname == 2}">
						<img class="category-image" src="Image/parcelreset.webp"
							style="width: 300px; height: 240px; display: block; margin: 0 auto;'" />
						<div class="category-top-left" style="text-align: center;">
							<h1 class="category-title" style="">분양 후기 게시판</h1>
							<p class="category-desc">이곳은 분양한 동물의 후기를 작성 하는 페이지 입니다.</p>
							<ul class="nav nav-tabs">
								<li class="nav-item"><a class="nav-link active" href="#">전체</a></li>
							</ul>
						</div>
					</c:if>
					
					<c:if test="${categorylist[0].categoryname == 3}">
						<img class="category-image" src="Image/adoptadd.webp"
							style="width: 300px; height: 240px; display: block; margin: 0 auto;'" />
						<div class="category-top-left" style="text-align: center;">
							<h1 class="category-title" style="">입양 등록 게시판</h1>
							<p class="category-desc">이곳은 입양한 동물의 후기를 작성 하는 페이지 입니다.</p>
							<ul class="nav nav-tabs">
								<li class="nav-item"><a class="nav-link active" href="#">전체</a></li>
							</ul>
						</div>
					</c:if>
					
					<c:if test="${categorylist[0].categoryname == 4}">
						<img class="category-image" src="Image/adoptreset.webp"
							style="width: 300px; height: 240px; display: block; margin: 0 auto;'" />
						<div class="category-top-left" style="text-align: center;">
							<h1 class="category-title" style="">입양 후기 게시판</h1>
							<p class="category-desc">이곳은 입양을 하고 싶은 동물을 등록 하는 페이지 입니다.</p>
							<ul class="nav nav-tabs">
								<li class="nav-item"><a class="nav-link active" href="#">전체</a></li>
							</ul>
						</div>
					</c:if>
					
					<c:if test="${categorylist[0].categoryname == 5}">
						<img class="category-image" src="Image/boastdog.webp"
							style="width: 300px; height: 240px; display: block; margin: 0 auto;'" />
						<div class="category-top-left" style="text-align: center;">
							<h1 class="category-title" style="">강아지 자랑 게시판</h1>
							<p class="category-desc">이곳은 자신이 또는 귀여운 동물을 자랑하는 페이지 입니다.</p>
							<ul class="nav nav-tabs">
								<li class="nav-item"><a class="nav-link active" href="#">전체</a></li>
							</ul>
						</div>
					</c:if>
					
					<c:if test="${categorylist[0].categoryname == 6}">
						<img class="category-image" src="Image/hosp.webp"
							style="width: 300px; height: 240px; display: block; margin: 0 auto;'" />
						<div class="category-top-left" style="text-align: center;">
							<h1 class="category-title" style="">동물병원 추천 게시판</h1>
							<p class="category-desc">이곳은 동물 병원을 추천하거나 비추천 하는 게시판 입니다.</p>
							<ul class="nav nav-tabs">
								<li class="nav-item"><a class="nav-link active" href="#">전체</a></li>
							</ul>
						</div>
					</c:if>

					<table class="table">
						<tr>
							<th scope="col">번호</th>
							<th scope="col">제목</th>
							<th scope="col">내용</th>
							<th scope="col">품 종</th>
							<th scope="col">작성자</th>
							<th scope="col">작성일</th>
						</tr>
						<c:forEach var="category" items="${categorylist }">

							<c:if test="${category.categoryname == 1 }">
								<tr class="record">
									<th scope="row">${category.num }</th>
									<td>${category.title}</td>
									<td><a
										href="MainServlet?command=Write_view&num=${category.num}"
										style="text-decoration: none;">${category.content }</a></td>
									<td>${category.name }</td>
									<td>${category.username }</td>
									<td>${category.created}</td>
								</tr>
							</c:if>

							<c:if test="${category.categoryname == 2 }">
								<tr class="record">
									<th scope="row">${category.num }</th>
									<td>${category.title}</td>
									<td><a
										href="MainServlet?command=Write_view&num=${category.num}"
										style="text-decoration: none;">${category.content }</a></td>
									<td>${category.name }</td>
									<td>${category.username }</td>
									<td>${category.created}</td>
								</tr>
							</c:if>

							<c:if test="${category.categoryname == 3 }">
								<tr class="record">
									<th scope="row">${category.num }</th>
									<td>${category.title}</td>
									<td><a
										href="MainServlet?command=Write_view&num=${category.num}"
										style="text-decoration: none;">${category.content }</a></td>
									<td>${category.name }</td>
									<td>${category.username }</td>
									<td>${category.created}</td>
								</tr>
							</c:if>
							
							<c:if test="${category.categoryname == 4 }">
								<tr class="record">
									<th scope="row">${category.num }</th>
									<td>${category.title}</td>
									<td><a
										href="MainServlet?command=Write_view&num=${category.num}"
										style="text-decoration: none;">${category.content }</a></td>
									<td>${category.name }</td>
									<td>${category.username }</td>
									<td>${category.created}</td>
								</tr>
							</c:if>
							
							<c:if test="${category.categoryname == 5 }">
								<tr class="record">
									<th scope="row">${category.num }</th>
									<td>${category.title}</td>
									<td><a
										href="MainServlet?command=Write_view&num=${category.num}"
										style="text-decoration: none;">${category.content }</a></td>
									<td>${category.name }</td>
									<td>${category.username }</td>
									<td>${category.created}</td>
								</tr>
							</c:if>
							
							<c:if test="${category.categoryname == 6 }">
								<tr class="record">
									<th scope="row">${category.num }</th>
									<td>${category.title}</td>
									<td><a
										href="MainServlet?command=Write_view&num=${category.num}"
										style="text-decoration: none;">${category.content }</a></td>
									<td>${category.name }</td>
									<td>${category.username }</td>
									<td>${category.created}</td>
								</tr>
							</c:if>
						</c:forEach>
					</table>
				</div>




				<div class="cateogry-bottom">
					<c:choose>
						<c:when test="${empty loginuser }">
							<a class="btn btn-dark btn-sm"
								href="MainServlet?command=login_list">글작성은 로그인 후 가능 합니다</a>
						</c:when>
						<c:when test="${not empty loginuser }">
							<a class="btn btn-dark btn-sm"
								href="MainServlet?command=Write_list_form">글작성</a>
						</c:when>
					</c:choose>
				</div>
				<div class="category-search-wrapper">
					<!-- 					<input type="text" class="category-search-input form-control" -->
					<!-- 						placeholder="검색어를 입력해주세요" aria-label="검색어를 입력해주세요" -->
					<!-- 						aria-describedby="basic-addon2" /> -->
					<!-- 					<button class="btn btn-sm btn-dark category-search-btn"> -->
					<!-- 						검색</button> -->
				</div>
				<div class="category-pagination">
					<nav aria-label="Page navigation example">
						<ul class="pagination">
						</ul>
					</nav>
				</div>
			</div>



		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="js/scripts.js"></script>