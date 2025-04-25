import java.util.ArrayList;
import java.util.List;

public class Panier implements PanierActions {
    private List<Produit> panier;

    public Panier() {
        panier = new ArrayList<>();
    }

    @Override
    public void ajouterAuPanier(Produit produit) {
        panier.add(produit);
        System.out.println(produit.getNom() + " a été ajouté au panier.");
    }

    @Override
    public void afficherPanier() {
        System.out.println("\nContenu du panier :");
        for (Produit produit : panier) {
            produit.afficherDetails();
        }
    }
}
