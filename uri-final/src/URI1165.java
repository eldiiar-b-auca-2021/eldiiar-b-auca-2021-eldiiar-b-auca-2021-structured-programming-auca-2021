import java.util.Scanner;

public class URI1165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(),j = 0,input;
        while (j != number) {
            input = in.nextInt();
            isPrime(input);
            if (isPrime(input)) {
                System.out.println(input+" eh primo");
            } else {
                System.out.println(input+" nao eh primo");
            }
            j++;
        }
    }
    static boolean isPrime(int input) {
        boolean res = true;
        int checker = 0;
        if (input == 1) {
            checker++;
        }
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                checker++;
            }
        }
        if (checker != 2) {
            res  = false;
        }
        return res;
    }
}
