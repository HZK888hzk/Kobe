<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<p>查询指定编号的图书：${msg}
<form action="book" method="post">
    <input type="text" name="id" value="1">
    <input type="submit" value="提交">
</form>
<p>所有图书：<a href="books">查询</a>