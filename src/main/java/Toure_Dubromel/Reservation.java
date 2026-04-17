package Toure_Dubromel;

public class Reservation {
    public String numeroReservation;
    public String dateReservation;
    public String status;
    public Passager passager;
    public Vol vol;

    public Reservation(String num, String date, Passager p, Vol v) {
        this.numeroReservation = num;
        this.dateReservation = date;
        this.passager = p;
        this.vol = v;
        this.status = "Confirmée";
        v.ajouterPassager(p);
    }

    public void annulerReservation() { this.status = "Annulée"; }
}

