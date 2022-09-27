import java.sql.SQLOutput;

public class miniProjeAsalSayi {
    public static void main(String[] args){
        int number;
        number = 4;
        int remainder = number % 2;


        if (remainder == 1) {

            System.out.println("Sayı Asaldır");
        } else if (remainder != 1  ) {
            System.out.println("Sayınız Asal değildir");

        }
        else {
            System.out.println("Lütfen sayı giriniz");
        }

        System.out.println("Girdiğiniz Sayı : " +number + " " + "Girilen Sayının Kalanı :" + remainder );
    }
}
