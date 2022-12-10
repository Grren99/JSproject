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

<title>Simple Sidebar - Start Bootstrap Template</title>
<!-- Favicon-->
<!-- Core theme CSS (includes Bootstrap)-->
<body>
<form action="MainServlet" method="post" name="js">
<input type="hidden" name="command" value="login_list">
	<div class="d-flex" id="wrapper">
		<jsp:include page="../Side/siderbar.jsp"></jsp:include>
		<!-- wrapper -->
		<div id="page-content-wrapper">
			<!-- Top navigation-->
			<jsp:include page="../Side/navbar.jsp"></jsp:include>
			<div class="tab-content" >
				<ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist" style="display: flex; align-items: center; justify-content: center;">
					<li class="nav-item" role="presentation" style="flex-grow: 0;"><a
						class="nav-link active" id="tab-login" data-mdb-toggle="pill"
						href="MainServlet?command=login_list" role="tab" aria-controls="pills-login"
						aria-selected="true">로그인</a></li>
					<li class="nav-item" role="presentation" style="flex-grow: 0"><a class="nav-link "
						id="tab-register" data-mdb-toggle="pill" href="MainServlet?command=Register_list_form"
						role="tab" aria-controls="pills-register" aria-selected="false">회원가입</a>
					</li>
				</ul>
				<div class="form-outline mb-4" style="display: flex;align-items: center; justify-content: center; padding-top: 20px">
				<label style="display: flex; align-items: center">
				<span style="width: 90px;">ID :</span>
				<input type="text" id="loginName" name="userid" class="form-control" placeholder="username or id" style="margin: 0 !important;"/>
				</label>
				</div>

				<div class="form-outline mb-4" style="display: flex;align-items: center; justify-content: center; padding-bottom: 20px;">
				<label style="display: flex; align-items: center">
				<span style="width: 90px;">Password :</span>
					<input name="password" type="password" id="loginPassword"
						class="form-control" placeholder="your password"  style="margin: 0 !important"/>
						</label>
						 
						<label class="form-label"
						for="loginPassword"></label>
				</div>
				<input type="submit" class="btn btn-dark btn-block mb-4"
					value="로그인" style="display: block; margin: 0 auto;"/>
						

			</div>
		</div>
	</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="js/scripts.js"></script>