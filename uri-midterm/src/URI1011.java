import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double c = 4.0 / 3 * 3.14159 * a * a * a;

        System.out.printf("VOLUME = %.3f\n", c);
    }
}
