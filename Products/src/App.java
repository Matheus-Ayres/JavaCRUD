public class App {
    public static void main(String[] args) throws Exception {
        Service service = new Service();

        service.createProduct(1, "car", 10);
        service.createProduct(2, "moto", 20);

        System.out.println("Products list:");
        service.listProducts();

        service.updateProductName(1, "carro");

        
        System.out.println("By id:");

        service.searchProduct(1);

        service.updateProductPrice(2, 30);

        
        System.out.println("After update:");

        service.listProducts();

        service.deleteProduct(1);

        
        System.out.println("after dele:");

        service.listProducts();

    }
}
