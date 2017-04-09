<%@ page import="ru.models.Hotel" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Марат
  Date: 20.03.2017
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Отели</title>
</head>
<body>
<%ArrayList<Hotel> hotels = (ArrayList<Hotel>) request.getAttribute("cities");
    for (int i = 0; i <hotels.size(); i++) { %>

<p> <%= hotels.get(i).getName() %> </p>
<%    }

%>
</body>
</html>
