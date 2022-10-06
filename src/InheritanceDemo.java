public class InheritanceDemo {
    public static void main(String[]args){
    ogretmenKrediManager ogretmenKrediManager = new ogretmenKrediManager();
    ogretmenKrediManager.hesapla();
        KrediUI krediUI = new KrediUI();
        KrediUI.KrediHesapla(ogretmenKrediManager);
    }
}
