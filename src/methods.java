public class methods {
    public static void main(String[] args){
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int [] sayilar = new int []{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak){
                System.out.println("Sayı mevcuttur");
                varMi = true;
                break;
            }
        }
        if(varMi) {
            mesajVer("Sayı Mevcuttur :" + aranacak);
        }else{

            mesajVer("Sayı Mevcutt değildir : " + aranacak);
        }


        }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }



}
