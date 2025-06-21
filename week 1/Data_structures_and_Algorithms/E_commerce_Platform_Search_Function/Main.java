package E_commerce_Platform_Search_Function;


public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop","Electronics"),
            new Product(202, "Shoes","Footwear"),
            new Product(303, "Phone","Electronics"),
            new Product(404, "Watch","Accessories")
        };

        System.out.println("Linear Search");
        Product found1 = SearchAlgorithms.linearSearch(products, 303);
        System.out.println(found1 != null ? found1 : "Product not found");

        SearchAlgorithms.sortById(products);
        System.out.println("\nBinary Search");
        Product found2 = SearchAlgorithms.binarySearch(products, 303);
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}
