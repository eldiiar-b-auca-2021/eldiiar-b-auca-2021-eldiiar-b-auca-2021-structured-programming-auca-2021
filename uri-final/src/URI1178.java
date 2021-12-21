import java.util.*;

public class URI1178 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] set = new double[100];
        double n = in.nextDouble();
        for (int i = 0; i < set.length; i++) {
            set[i] = n;
            n/=2.0;
        }
        for (int i = 0; i < set.length; i++) {
            System.out.printf("N[%d] = %.4f\n",i,set[i]);
        }
    }
}
