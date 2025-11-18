public class Service {
    
    public void createProduct(int id, String name, int price){
        Product novo = new Product(id, name, price);
        FakeDB.saveProduct(novo);
    }
}
