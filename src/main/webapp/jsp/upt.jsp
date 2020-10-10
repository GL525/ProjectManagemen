<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2020-10-06
  Time: 08:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/toupt">
    <p>
        项目编号
        <input type="text" name="id" value="${listbyid.id}" readonly>
    </p>
    <p>
        项目名称
        <input type="text" name="projectinfoname" value="${listbyid.projectinfoname}" readonly>
    </p>
    <p>
        申报开始日期
        <input type="text" name="stardate" value="${listbyid.stardate}" readonly>
    </p>
    <p>
        申报结束日期
        <input type="text" name="enddate" value="${listbyid.enddate}" readonly>
    </p>
    <p>
        申报状态
       <select name="status">
           <option value="${listbyid.status}">已申报</option>
           <option value="${listbyid.status}">审核中</option>
           <option value="${listbyid.status}">已审核</option>
       </select>

    </p>
</form>
</body>
</html>
