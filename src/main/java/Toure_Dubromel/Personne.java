package Toure_Dubromel;

public abstract class Personne {
    public String identifiant;
    public String nom;
    public String adresse;
    public String contact;

    public Personne(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public abstract void obtenirInfos(); // Méthode demandée dans le sujet

    // Getters
    public String getIdentifiant() { return identifiant; }
    public String getNom() { return nom; }
}


