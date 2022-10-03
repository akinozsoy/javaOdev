public class Product {
    //Attribute
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    public  void Add(Product product){
        System.out.println("Ürün Eklendi "+ product.name);
    }
}
