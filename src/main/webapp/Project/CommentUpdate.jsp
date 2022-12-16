<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MainServlet?command=Comment_Update" method="post">

<input type="text" name="num" value="${comment.num }">

<input type="text" name="content" value="${comment.content }">

<input type="submit" value="수정">
<input type="button" value="창닫기" onclick="Close()">
</form>

<script type="text/javascript">

function Close(){
	self.close()
}


</script>

</body>
</html>