package Toure_Dubromel;

public class Passager extends Personne{
    public String passeport;

    public Passager(String id, String nom, String adresse, String contact, String passeport) {
        super(id, nom, adresse, contact);
        this.passeport = passeport;
    }

    @Override
    public void obtenirInfos() {
        System.out.println("[Passager] " + getNom() + " - Passeport: " + passeport);
    }

    public void reserverVol() { /* Logique de réservation */ }
}
