package Uzduotis05;

public class Main {
    public static void main(String[] args) {

        Mokinys[] mokiniai = new Mokinys[6];
        mokiniai[0] = new Mokinys("Petras", "Petraitis", 1, new int[]{5,8,7});
        mokiniai[1] = new Mokinys("Jonas", "Jonaitis", 2, new int[]{5,8,7});
        mokiniai[2] = new Mokinys("Antanas", "Antanaitis", 1, new int[]{5,8,7});
        mokiniai[3] = new Mokinys("Ieva", "Onaite", 2, new int[]{5,8,7});
        mokiniai[4] = new Mokinys("Ona", "Onaite", 3, new int[]{5,8,7});
        mokiniai[5] = new Mokinys("Jonas", "Antanaitis", 1, new int[]{5,8,7});


        Mokinys[] x = new Mokinys[1];
        Mokinys[] y = new Mokinys[1];
        int length = mokiniai.length;

        for (int m = 0; m < length; m++) {
            for (int i = 0, n = 1; n < mokiniai.length; i++, n++) {
                if (mokiniai[i].klase > mokiniai[n].klase) {
                    x[0] = mokiniai[i];
                    mokiniai[i] = mokiniai[n];
                    mokiniai[n] = x[0];
                }
            }
            length = mokiniai.length - 1;
        }

        for (Mokinys m : mokiniai) {
            System.out.println(m.vardas + ' ' + m.pavarde + ' ' + m.klase);
        }


    }
}
