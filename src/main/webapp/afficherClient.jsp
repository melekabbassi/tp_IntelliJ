<jsp:useBean id="client" scope="request" type="com.sdzee.tp.beans.Client"/>
<%--
  Created by IntelliJ IDEA.
  User: abbas
  Date: 10/14/2022
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Affichage d'un client</title>
  <link type="text/css" rel="stylesheet" href="<c:url value="inc/style.css"/> "/>
</head>
<body>
<c:import url="inc/menu.jsp"/>
<div id="corps">
  <p class="info">${message}</p>
  <c:if test="${ !erreur }">
    <p>Nom: <c:out value="${ client.nom }" /></p>
    <p>Prenom: <c:out value="${ client.prenom }" /></p>
    <p>Adresse: <c:out value="${ client.adresse }" /></p>
    <p>Numero de telephone: <c:out value="${ client.telephone }"/></p>
    <p>Email: <c:out value="${ client.email }"/></p>
  </c:if>
</div>
</body>
</html>
