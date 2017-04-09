<%@ page import="ru.models.Hotel" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Марат
  Date: 10.03.2017
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Отели</title>
</head>
<body>
<c:forEach var = "listValue" items="${hotelJSP}">
    <p> ${listValue.getName()}</p>


</c:forEach>
</body>
</html>
