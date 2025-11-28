package database;
import model.Product;
import java.util.ArrayList;

public class FakeDB {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void saveProduct(Product p){
        products.add(p);
    }

    public static ArrayList<Product> allProducts(){
        return products;    
    }

    public static Product searchProduct(int id){
        for(Product product : products){
            if(product.getId() == id){ //getId == id getter in product.java
                return product;
            }
        }
        return null;
    }

    public static void delete(Product product){
        products.remove(product);
    }
}
