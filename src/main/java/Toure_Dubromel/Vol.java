package Toure_Dubromel;
import java.util.ArrayList;
import java.util.List;

public class Vol {

        public String numeroVol;
        public String origine;
        public String destination;
        public String dateHeureDepart;
        public String dateHeureArrivee;
        public String etat;
        public Avion avion;
        public List<Passager> passagers = new ArrayList<>();

        public Vol(String num, String org, String dest, String depart) {
            this.numeroVol = num;
            this.origine = org;
            this.destination = dest;
            this.dateHeureDepart = depart;
        }

        public void planifierVol() { this.etat = "Planifié"; }
        public void annulerVol() { this.etat = "Annulé"; }

        public void ajouterPassager(Passager p) {
            this.passagers.add(p);
        }

        public void listingPassager() {
            System.out.println("Liste des passagers du vol " + numeroVol);
            for(Passager p : passagers) p.obtenirInfos();
        }
    }

