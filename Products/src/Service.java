public class Service {
    
    public void createProduct(int id, String name, int price){
        if(FakeDB.searchProduct(id) != null){
            System.out.println("ID already exists!");
            return;
        }

        Product novo = new Product(id, name, price);
        FakeDB.saveProduct(novo);
    }

    public void listProducts(){
        for (Product p : FakeDB.allProducts()){
            System.out.println(p.getId() + " - " + p.getName() + " R$" + p.getPrice());
        }
    }

    public Product searchProduct(int id){
        return FakeDB.searchProduct(id);
    }

    public void updateProductName(int id, String newName){
        Product p = FakeDB.searchProduct(id);

        if(p == null){
            System.out.println("Product not found");
            return;
        }

        p.setProductName(newName);
        System.out.println("Name updated.");
    }

    public void updateProductPrice(int id, int newPrice){
        if(newPrice < 0){
            System.out.println("Invalid price");
            return;
        }

        Product p = FakeDB.searchProduct(id);

        if(p == null){
            System.out.println("Product not found");
            return;
        }

        p.setProductPrice(newPrice);
        System.out.println("Price updated.");
    }

    public void deleteProduct(int id){
        Product p = FakeDB.searchProduct(id);

        if(p == null){
            System.out.println("Product not found");
            return;
        }

        FakeDB.delete(p);
        System.out.println("Product deleted.");
    }
}
