<jsp:useBean id="commande" scope="request" type="com.sdzee.tp.beans.Commande"/>
<%--
  Created by IntelliJ IDEA.
  User: abbas
  Date: 10/14/2022
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Affichage d'une commande</title>
  <link type="text/css" rel="stylesheet" href="inc/style.css"
  />
</head>
<body>
<c:import url="inc/menu.jsp" />
<div id="corps">
  <p class="info"> ${message} </p>
  <c:if test="${!erreur}">
    <p>Client</p>
    <p>Nom: <c:out value="${ commande.client.nom }"/></p>
    <p>Prenom: <c:out value="${ commande.client.prenom }"/></p>
    <p>Adresse: <c:out value="${ commande.client.adresse }"/></p>
    <p>Numero de telephone: <c:out value="${ commande.client.telephone }"/></p>
    <p>Email: <c:out value="${ commande.client.email }" /></p>
    <p>Commande</p>
    <p>Date: <c:out value="${commande.date}" /></p>
    <p>Montant: <c:out value="${commande.montant}" /></p>
    <p>Mode de paiement: <c:out value="${commande.modePaiement}" /></p>
    <p>Statut du paiement: <c:out value="${commande.statutPaiement}" /></p>
    <p>Mode de livraison: <c:out value="${commande.modeLivraison}" /></p>
    <p>Statut de livraison: <c:out value="${commande.statutLivraison}" /></p>
  </c:if>
</div>
</body>
</html>
