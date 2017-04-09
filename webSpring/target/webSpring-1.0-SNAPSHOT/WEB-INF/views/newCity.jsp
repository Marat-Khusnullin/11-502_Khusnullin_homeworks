<%--
  Created by IntelliJ IDEA.
  User: Марат
  Date: 16.10.2016
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <link href="bootstrap.css" rel="stylesheet">
</head>
<body  style="background-color:#08CC7C">

<form action="" method="POST" >

    <div id="loginBox" class = "container" style = "margin-top:10%">
        <div class = "col-lg-12 " style = "text-align:center" >

            <h1>Регистрация</h1>
            <p><strong >ID:</strong>
                <input placeholder="Введите id" type="text" size="20" name="id" class = "form-control" style = "width:200px; margin-left:41.5%"></p>
            <p><strong >Город:</strong>
                <input placeholder="Введите город" type="text" size="20" name="city" class = "form-control" style = "width:200px; margin-left:41.5%"></p>
            <p style="width=50px"><strong>Страна:</strong>
                <input placeholder="Введите страну" type="text" size="20" name="country" class = "form-control" style = "width:200px; margin-left:41.5%" ></p>
            <p style="width=50px"><strong>Достопримечательности:</strong>
                <input placeholder="Повторите пароль" type="text" size="20" name="sights" class = "form-control" style = "width:200px; margin-left:41.5%" ></p>

            <p><input type="submit" value="Зарегистрироваться" class = "btn btn-info"></p>
        </div>


    </div>
</form>
</body>
</html>
