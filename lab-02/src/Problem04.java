import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Length in inches?");

        double b = inp.nextDouble();
        double d = 2.54 * b;

        System.out.printf("%.0f in. = %.2f cm\n",b, d);

    }
}
