<%--
  Created by IntelliJ IDEA.
  User: abbas
  Date: 10/14/2022
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Création d'un client</title>
  <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css" />" />
</head>
<body>
<c:import url="inc/menu.jsp" />
<div>
  <form method="get" action="<c:url value="/creationClient"/> ">
    <fieldset>
      <legend>Informations client</legend>
      <c:import url="/inc/inc_client_form.jsp"  />
    </fieldset>
    <input type="submit" value="Valider" />
    <input type="reset" value="Annuler" />
    <br />
  </form>
</div>
</body>
</html>

