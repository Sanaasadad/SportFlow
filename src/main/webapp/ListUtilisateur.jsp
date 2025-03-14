<%--
  Created by IntelliJ IDEA.
  User: Dev
  Date: 14/03/2025
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListUtilisateur</title>
    <%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
    <%@ page import="java.util.List" %>
    <%@ page import="Model.Utilisateur" %>
    <!DOCTYPE html>
    <html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Liste des Utilisateurs</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body>

    <div class="container mt-5">
        <h2 class="text-center">Liste des Utilisateurs</h2>
        <table class="table table-bordered table-striped mt-4">
            <thead class="table-dark">
            <tr>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Date de Naissance</th>
                <th>Email</th>
                <th>Rôle</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Utilisateur> utilisateurs = (List<Utilisateur>) request.getAttribute("utilisateurs");
                if (utilisateurs != null) {
                    for (Utilisateur utilisateur : utilisateurs) {
            %>
            <tr>
                <td><%= utilisateur.getNom() %></td>
                <td><%= utilisateur.getPrenom() %></td>
                <td><%= utilisateur.getDate_naissance() %></td>
                <td><%= utilisateur.getEmail() %></td>
                <td><%= utilisateur.getRole() %></td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="5" class="text-center">Aucun utilisateur trouvé</td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </div>

    </body>
    </html>

</head>
<body>

</body>
</html>
