public class ClassesWithAttributes {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"siyah");
        /*product.set_name(" Laptop");
        product.setId(1);
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);*/
        product.getId();
        System.out.println(product.get_name());
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.get_kod());
    }

}
