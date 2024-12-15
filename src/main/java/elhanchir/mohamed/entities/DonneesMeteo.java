package elhanchir.mohamed.entities;

import elhanchir.mohamed.observer.Observateur;
import elhanchir.mohamed.observer.Sujet;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet {

    private float temperature;
    private float humidite;
    private float pression;

    private List<Observateur> observateurs=new ArrayList<>();

    @Override
    public void enregistrerObservateur(Observateur o) {
        observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        observateurs.remove(o);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualiser(temperature,humidite,pression);
        }
    }

    public void setMesures(float t, float h, float p) {
        this.temperature=t;
        this.humidite=h;
        this.pression=p;
        notifierObservateurs();
    }


    public List<Observateur> getObservateurs() {
        return observateurs;
    }

    public void setObservateurs(List<Observateur> observateurs) {
        this.observateurs = observateurs;
    }

    public float getPression() {
        return pression;
    }

    public void setPression(float pression) {
        this.pression = pression;
    }

    public float getHumidite() {
        return humidite;
    }

    public void setHumidite(float humidite) {
        this.humidite = humidite;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
