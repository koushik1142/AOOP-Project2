import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Product> {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sortByName() {
        products.sort(null); // Uses Comparable
    }

    public void sortByPrice() {
        products.sort(ProductComparators.byPrice());
    }

    public void sortByQuantity() {
        products.sort(ProductComparators.byQuantity());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}