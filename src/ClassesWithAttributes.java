public class ClassesWithAttributes {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;
        System.out.println(product.name);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.Add2(1, "", "", 2, 200);
    }

}
