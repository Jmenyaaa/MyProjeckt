import java.util.ArrayList;


public class Catalog {
    String productName;
    ArrayList Products;


    public Catalog(String productName, ArrayList products) {
        this.productName = productName;
        Products = products;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "productName='" + productName + '\'' +
                ", Products=" + Products +
                '}';
    }
}
