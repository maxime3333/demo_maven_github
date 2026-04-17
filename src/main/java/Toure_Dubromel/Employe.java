package Toure_Dubromel;

public abstract class Employe extends Personne {
    public String numeroEmploye;
    public String dateEmbauche;

    public Employe(String id, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche) {
        super(id, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public abstract String obtenirRole();
}

