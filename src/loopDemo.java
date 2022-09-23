public class loopDemo {
    public static void main(String args[]){
        for (int i = 1; i < 11 ; i=i+1) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        int i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");


        //Do-While
       int j = 1;

       do {
           System.out.println("While Döngüsü Bitti");
           j += 2;
       }while (j>10);


    }
}