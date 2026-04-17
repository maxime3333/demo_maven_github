package Toure_Dubromel;

public class PersonnelCabine extends Employe{
    public String qualification;

    public PersonnelCabine(String id, String nom, String adresse, String contact, String numEmp, String date, String qualif) {
        super(id, nom, adresse, contact, numEmp, date);
        this.qualification = qualif;
    }

    @Override
    public void obtenirInfos() {
        System.out.println("[Cabine] " + getNom() + " - Qualif: " + qualification);
    }

    @Override
    public String obtenirRole() { return "Personnel de Cabine"; }
}


