public class Main {
    //resuability
    public static void main(String[] args) {

        String merhaba = "Merhaba DÜNYA";
        String mesaj = "Öğrenci Sayısı : ";
        System.out.println("Hello World");
        System.out.println("Merhaba Java");
        System.out.println(merhaba);

        int ogrenciSayisi = 11;
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }

}