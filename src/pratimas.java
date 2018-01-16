public class pratimas {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        double suma = 0;
        double sumb = 0;
        double ska = 0;
        double skb = 0;

        for (int i = 0; i < a.length; i++) {
            suma +=a[i];
        }
        double vidA = suma / a.length;

        for (int i = 0; i < b.length; i++) {
            sumb += b[i];
        }
        double vidB = sumb / b.length ;

        double skirtumas = vidA - vidB;


        System.out.println(skirtumas);
    }
}
