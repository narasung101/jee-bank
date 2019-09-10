<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

</head>
<body>
<div>
<h2>회원가입</h2>
	<form id="join" action="<%=request.getContextPath()%>/customer.do">
	아이디<input type="text" name = "id" />
	비번<input type="text" name = "pw"/>
	주민번호<input type="text" name = "ssn"/>
	이름<input type="text" name = "name"/>
	신용도<input type="text" name = "credit"/>
	<input type="hidden" name = "action" value ="join"/>
	<input type="hidden" name = "page" value ="login"/>
	<input type="submit" id= "btn" value = "전송"/>
	
	</form>
</div>
</body>
</html>