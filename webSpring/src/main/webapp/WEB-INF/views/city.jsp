<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="ru.models.City" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Города</title>
</head>
<body>



<c:forEach var = "listValue" items="${citiesJSP}">
      <p> ${listValue.getName()}</p>


</c:forEach>



</body>
</html>