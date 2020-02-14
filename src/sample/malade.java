package sample;


import java.util.ArrayList;
import java.util.Date;

public class malade {
    private String nom;
    private String prenom;
    private  String num_assurance;
    ArrayList<consultation> listconsult = new ArrayList();

    public malade(String nom, String prenom, String num_assurance, ArrayList<consultation> listconsult) {
        this.nom = nom;
        this.prenom = prenom;
        this.num_assurance = num_assurance;
        this.listconsult =  new ArrayList <consultation>();   //---   liste vide ------//
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNum_assurance() {
        return num_assurance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNum_assurance(String num_assurance) {
        this.num_assurance = num_assurance;
    }

    public void ajouter_consultation(String num, Date date,String num_ord, String [] listmedica){
        consultation c = new consultation();
        c.setNum(num);
        c.setDate(date);
        c.setNum_ord(num_ord);
        c.setListmedica(listmedica);
        listconsult.add(c);

    }


}
