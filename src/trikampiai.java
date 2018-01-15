public class trikampiai {

    public static void main(String[] args) {

        double[] a={3, 2, 5, 5};
        double[] b={4, 10, 6, 5};
        double[] c={5, 8, 5, 5};
        int d=0;
        double s=0;
        double i;
        for ( i = 0; i < a.length; i++){
            double e=d;
            if(a[d] + b[d] > c[d] && a[d] + c[d] > b[d] && b[d] + c[d] > a[d]){
                double p = (a[d] + b[d] + c[d])/2;
                s = Math.sqrt(p * (p - a[d]) * (p - b[d]) * (p - c[d]));
                System.out.println("trikampio plotas = " + s);
                System.out.print(+(++e)+"\rtrikampis:");

                if (c[d] == a[d] && c[d] == b[d] && b[d] == a[d]){
                    System.out.println("lygiakrastis\n");
                }

                else if (c[d] == a[d] && c[d] != b[d] && c[d] != a[d] || b[d] == a[d] && b[d] != c[d] && a[d] != c[d]||
                        c[d] == b[d] && c[d] != a[d] && b[d] != a[d]){
                    System.out.println("lygiasonis\n");
                }

                else if (Math.pow(a[d], 2) + Math.pow(b[d], 2) == Math.pow(c[d], 2)){
                    System.out.println("statusis\n");
                }

                else {
                    System.out.println("ivairiakrastis\n");
                }
            }
            else {
                System.out.println("trikampis nesusidaro\n");
            }
            d++;
        }

    }
}