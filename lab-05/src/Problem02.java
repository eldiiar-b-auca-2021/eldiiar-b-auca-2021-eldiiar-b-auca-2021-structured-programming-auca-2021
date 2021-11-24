import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Integer? ");
        int number = inp.nextInt();
        int i = 0;
        while (number != 0) {

            i += number % 10;
            number = number / 10;
        }
        System.out.println("The sum of all digits is " + i);
    }
}
