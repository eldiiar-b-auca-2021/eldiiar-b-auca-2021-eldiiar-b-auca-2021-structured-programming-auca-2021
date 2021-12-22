public class Problem10 {
    public static void main(String[] args) {
        System.out.println("i           m(i)");
        System.out.println("_________________");
        for (double i = 1; i < 21; i++) {
            System.out.printf("%.0f",i);
            System.out.printf("           %.4f\n",m(i));
        }

    }
    static double m(double i) {
        double res = 0;
        for (double j = 1; j <= i; j++) {
            res+=j/(j+1);
        }
        return res;
    }
}
