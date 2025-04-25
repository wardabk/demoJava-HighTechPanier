public class Main {
    public static void main(String[] args) {

        Produit ordinateur = new Ordinateur("Ordinateur Dell", 1000, "Intel Core i7", 15.6);
        Produit smartphone = new Smartphone("iPhone 13", 1200, "Apple", 3200);


        Panier panier = new Panier();

        panier.ajouterAuPanier(ordinateur);
        panier.ajouterAuPanier(smartphone);

        panier.afficherPanier();
    }
}

