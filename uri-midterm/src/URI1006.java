import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = a * 2;

        double c = inp.nextDouble();
        double d = c * 3;

        double f = inp.nextDouble();
        double s = f * 5;

        double n = b + d + s;
        double g = n / 10;

        System.out.printf("MEDIA = %.1f\n", g);
    }
}
