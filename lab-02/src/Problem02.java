import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.printf("1st value? ");
        int c = inp.nextInt();// 2

        System.out.printf("2nd value? ");
        int d = inp.nextInt();// 3

        System.out.printf("Before swapping: a = %d; b = %d;%n", c, d);// 2 3
        c = c + d; // 2 = \2 + 3 = 5\
        d = c - d; // 3 = \5 - 3 = 2\
        c = c - d; // 5 = \5 - 2 = 3\
        System.out.printf("After swapping: a = %d; b = %d;\n", c, d);
    }
}

