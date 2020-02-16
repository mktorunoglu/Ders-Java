class Hesaplama2{
    private int sabit1 = 2;
    private static int sabit2 = 1;
    public class Toplama2{
        public int toplamaYap(int a, int b){
            return (a + b) + sabit1;
        }
    }
    public class Cikartma2{
        public int cikartmaYap(int a, int b){
            dekontBilgileriGoster();
            return (a - b) - sabit2;
        }
    }
    private void dekontBilgileriGoster(){
        System.out.println("Dekont Bilgileri Gosteriliyor...");
    }
    public void ekranaBas(int a, int b){
        int sonuc = new Toplama2().toplamaYap(a, b);
        System.out.println("Sonuc = " + a + " + " + b + " + sabit1 = " + sonuc);
    }
    public static void main(String[] args){
        Hesaplama2 h2 = new Hesaplama2();
        h2.ekranaBas(10, 5);
        Hesaplama2.Toplama2 ht2 = h2.new Toplama2();
        int sonuc = ht2.toplamaYap(11, 6);
        System.out.println("Sonuc = 11 + 6 + sabit1 = " + sonuc);
        Hesaplama2.Cikartma2 hc2 = h2.new Cikartma2();
        int sonuc1 = hc2.cikartmaYap(10, 5);
        System.out.println("Sonuc = 10 - 5 - sabit2 = " + sonuc1);
    }
}

