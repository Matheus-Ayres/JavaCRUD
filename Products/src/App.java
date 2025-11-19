public class App {
    public static void main(String[] args) throws Exception {
        Service service = new Service();

        service.createProduct(1, "car", 10);
        service.createProduct(2, "moto", 20);

        System.out.println("Products list:");
        service.listProducts();

        service.updateProductName(1, "carro");

        service.searchProduct(2);

        service.updateProductPrice(2, 30);

        service.listProducts();

        service.deleteProduct(2);
        service.listProducts();

    }
}
