import java.sql.SQLOutput;

public class miniProjeAsalSayi {
    public static void main(String[] args){
        int number;
        number = 1;
        int remainder = number % 2;
        boolean isPrime = true;
        if(number<2){
            System.out.println("Geçersiz Sayı");
        }
        if (number==1){
            System.out.println("Sayı asal değildir.");
            return;

        }


        for (int i = 2; i < number; i++) {

            if (number % i == 0){
                isPrime = false;
            }
            return;
        }
        if (isPrime){
            System.out.println("Sayı Asaldır");
        }
        else{
            System.out.println("Sayı Asal Değildir.");
        }
        /*if (remainder == 1) {

            System.out.println("Sayı Asaldır");
        } else if (remainder != 1  ) {
            System.out.println("Sayınız Asal değildir");

        }
        else {
            System.out.println("Lütfen sayı giriniz");
        }

        System.out.println("Girdiğiniz Sayı : " +number + " " + "Girilen Sayının Kalanı :" + remainder );*/
    }
}
