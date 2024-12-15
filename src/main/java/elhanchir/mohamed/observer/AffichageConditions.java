package elhanchir.mohamed.observer;

public class AffichageConditions implements Affichage,Observateur{
    @Override
    public void afficher(float temperature, float humidite, float pression) {
        System.out.println("Conditions actuelles:"+
                temperature+" degès et "+humidite+" % d'hmidité");
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        afficher(temperature,humidite,pression);
    }
}
