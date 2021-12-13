import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("A = ");
            long a = inp.nextInt();
            System.out.print("B = ");
            long b = inp.nextInt();
            long gcd = commonD(a, b);
            System.out.printf("GCD (%d, %d) = %d%n", a, b, gcd);
        } catch (Exception e) {
            System.out.println("GCD is not defined");
        }

    }
    static long commonD (long a, long b) {
        if (a == 0) {
            return b;
        }

        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
