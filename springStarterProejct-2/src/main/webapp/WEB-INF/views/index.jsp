<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	<div>
		<p>이메일아이디</p>
		<input id="emailId" type="text"/>
		<p>이름</p>
		<input id="name" type="text"/>
		<p>비밀번호</p>
		<input id = "password" type="password"/>
		<!-- <p>비밀번호확인</p>
		<input type="password"/> -->
	</div>
	<div style="margin-top:20px;">
		<button onclick="save()">저장</button>
	</div>
</body>
<script>
function save(){
	var emailId = $("#emailId")[0].value;
	var name = $("#name")[0].value;
	var password = $("#password")[0].value;
	console.log(emailId, name, password);
	
	var data = {
		"emailId":emailId,
		"name":name,
		"password" : password
	};
	console.log(JSON.stringify(data));
	$.ajax({
	  url: '/saveMember',
	  type: 'post',
	  data: JSON.stringify(data),
	  contentType: 'application/json',
	  done: function(response) {
	  	console.log(response)
	  },
	  fail: function(error) {
	  	console.log(error);
	  },
	  always: function(response) {
	  }
	});
}
</script>
</html>