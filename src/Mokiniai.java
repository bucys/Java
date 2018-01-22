public class Mokiniai {
        String vardas;
        String pavarde;
        int klase;

        Mokiniai(String vardas, String pavarde, Integer klase) {
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.klase = klase;
        }

        public static void main(String[] args) {

            Mokiniai[] mokinys = new Mokiniai[5];
            mokinys[0] = new Mokiniai("Jonas", "Jonaitis", 5);
            mokinys[1] = new Mokiniai("Petras", "Petraitis", 4);
            mokinys[2] = new Mokiniai("Antanas", "Antanaitis", 2);
            mokinys[3] = new Mokiniai("Jonas", "Petraitis", 4);
            mokinys[4] = new Mokiniai("Ona", "Onaite", 3);


            for (Mokiniai m : mokinys) {
                System.out.println(m.klase + ". " + m.vardas +" " + m.pavarde);

            }
        }
    }
