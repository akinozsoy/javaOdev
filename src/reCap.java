public class reCap {
    public static void main(String[]args){
        /*int sayi1 = 10;
        int sayi2 = 30;
        int sayi3 = 40;

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.printf("Number 1 biggest the number");
        } else if (sayi2 > sayi1 && sayi2>sayi3) {
            System.out.println("Number 2 biggest the number ");
        }
        else{
            System.out.println("Number 3 biggset the number");
        }
    }*/
        int sayi1  = 30 ;
        int sayi2 = 25 ;
        int sayi3 = 2 ;
        int enBuyuk = sayi1 ;
        if ( enBuyuk < sayi2 ) {
            enBuyuk = sayi2 ;
        }

        if ( enBuyuk < sayi3 ) {
            enBuyuk = sayi3 ;
        }

        System.out.println("En büyük = "+enBuyuk);
}
}

