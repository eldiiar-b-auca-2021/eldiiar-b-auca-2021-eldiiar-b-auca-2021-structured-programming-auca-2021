import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        final double c = inp.nextDouble();
        double a = 3.5 * c;

        final double d = inp.nextDouble();
        double s = 7.5 * d;

        double v = a + s;

        double e = v / 11;

        System.out.printf("MEDIA = %.5f\n", e);

    }
}
