import java.util.Scanner;

public class URI1157 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
