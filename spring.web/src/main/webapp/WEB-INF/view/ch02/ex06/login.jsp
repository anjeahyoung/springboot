<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form method='post' >
	이름: <input type='text' name='userName' value='${user.userName}'/>
	암호: <input type='password' name='password'/>
	<input type='checkbox' name='rememberMe'/>이름 저장
	<input type='submit'/>
</form>