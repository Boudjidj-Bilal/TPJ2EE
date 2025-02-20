<%--
  Created by IntelliJ IDEA.
  User: bilelboudjidj
  Date: 06/02/2025
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire</title>
</head>
<body>
<h2>Entrez votre prénom</h2>
<form action="<%= request.getContextPath() %>/hello" method="post">
    <label for="prenom">Prénom :</label>
    <input type="text" id="prenom" name="prenom" required>
    <button type="submit">Envoyer</button>
</form>
</body>
</html>

