public class Smartphone extends Produit {
    private String marque;
    private int capaciteBatterie;

    public Smartphone(String nom, double prix, String marque, int capaciteBatterie) {
        super(nom, prix);
        this.marque = marque;
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Smartphone : " + getNom() + " - Prix : " + getPrix() + "€");
        System.out.println("Marque : " + marque + " - Capacité de la batterie : " + capaciteBatterie + " mAh");
    }
}
