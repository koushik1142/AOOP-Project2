import java.util.Comparator;

public class ProductComparators {
    public static <Product> Comparator<Product> byPrice() {
        java.lang.Object Comparator;
        return Comparator.comparingDouble(Product::getPrice);
    }

    public static Comparator<Product> byQuantity() {
        return Comparator.comparingInt(Product::getQuantity);
    }
}