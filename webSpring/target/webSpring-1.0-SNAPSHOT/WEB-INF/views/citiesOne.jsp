<%@ page import="java.util.LinkedList" %>
<%@ page import="ru.models.City" %><%--
  Created by IntelliJ IDEA.
  User: Марат
  Date: 20.03.2017
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Города</title>
</head>
<body>
   <%LinkedList<City> cities = (LinkedList<City>) request.getAttribute("cities");
       for (int i = 0; i <cities.size(); i++) { %>

           <p> <%= cities.get(i).getName() %> </p>
   <%    }

   %>
</body>
</html>
