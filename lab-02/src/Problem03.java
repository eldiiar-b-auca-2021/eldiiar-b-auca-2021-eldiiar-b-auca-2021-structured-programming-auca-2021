import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int a = inp.nextInt();
        int b = a / 1000;
        a=a%1000;
        int c = a / 100;
        a=a%100;
        int d = a / 10;
        a=a%10;
        int s = a / 1;
        a=a%1;

        int sum = b + c + d + s;

        System.out.println("The sum of all digits is " + sum);
    }
}
