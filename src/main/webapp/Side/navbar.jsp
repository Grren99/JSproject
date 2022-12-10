<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand-lg navbar-light border-bottom" style="background: #fcfca4;">
	<div class="container-fluid">
		<c:choose>
		<c:when test="${empty loginuser}">
		<a href="MainServlet?command=login_list"><button class="btn btn-dark" id="sidebarToggle">로그인</button></a>
		</c:when>
		<c:when test="${not empty loginuser }">
		<a href="MainServlet?command=logout_list"><button class="btn btn-dark" id="sidebarToggle">로그아웃</button></a>
		</c:when>
		</c:choose>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="#!">내 정보</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#!">쪽 지</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
					role="button" data-bs-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">....</a>
					<div class="dropdown-menu dropdown-menu-end"
						aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#!">뭐라고</a> <a
							class="dropdown-item" href="#!">해야</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#!">할지</a>
					</div></li>
					<c:choose>
					<c:when test="${empty loginuser }">
					<li style="margin-left: 200px;">댕블댕블 페이지에 오신걸 환영합니다!!</li>
					</c:when>
					<c:when test="${not empty loginuser }">
					<li style="margin-left: 200px;">댕블댕블 페이지에 오신 &nbsp;"${loginuser.name}"&nbsp; 회원님 환영합니다!!</li>
					</c:when>
					</c:choose>
			</ul>
		</div>
	</div>
</nav>