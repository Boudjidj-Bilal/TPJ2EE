<%--
  Created by IntelliJ IDEA.
  User: bilelboudjidj
  Date: 06/02/2025
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Résultat</title>
  </head>
  <body>
    <h2>Bonjour, <%= request.getAttribute("prenom") %> !</h2>
    <a href="<%= request.getContextPath() %>/hello">Retour au formulaire</a>
  </body>
</html>
