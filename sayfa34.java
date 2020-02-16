class kutu1{
    double x;
    double y;
    double z;
    boolean kirilir;
    int taban_kodu;
}

class depo{
    public static void main(String[] args){
        kutu1 k1 = new kutu1();
        kutu1 k2 = new kutu1();
        // Yukarıdaki iki satır nesne yaratmaya yarayan kod şablonudur.

        k1.x = 3.0; k1.y = 4.0; k1.z = 5.0;
        k1.kirilir = false;
        k1.taban_kodu = 0;
        
        k2.x = 5; k2.y = 10; k2.z = 7.5;
        k2.kirilir = true;
        k2.taban_kodu = 1;

        System.out.println("k1 hacmi: " + (k1.x * k1.y * k1.z));
        System.out.println("k2 hacmi: " + (k2.x * k2.y * k2.z));
        System.out.println("k1 taban kodu: " + (k1.taban_kodu));
        System.out.println("k2 taban kodu: " + (k2.taban_kodu));
    }
}

//   Kod, terminalde "javac" komutu ile derlendiğinde çalışılan dizinde "depo.class"
// ve "kutu1.class" olmak üzere iki sınıf dosyası oluşur. Main fonksiyonunu barındıran
// sınıfın dosyası (bu kodda "depo.class" dosyası) "java" komutu ile çalıştırılır.
// Bu kod için "kutu1.class" dosyası çalıştırılırsa hata alınır.

