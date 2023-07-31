<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.my.domain.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head><title>图书信息查询</title></head>
<body>
<table border="1">
    <tr>
        <th>图书id</th>
        <th>图书名称</th>
        <th>出版社</th>
        <th>作者</th>
    </tr>
<c:forEach items="${books}" var="book">
    <tr>
        <td>${book.id}</td>
        <td>${book.name}</td>
        <td>${book.press}</td>
        <td>${book.author}</td>
    </tr>
</c:forEach>
</table>
<p><a href="index.jsp">返回主页</a>
</body>
</html>

