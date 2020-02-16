import java.util.Scanner;  // Klavyeden değer almaya yarar.

/** double tipli x,y,z nesne değişkenlerine 
sahip kutu sınıfını yazalım: */

class Kutu{
    double x, y, z;  // Kenar bilgileri
}

/** Parametreli, statik, double tipte 3 adet 
parametre alan ve hacim hesaplayan, bu hacim değerini 
döndüren hacim1 metoduna hesap1 sınıfını yazalım: */

class hesap1{
    public static double hacim1(double a, double b, double c){
        return(a * b * c);
    }
}

/** Parametreli, geri değer döndürmeli, hacim hesaplayan 
kutu tipinde parametre alan, hacim2 metodunu içeren 
hesap2 sınıfını yazalım: */

class hesap2{
    public double hacim2(Kutu m){
        return(m.x * m.y * m.z);
    }
}

/** Depo sınıfı; Kutu sınıfından nesne yaratsın, nesne 
değişkenlerini kullanıcıdan istesin. hesap1'in hacim1 metodunu 
ve hesap2'nin hacim2 metodunu kullanarak hacim hesaplayalım: */

class depo{
    public static void main(String[] args){
        double h1, h2;
        Scanner oku = new Scanner(System.in);
        Kutu k = new Kutu();
        k.x = oku.nextDouble();
        k.y = oku.nextDouble();
        k.z = oku.nextDouble();
        h1 = hesap1.hacim1(k.x, k.y, k.z);
        hesap2 n = new hesap2();
        h2 = n.hacim2(k);
        System.out.printf("hesap1 = %f\nhesap2 = %f\n", h1, h2);
    }
}

