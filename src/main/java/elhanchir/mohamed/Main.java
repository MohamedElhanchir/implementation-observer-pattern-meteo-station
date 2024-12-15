package elhanchir.mohamed;

import elhanchir.mohamed.entities.DonneesMeteo;
import elhanchir.mohamed.observer.AffichageConditions;

public class Main {
    public static void main(String[] args) {
        DonneesMeteo donneesMeteo= new DonneesMeteo();
        donneesMeteo.enregistrerObservateur(new AffichageConditions());

        donneesMeteo.setMesures(40,50,23);
    }
}