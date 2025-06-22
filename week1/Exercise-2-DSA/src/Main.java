import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(3, "Phone", "Electronics"),
                new Product(1, "Shoes", "Apparel"),
                new Product(5, "Watch", "Accessories"),
                new Product(2, "Laptop", "Electronics"),
                new Product(4, "Headphones", "Electronics")
        };

        Product foundLinear = linearSearch(products, 2);
        System.out.println("Linear Search Result: " + foundLinear);

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product foundBinary = binarySearch(products, 2);
        System.out.println("Binary Search Result: " + foundBinary);
    }

    public static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            } else if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
