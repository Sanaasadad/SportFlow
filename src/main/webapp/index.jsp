<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Accueil - Club Sportif</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container">
    <a class="navbar-brand" href="#">Club Sportif</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item"><a class="nav-link" href="ajouterUtilisateur.jsp">Ajouter un Utilisateur</a></li>
        <li class="nav-item"><a class="nav-link" href="UtilisateurServlet">Voir Utilisateurs</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container text-center mt-5">
  <h1 class="mb-4">Bienvenue au Club Sportif</h1>
  <p class="lead">Gérez vos utilisateurs avec facilité.</p>
  <a href="ajouterUtilisateur.jsp" class="btn btn-primary">Ajouter un Utilisateur</a>
  <a href="ListUtilisateur" class="btn btn-outline-primary">Voir Utilisateurs</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
