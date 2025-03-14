package Dao;

import configuration.DBConnection;
import Model.Utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurDAO {

    public void addUtilisateur(Utilisateur utilisateur) {
        String sql = "INSERT INTO Utilisateur (nom, prenom, dateNaissance, email, motPasse, Role) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection()) {
            if (con == null) {
                System.err.println("Erreur : Connexion à la base de données échouée.");
                return;
            }

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, utilisateur.getNom());
            ps.setString(2, utilisateur.getPrenom());
            ps.setString(3, utilisateur.getDate_naissance());
            ps.setString(4, utilisateur.getEmail());
            ps.setString(5, utilisateur.getMot_passe());
            ps.setString(6, utilisateur.getRole());
            ps.executeUpdate();
            System.out.println(" utilisateur ajouté.");

        } catch (SQLException e) {
            System.err.println("Erreur lors de l'ajout de l'utilisateur : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Utilisateur> getAllUtilisateur() throws SQLException, ClassNotFoundException {
             String sql = "SELECT * FROM Utilisateur";
             List<Utilisateur> utilisateurs = new ArrayList<>();
             Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 Utilisateur utilisateur = new Utilisateur();
                 utilisateur.setNom(rs.getString("nom"));
                 utilisateur.setPrenom(rs.getString("prenom"));
                 utilisateur.setDate_naissance(rs.getString("date_naissance"));
                 utilisateur.setEmail(rs.getString("email"));
                 utilisateur.setMot_passe(rs.getString("mot_passe"));
                 utilisateur.setRole(rs.getString("role"));
                 utilisateurs.add(utilisateur);
             }
             return utilisateurs;

    }

}
