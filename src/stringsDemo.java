public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel ";

        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.length());
        System.out.println(mesaj.concat("Yaşasın!")); // Yeni Bir String Değeri Oluşturuyor
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler,0);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e"));
    }
}
