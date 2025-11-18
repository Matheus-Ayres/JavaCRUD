public class Service {
    
    public void createProduct(int id, String name, int price){
        Product novo = new Product(id, name, price);
        FakeDB.saveProduct(novo);
    }

    public void listProducts(){
        for (Product product : FakeDB.allProducts()){
            System.out.println( product.getId() + " - " + product.getName() + " R$" + product.getPrice() );
        } 
    }

    public Product searchProduct(int id){
        return FakeDB.searchProduct(id);
    }

    public void updateProductName(int id, String newName){
        Product product = FakeDB.searchProduct(id);
        if(product != null){
            product.setProductName(newName);
        }else{
            System.out.println("Product not found");
        }
    }

    public void updateProductPrice(int id, int newPrice){
        Product product = FakeDB.searchProduct(id);
        if(product != null){
            product.setProductPrice(newPrice);
        }else{
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(int id){
        Product product = FakeDB.searchProduct(id);
        if(product != null){
            FakeDB.delete(product);
        }
    }
}
