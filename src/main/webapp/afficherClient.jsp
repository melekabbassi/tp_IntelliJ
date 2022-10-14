<jsp:useBean id="client" scope="request" type="com.sdzee.tp.beans.Client"/>
<%--
  Created by IntelliJ IDEA.
  User: abbas
  Date: 10/14/2022
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Affichage d'un client</title>
  <link type="text/css" rel="stylesheet" href="inc/style.css"
  />
</head>
<body>
<%-- Affichage de la chaîne "message" transmise par la servlet --%>
<p class="info">${ message }</p>
<%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>
<p>Nom : ${ client.nom }</p>
<p>Prénom : ${ client.prenom }</p>
<p>Adresse : ${ client.adresse }</p>
<p>Numéro de téléphone : ${ client.telephone }</p>
<p>Email : ${ client.email }</p>
</body>
</html>
