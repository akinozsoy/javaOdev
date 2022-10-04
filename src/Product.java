public class Product {
    public Product(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    //Attribute
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    private String renk;
    private String _kod;

    public int get_id() {
        return id;
    }

    public void set_id(int _id) {
        this.id = _id;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String _name) {
        this.name = _name;
    }

    public String get_description() {
        return description;
    }

    public void set_description(String _description) {
        this.description = _description;
    }

    public double get_price() {
        return price;
    }

    public void set_price(double _price) {
        this.price = _price;
    }

    public int get_stockAmount() {
        return stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this.stockAmount = _stockAmount;
    }

    public String get_renk() {
        return renk;
    }

    public void set_renk(String _renk) {
        this.renk = _renk;
    }

    public String get_kod() {
        return this.name.substring(0,1) +id;
    }

    public void set_kod(String _kod) {
        this._kod = _kod;
    }

    //Bana yukarıdaki Id döndür.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }
}
