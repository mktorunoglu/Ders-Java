interface Arayuz1{
    public void a1();
}
interface Arayuz2{
    public void a2();
}
abstract class Soyut1{
    public abstract void s1();
}
class A extends Soyut1 implements Arayuz1, Arayuz2{
    public void s1(){  // İptal etti (override)
        System.out.println("A.s1()");
    }
    public void a1(){  // İptal etti (override)
        System.out.println("A.a1()");
    }
    public void a2(){  // İptal etti (override)
        System.out.println("A.a2()");
    }
}
class GenelBakis{
    public static void main(String[] args){
        Soyut1 soyut1 = new A();
        Arayuz1 arayuz1 = (Arayuz1) soyut1;
        Arayuz2 arayuz2 = (Arayuz2) soyut1;
        // Arayuz2 arayuz2 = (Arayuz2) arayuz1;  // Doğru
        soyut1.s1();
        // soyut1.a1();  // Hata!
        // soyut1.a2();  // Hata!
        arayuz1.a1();
        // arayuz1.a2();  // Hata!
        // arayuz1.s1();  // Hata!
        arayuz2.a2();
        // arayuz2.a1();  // Hata!
        // arayuz2.s1();  // Hata!
    }
}

