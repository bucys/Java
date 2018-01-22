package Uzduotis06;

public class Main {
    public static void main(String[] args) {

        Mokinys[] mokiniai = new Mokinys[] {
        new Mokinys("Petras", "Petraitis", 5, new int[]{9,8,7}),
        new Mokinys("Jonas", "Jonaitis", 5, new int[]{5,8,8}),
        new Mokinys("Antanas", "Antanaitis", 6, new int[]{9,10,10}),
        new Mokinys("Aldona", "Onaite", 7, new int[]{9,8,7}),
        new Mokinys("Antanina", "Onaite", 5, new int[]{6,8,9}),
        new Mokinys("Jonas", "Antanaitis", 8, new int[]{9,5,7}),
        new Mokinys("Petras", "Petraitis", 5, new int[]{7,6,7}),
        new Mokinys("Jonas", "Petraitis", 6, new int[]{9,4,6}),
        new Mokinys("Tadas", "Antanaitis", 6, new int[]{9,7,7}),
        new Mokinys("Jurga", "Onaite", 7, new int[]{5,8,7}),
        new Mokinys("Inga", "Petraitė", 8, new int[]{6,6,9}),
        new Mokinys("Jonas", "Antanaitis", 7, new int[]{8,9,10})};

        Mokinys[] x = new Mokinys[1];
        int ilgis = mokiniai.length;

        for (int m = 0; m < ilgis; m++) {
            for (int i = 0, n = 1; n < mokiniai.length; i++, n++) {
                if (mokiniai[i].getVidurkis() > mokiniai[n].getVidurkis()) {
                    x[0] = mokiniai[i];
                    mokiniai[i] = mokiniai[n];
                    mokiniai[n] = x[0];
                }
            }
            ilgis = mokiniai.length - 1 ;
        }

        System.out.println("Vardas" + ' ' + "Pavardė" + ' ' + "Klasė" + ' ' + "Vidurkis");
        for (Mokinys m : mokiniai) {
            System.out.println(m.getVardas() + ' ' + m.getPavarde() + " " + m.getKlase() + " " + m.getVidurkis());
        }

    }
}
