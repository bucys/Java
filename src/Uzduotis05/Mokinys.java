package Uzduotis05;

public class Mokinys extends Zmogus {
    int klase;
    int[] trimestras;

    Mokinys(String vardas, String pavarde, int klase) {
        super(vardas, pavarde);
        this.klase = klase;
    }

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this(vardas, pavarde, klase);
        this.trimestras = trimestras;
    }

    public static int sort(int m,int m2) {
        if (m > m2){
            return m;
        }
        else {
            return m2;
        }

    }
}
