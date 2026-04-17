package Toure_Dubromel;

public class Pilote extends Employe {
    public String licence;
    public int heuresDeVol;

    public Pilote(String id, String nom, String adresse, String contact, Integer numEmp, int date, String licence) {
        super(id, nom, adresse, contact, numEmp, date);
        this.licence = licence;
        this.heuresDeVol = 0;
    }

    @Override
    public void obtenirInfos() {
        System.out.println("[Pilote] " + getNom() + " - Licence: " + licence);
    }

    @Override
    public String obtenirRole() { return "Pilote"; }

    public void affecterVol() { /* Logique d'affectation */ }
}


