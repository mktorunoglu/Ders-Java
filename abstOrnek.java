abstract class sekil{
    String isim;
    void isimBelirle(String isim){
        this.isim = isim;
    }
    String isimGetir(){
        return isim;
    }
    abstract double alanHesap();
}

class ucgen extends sekil{
    double yukseklik;
    double taban;
    void bilgi(double yukseklik, double taban){
        this.yukseklik = yukseklik;
        this.taban = taban;
        isimBelirle("Ucgen");
        isimGetir();
    }
    double alanHesap(){
        return(yukseklik * taban / 2);
    }
}

class yamuk extends sekil{
    double alt;
    double ust;
    double h;
    void bilgi(double alt, double ust, double h){
        this.alt = alt;
        this.ust = ust;
        this.h = h;
        isimBelirle("Yamuk");
        isimGetir();
    }
    double alanHesap(){
        return((alt + ust) * h / 2);
    }
}

class daire extends sekil{
    double yaricap;
    double pi;
    void bilgi(double yaricap, double pi){
        this.yaricap = yaricap;
        this.pi = pi;
        isimBelirle("Daire");
        isimGetir();
    }
    double alanHesap(){
        return(pi * yaricap * yaricap);
    }
}

class SoyutSinifOrnegi{
    public static void main(String[] args){
        ucgen u = new ucgen();
        yamuk y = new yamuk();
        daire d = new daire();
        u.bilgi(3, 5);
        y.bilgi(3, 4, 5);
        d.bilgi(4, 6);
        System.out.println("Ucgenin Bilgileri: " + u.isimGetir());
        System.out.println("Ucgenin Alani: " + u.alanHesap());
        System.out.println("Yamugun Bilgileri: " + y.isimGetir());
        System.out.println("Yamugun Alani: " + y.alanHesap());
        System.out.println("Dairenin Bilgileri: " + d.isimGetir());
        System.out.println("Dairenin Alani: " + d.alanHesap());
    }
}

