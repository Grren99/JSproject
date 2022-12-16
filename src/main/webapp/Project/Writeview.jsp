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




<title></title>
<!-- Favicon-->
<!-- Core theme CSS (includes Bootstrap)-->
<input type=hidden name="command" value="Write_list">
<input type=hidden name="num" value="${category.num }">
<input type="hidden" name="username" value="${loginuser.name }">
<input type="hidden" name="con" value="${comment}">

<div class="d-flex" id="wrapper">
	<jsp:include page="../Side/siderbar.jsp"></jsp:include>
	<!-- wrapper -->
	<div id="page-content-wrapper">
		<!-- Top navigation-->
		<jsp:include page="../Side/navbar.jsp"></jsp:include>
		<div class="content-wrapper clearfix">
			<div class="category-top">
				<div class="category-top-left" style="text-align: center;">
					<h1 class="category-title">님이 작성하신 게시글 입니다</h1>
					<p class="category-desc">욕설 및 비방하는 댓글을 작성시 제제될 수 있습니다.</p>
				</div>
				<img class="category-image" src="Image/view.webp"
					style="width: 200px; height: 200px; display: block; margin: 0 auto;" />
			</div>
			<div class="input-group title-input-group">
				<div class="input-group-prepend" style="margin-top: 30px;">
					<span class="input-group-text">제목</span>
				</div>
				<input type="text" class="form-control" name="title"
					value="${category.title }" readonly="readonly" />
			</div>
			<div style="position: relative;">
				<textarea class="content-textarea form-control"
					placeholder="내용을 입력해주세요." name="content"
					style="width: 100%; padding-right: 320px;" readonly="readonly">${category.content }
					</textarea>
				<c:choose>
					<c:when test="${empty category.image }">
						<img src="Image/Logo.jpeg"
							style="width: 300px; height: 280px; position: absolute; bottom: 10px; right: 10px; object-fit: contain">
					</c:when>
					<c:otherwise>
						<img src="upload/${category.image }"
							style="width: 300px; height: 280px; position: absolute; bottom: 10px; right: 10px; object-fit: contain">
					</c:otherwise>

				</c:choose>
			</div>
			<%-- 					<img src="/JSProject/save/${category.image }" style="width:200px; height: 100px; object-fit: contain;"> --%>
			<input type="text" class="form-control" name="name"
				placeholder="종을 입력해 주세요" value="${category.name }"
				readonly="readonly">



			<div class="write-bottom" style="margin-bottom: 50px">
				<%-- 					<input type="button" value="댓글보기" onclick="location.href='MainServlet?command=Comment_view&commentnum=${commet.commentnum}'"> --%>
				<c:choose>
					<c:when test="${empty loginuser }">
						<input type="button" value="목록보기" class="form-control"
							onclick="location.href='MainServlet?command=Category_list&categoryname=${category.categoryname}'">
					</c:when>
					<c:when test="${loginuser.name != category.username }">
						<input type="button" value="목록보기" class="form-control"
							onclick="location.href='MainServlet?command=Category_list&categoryname=${category.categoryname}'">
					</c:when>
					<c:when test="${ loginuser.name == category.username }">
						<input type="button" value="수정" class="form-control"
							onclick="location.href='MainServlet?command=Update_list_form&num=${category.num}'">
						<input type="button" value="삭제"
							onclick="location.href='MainServlet?command=Delete_list&num=${category.num}'"
							class="form-control">
						<input type="button" value="목록보기"
							onclick="location.href='MainServlet?command=Category_list'"
							class="form-control">
					</c:when>
				</c:choose>
			</div>

			<c:forEach var="comment" items="${comment }">
			
				<table class="table table-striped"
					style="text-align: center; border: 1px solid #dddddd">


					<tr><td>
						<input type="text" name="con" value="${comment.num}" id="aaa">
						<input type="text" name="commentname"
							value="작성자 :  ${comment.comname }" readonly="readonly"
							class="form-control" style="text-align: center"> 
							<input type="button" name="btn" value="수정" onclick="showPopup('MainServlet?command=Comment_Update_form&num=${comment.num}','update')">
					</tr>



					<tr>
						<td><input type="text" name="content" class="form-control"
							value="${comment.content }" readonly="readonly"
							style="width: 900px; height: 80px"></td>
					</tr>



				</table>
				
				<script type="text/javascript">
					function showPopup(url,name){
    				window.open(url,name,"width=500 , height=230")

					}
				</script>
			</c:forEach>
		</div>
	</div>
</div>
<c:choose>
	<c:when test="${not empty loginuser }">
		<jsp:include page="../Project/Comment.jsp" />
	</c:when>
	<c:otherwise>

	</c:otherwise>
</c:choose>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="js/scripts.js"></script>
<jsp:include page="../Side/Footer.jsp"></jsp:include>