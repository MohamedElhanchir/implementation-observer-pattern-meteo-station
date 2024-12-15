package elhanchir.mohamed.observer;

public interface Sujet {
        void enregistrerObservateur(Observateur o);
        void supprimerObservateur(Observateur o);
        void notifierObservateurs();
}
