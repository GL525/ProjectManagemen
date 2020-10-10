<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2020-10-05
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/list">
    申报状态<select name="status">
    <option value="">全部</option>
    <option value="0">已申报</option>
    <option value="1">审核中</option>
    <option value="2">已审核</option>
</select>
</form>
<table border="1px">
    <tr>
        <td>项目编号</td>
        <td>项目名称</td>
        <td>申报开始日期</td>
        <td>申报结束日期</td>
        <td>申报状态</td>
        <td>操作</td>
    </tr>
    <C:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.projectinfoname}</td>
            <td><fmt:formatDate value="${item.stardate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td><fmt:formatDate value="${item.enddate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td>
            <C:if test="${item.status==0}">
                已申报
            </C:if>
                <C:if test="${item.status==1}">
                    审核中
                </C:if>
                <C:if test="${item.status==2}">
                    已审核
                </C:if>
            </td>
            <td> <C:if test="${item.status==0}">

            </C:if>
                <C:if test="${item.status==2}">
                    <a href="/cha/${item.id}">审核</a>
                </C:if>
                <C:if test="${item.status==0}">
                    <a href="/cha/${item.id}">审核</a>
                </C:if></td>
        </tr>
    </C:forEach>
</table>
</body>
</html>
