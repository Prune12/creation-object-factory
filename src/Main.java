public class Main {
    public static void main(String[] args) {

        ProduitFactory produitfactory = new ProduitFactory();
        produit product=null;

        product=produitfactory.getProduit(ProduitFactory.TYPE_PRODUITA1);
        product.methodA();

        product=produitfactory.getProduit(ProduitFactory.TYPE_PRODUITA2);
        product.methodA();

        product=produitfactory.getProduit(ProduitFactory.TYPE_PRODUITA3);
        product.methodA();

    }
}