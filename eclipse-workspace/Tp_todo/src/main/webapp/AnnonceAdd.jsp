<%--
  Created by IntelliJ IDEA.
  User: bilelboudjidj
  Date: 06/02/2025
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
  <br>
  <h1>Ajout d'une annonce.</h1>
  <br>
<form action="<%= request.getContextPath() %>/add" method="post">
  <div class="mb-3">
    <label for="title" class="form-label">Title :</label>
    <input type="text" class="form-control" id="title" name="title" required>
  </div>
  <div class="mb-3">
    <label for="description" class="form-label">Description :</label>
    <input type="text" class="form-control" id="description" name="description" required>
  </div>
  <div class="mb-3">
    <label for="adress" class="form-label">Adress :</label>
    <input type="text" class="form-control" id="adress" name="adress" required>
  </div>
  <div class="mb-3">
    <label for="mail" class="form-label">Mail :</label>
    <input type="email" class="form-control" id="mail" name="mail" required>
  </div>

  <button type="submit" class="btn btn-primary">Envoyer</button>
</form>
<a href="<%= request.getContextPath() %>">Page principale.</a>
</div>
<%
  String message = (String) request.getAttribute("message");
  if (message != null && !message.isEmpty()) {
%>
<p class="text-center"><%= message %></p>
<%
  }
%>


</body>
</html>
