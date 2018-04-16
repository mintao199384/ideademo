<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>success</h1>
<form>
    <fmt:message key="user"/>:<input type="text" name="user">
    <fmt:message key="password"/>:<input type="password" name="password">


</form>
<a href="${ctp}/he?locale=zh_CN">中文</a>|<a href="${ctp}/he?locale=en_US">English</a>

</body>
</html>
