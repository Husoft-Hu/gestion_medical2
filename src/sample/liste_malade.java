package sample;

import java.util.ArrayList;

public class liste_malade {

    ArrayList<malade> list_malade = new ArrayList();

    public liste_malade(ArrayList<consultation> list_malade) {
        this.list_malade = new ArrayList <malade>();
    }



    public void ajouter_malade(malade m){
        list_malade.add(m);

    }

    public void rechercher_malade(){

    }






}
