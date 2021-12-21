import java.util.Scanner;

public class URI1174 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] a = new double[100];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
            if (a[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, a[i]);
            }
        }
    }
}
