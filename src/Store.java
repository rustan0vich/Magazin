import java.util.Random;

public class Store {
    private Product[] products;

    public Store() {
    }

    public Store(Product[] products) {
        this.products = products;
        for (int i = 0; i < products.length ; i++) {

    products[i].placeProduct(products[i]);
        }
    }



    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


}
