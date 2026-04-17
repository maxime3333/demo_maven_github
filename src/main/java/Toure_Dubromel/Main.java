package Toure_Dubromel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Système de Réservation Aérienne ---");

        // Exemple de test
        Avion monAvion = new Avion("AF-123", "Airbus A320", 150);
        Vol monVol = new Vol("AF001", "Paris", "New York", "2024-10-12 10:00");

        Passager p1 = new Passager("P1", "Dubromel", "Issy", "0600..", "ABC1234");
        Reservation res = new Reservation("R100", "2024-09-01", p1, monVol);

        monVol.listingPassager();
    }
}



