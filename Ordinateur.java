public class Ordinateur extends Produit {
    private String processeur;
    private double tailleEcran;

    public Ordinateur(String nom, double prix, String processeur, double tailleEcran) {
        super(nom, prix);
        this.processeur = processeur;
        this.tailleEcran = tailleEcran;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Ordinateur : " + getNom() + " - Prix : " + getPrix() + "€");
        System.out.println("Processeur : " + processeur + " - Taille de l'écran : " + tailleEcran + " pouces");
    }

}

