import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root = (-b + Math.sqrt(discriminant));
        double r = root / 2 * a;
        double secondRoot = (-b - Math.sqrt(discriminant));
        double secondR = secondRoot / 2 * a;

        if (discriminant == 0) {
            double oneRoot = -b / 2 * a;
             System.out.printf("The equation has one root %.0f\n", oneRoot);
        } else if (discriminant > 0) {
               System.out.printf("The equation has two roots %.6f and %.5f\n", r, secondR);
        } else {
                 System.out.println("The equation has no real roots");
        }
    }
}
