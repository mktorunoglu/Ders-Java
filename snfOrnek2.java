class Hesaplama3{
    int sabit = 2;
    private int ozelsabit = 1;
    public static class Toplama3{
        static int toplam;
        int sonuc;
        public int toplamaYap(int a, int b){
            // return a + b + sabit;   HATA!
            sonuc = toplam = a + b;
            return sonuc;
            /* Toplama3 statik dahili üye sınıfının, toplamaYap() yordamının içerisinde, Hesaplama3 sınıfına 
            ait global olarak tanımlanmış ilkel (primitive) int tipindeki sabit alanına direk erişilemez. */
        }
        public void dekontOlustur(){
            /* Sabit alanina ve ekranaBas() yordamina ulasabilmek icin Hesaplama3 sinifina ait nesne olusturmamiz gerekir.
            Eğer statik dahili üye sınıfın içerisinden, onu çevreleyen sınıfa ait bir alan (statik olmayan) 
            veya yordam (statik olmayan) çağırılmak isteniyorsa bu bizzat ifade edilmelidir. */
            Hesaplama3 hs3 = new Hesaplama3(); //Dikkat
            int a = hs3.ozelsabit;
            hs3.ekranaBas();
            System.out.println("Dekont olusturuyor = " + hs3.sabit + " - " + a);
        }
    }
    public class Cikartma3{
        int sonuc;
        // static int sonuc1;   HATA!
        // Statik olmayan dahili üye sınıfların içerisinde statik global alan tanımlanamaz.
        public int cikartmaYap(int a, int b){
            ekranaBas();
            sonuc = (a - b) - ozelsabit;
            return sonuc;  // Dikkat
        }
    }
    private void ekranaBas(){
        System.out.println("Hesaplama3.ekranaBas()");
    }
    public static void main(String[] args){
        /* Hesaplama3.Toplama3 ht = new Hesaplama3().new Toplama3();   HATA!
        Toplama3 statik dahili üye sınıfına ait nesne oluştururken, onu 
        çevreleyen sınıfa ait herhangi bir nesne oluşturmak zorunda kalmadık. */
        Toplama3 tp3 = new Toplama3();
        tp3.dekontOlustur();
        int sonuc = tp3.toplamaYap(10, 5);
        System.out.println("Sonuc = 10 + 5 = " + sonuc);
    }
}

