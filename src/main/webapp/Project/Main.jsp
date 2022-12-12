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

<title>댕블댕블 홈페이지</title>
<body>
	<input type="hidden" name="id" value="${loginuser.userid}">
	<input type="hidden" name="name" value="${loginuser.name}">
<%-- 	<input type="text" name="command" value="${category.image }">  --%>


	<div class="d-flex" id="wrapper">
		<jsp:include page="../Side/siderbar.jsp"></jsp:include>
		<!-- wrapper -->
		<div id="page-content-wrapper">
			<!-- Top navigation-->
			<jsp:include page="../Side/navbar.jsp"></jsp:include>

			<!-- Main content-->
			<div class="content-wrapper clearfix">
				<article class=".containe-fluid border-article">
					<div class="border-summary">
						<!-- 					. -->
						<!-- 					  	         -->
						<!-- 						. -->
						<div class="row">
							<div class="col-sm-6 col-md-6 summary-item-wrap">
								<div class="summary-item">
									<!-- 								<!-- 					. -->
									<!-- 					  	분양등록 게시판         -->
									<!-- 						. -->
									<div style="display: flex;">
									<span style="flex : 1;"> <span style="font-size: 22px; border-bottom: 2px solid #00a495;">분양 등록</span>
									</span> <a class="item-title"
										href="MainServlet?command=Category_list&categoryname=1"><i
										class="ph-paw-print-fill"></i></a>
										</div>
									<c:forEach var="category" items="${categorylist}" begin="0"
										end="10">
										<c:if test="${category.categoryname == 1}">
											<div class="link-list">
												<a class="link-item" href="MainServlet?command=Write_view&num=${ category.num}"> <span
													class="link-item-title">${category.content }</span> <span
													class="link-item-created">${category.created }</span>
												</a>
											</div>
										</c:if>
									</c:forEach>

								</div>
							</div>
							<!-- 					. -->
							<!-- 					  	분양후기 게시판         -->
							<!-- 						. -->
							<div class="col-sm-6 col-md-6 summary-item-wrap">
								<div class="summary-item">
									<div style="display: flex;">
									<span style="flex : 1;"> <span style="font-size: 22px; border-bottom: 2px solid #00a495;">분양 후기</span>
									</span> <a class="item-title"
										href="MainServlet?command=Category_list&categoryname=2"><i
										class="ph-paw-print-fill"></i></a>
										</div>
									<c:forEach var="category" items="${categorylist}" begin="0"
										end="10">
										<c:if test="${category.categoryname == 2}">
											<div class="link-list">
												<a class="link-item" href="MainServlet?command=Write_view&num=${ category.num}"> <span
													class="link-item-title">${category.content }</span> <span
													class="link-item-created">${category.created }</span>
												</a>
											</div>
										</c:if>
									</c:forEach>
								</div>
							</div>
						</div>
						<div class="row">
						<!-- 					. -->
							<!-- 					  	입양등록 게시판         -->
							<!-- 						. -->
							<div class="col-sm-6 col-md-6 summary-item-wrap">
								<div class="summary-item">
								<div style="display: flex;">
									<span style="flex : 1;"> <span style="font-size: 22px; border-bottom: 2px solid #00a495;">입양 등록</span>
									</span> <a class="item-title"
										href="MainServlet?command=Category_list&categoryname=3"><i
										class="ph-paw-print-fill"></i></a>
										</div>
									<c:forEach var="category" items="${categorylist}" begin="0"
										end="10">
										<c:if test="${category.categoryname == 3}">
											<div class="link-list">
												<a class="link-item" href="MainServlet?command=Write_view&num=${ category.num}"> <span
													class="link-item-title">${category.content }</span> <span
													class="link-item-created">${category.created }</span>
												</a>
											</div>
										</c:if>
									</c:forEach>

								</div>
							</div>
							<!-- 					. -->
							<!-- 					  	입양 후기 게시판         -->
							<!-- 						. -->
							<div class="col-sm-6 col-md-6 summary-item-wrap">
								<div class="summary-item">
									<div style="display: flex;">
									<span style="flex : 1;"> <span style="font-size: 22px; border-bottom: 2px solid #00a495;">입양 후기</span>
									</span> <a class="item-title"
										href="MainServlet?command=Category_list&categoryname=4"><i
										class="ph-paw-print-fill"></i></a>
										</div>
									<c:forEach var="category" items="${categorylist}" begin="0"
										end="10">
										<c:if test="${category.categoryname == 4}">
											<div class="link-list">
												<a class="link-item" href="MainServlet?command=Write_view&num=${ category.num}"> <span
													class="link-item-title">${category.content }</span> <span
													class="link-item-created">${category.created }</span>
												</a>
											</div>
										</c:if>
									</c:forEach>
								</div>
							</div>
						</div>
						<div class="row">
						<!-- 					. -->
							<!-- 					  	강아지 자랑 게시판         -->
							<!-- 						. -->
							<div class="col-sm-6 col-md-6 summary-item-wrap">
								<div class="summary-item">
									<div style="display: flex;">
									<span style="flex : 1;"> <span style="font-size: 22px; border-bottom: 2px solid #00a495;">강아지 자랑</span>
									</span> <a class="item-title"
										href="MainServlet?command=Category_list&categoryname=5"><i
										class="ph-paw-print-fill"></i></a>
										</div>
									<c:forEach var="category" items="${categorylist}" begin="0"
										end="10">
										<c:if test="${category.categoryname == 5}">
											<div class="link-list">
												<a class="link-item" href="MainServlet?command=Write_view&num=${ category.num}"> <span
													class="link-item-title">${category.content }</span> <span
													class="link-item-created">${category.created }</span>
												</a>
											</div>
										</c:if>
									</c:forEach>

								</div>
							</div>
							<!-- 					. -->
							<!-- 					  	동물 병원 추천 게시판         -->
							<!-- 						. -->
							<div class="col-sm-6 col-md-6 summary-item-wrap">
								<div class="summary-item">
									<div style="display: flex;">
									<span style="flex : 1;"> <span style="font-size: 22px; border-bottom: 2px solid #00a495;">동물 병원 추천</span>
									</span> <a class="item-title"
										href="MainServlet?command=Category_list&categoryname=6"><i
										class="ph-paw-print-fill"></i></a>
										</div>
									<c:forEach var="category" items="${categorylist}" begin="0"
										end="10">
										<c:if test="${category.categoryname == 6}">
											<div class="link-list">
												<a class="link-item" href="MainServlet?command=Write_view&num=${ category.num}"> <span
													class="link-item-title">${category.content }</span> <span
													class="link-item-created">${category.created }</span>
												</a>
											</div>
										</c:if>
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
				</article>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="js/scripts.js"></script>