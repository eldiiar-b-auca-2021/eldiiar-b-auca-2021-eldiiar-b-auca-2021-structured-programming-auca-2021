import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.printf("1st value? ");
        int c = inp.nextInt();

        System.out.printf("2nd value? ");
        int d = inp.nextInt();

        System.out.printf("Before swapping: a = %d; b = %d;%n",c,d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.printf("After swapping: a = %d; b = %d;\n",c,d);
    }
}

