package Uzduotis06;

public class Mokinys extends Zmogus {

    private int klase;
    private int[] trimestras;

    public int getKlase() {
        return klase;
    }

    private int[] getTrimestras() {
        return trimestras;
    }

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        super(vardas, pavarde);
        this.klase = klase;
        this.trimestras = trimestras;

    }

    //vidurkio skaiciavimas//
    public double getVidurkis() {
        double suma = 0;
        double vidurkis;

        for (int i = 0; i < getTrimestras().length; i++) {
            suma += getTrimestras()[i];
        }
        vidurkis = Math.round(suma / getTrimestras().length);
        return vidurkis;
    }
}