public class mazejimas {
    public static void main(String[] args) {

        double a[] = {-10, 0, 2, 9, -5};
        int i = 0;
        int z = 1;
        double x = 0;
        double y = 0;
        double m = a.length;

        while (m > 1) {
            for ( i = 0; z < a.length; i++, z++) {
                if (a[i] > a[z]) {
                    x = a[i];
                    a[i] = a[z];
                    a[z] = x;
                }
            }
            m--;
            i = 0;
            z = 1;
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
