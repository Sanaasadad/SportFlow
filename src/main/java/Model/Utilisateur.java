package Model;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String dateNaissance; // Doit être en format YYYY-MM-DD
    private String email;
    private String motPasse;
    private String role;



    public Utilisateur() {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance= dateNaissance;
        this.email = email;
        this.motPasse = motPasse;
        this.role = role;
    }


    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getDate_naissance() { return dateNaissance; }
    public String getEmail() { return email; }
    public String getMot_passe() { return motPasse; }
    public String getRole() { return role; }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_naissance(String date_naissance) {
        this.dateNaissance = date_naissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMot_passe(String mot_passe) {
        this.motPasse = mot_passe;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
