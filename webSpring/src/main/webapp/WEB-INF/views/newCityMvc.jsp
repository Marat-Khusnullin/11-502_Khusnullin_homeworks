
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--
  Created by IntelliJ IDEA.
  User: Марат
  Date: 20.03.2017
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Новый город</title>
</head>
<body>

<form:form method="post" modelAttribute="city" action="newCityMvc">
    <form:input path="id" />
    <form:input path="name" />
    <form:input path="country" />
    <form:input path="sights"/>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
