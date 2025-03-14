package Controller;

import Dao.UtilisateurDAO;
import Model.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/UtilisateurServlet")
public class UtilisateurServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les données du formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String dateNaissance = request.getParameter("date_naissance");
        String email = request.getParameter("email");
        String motPasse = request.getParameter("mot_passe");
        String role = request.getParameter("role");

        // Vérifier si les champs obligatoires ne sont pas vides
        if (nom == null || prenom == null || email == null || motPasse == null || role == null ||
                nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || motPasse.isEmpty() || role.isEmpty()) {
            request.setAttribute("erreur", "Tous les champs sont obligatoires !");
            request.getRequestDispatcher("formulaire.jsp").forward(request, response);
            return;
        }

        // Créer un objet Utilisateur et affecter les valeurs
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        utilisateur.setDate_naissance(dateNaissance);
        utilisateur.setEmail(email);
        utilisateur.setMot_passe(motPasse);
        utilisateur.setRole(role);

        try {
            // Ajouter l'utilisateur dans la base de données
            UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
            utilisateurDAO.addUtilisateur(utilisateur);

            // Rediriger vers la liste des utilisateurs (via le servlet)
            response.sendRedirect("ListUtilisateur");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("erreur", "Erreur lors de l'ajout de l'utilisateur !");
            request.getRequestDispatcher("formulaire.jsp").forward(request, response);
        }
    }


    @WebServlet("/ListUtilisateur ")
    public class ListUtilisateur extends HttpServlet {
        public ListUtilisateur() {
            super();
        }
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            List<Utilisateur> utilisateurs;
            try {
                utilisateurs = UtilisateurDAO.getAllUtilisateur();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            req.setAttribute("utilisateurs", utilisateurs);
            req.getRequestDispatcher("ListUtilisateur.jsp").forward(req, resp);

        }

    }
}