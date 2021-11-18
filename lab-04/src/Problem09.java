import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        if (a < b + c && b < c + a && c < a + b) {
            int result = a + b + c;
            System.out.println("The perimeter of triangle is: " + result);
        } else {
            System.out.println("It is not a triangle");
        }

    }
}
