<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un utilisateur</title>
</head>
<body>
<h1>Ajouter un utilisateur</h1>
<form action="UtilisateurServlet" method="post">
    Nom: <input type="text" name="nom" required><br>
    Prénom: <input type="text" name="prenom" required><br>
    Date de naissance: <input type="date" name="date_naissance" required><br>
    Email: <input type="email" name="email" required><br>
    Mot de passe: <input type="password" name="mot_passe" required><br>
    Rôle: <input type="text" name="role" required><br>
    <input type="submit" value="Ajouter">
</form>
</body>
</html>