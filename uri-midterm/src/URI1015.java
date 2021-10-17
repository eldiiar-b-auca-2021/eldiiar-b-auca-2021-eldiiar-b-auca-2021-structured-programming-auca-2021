import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double x = inp.nextDouble();
        double y = inp.nextDouble();
        double x2 = inp.nextDouble();
        double y2 = inp.nextDouble();

        double a = x2 - x;
        double b = a * a;

        double c = y2 - y;
        double d = c * c;

        double f = b + d;

        System.out.printf("%.4f%n",Math.sqrt(f));
    }
}
