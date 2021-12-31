import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double input;
        double num = 0;
        double average = 0;

        while (average != 2) {
            input = inp.nextDouble();
            if (input >= 0 && input <= 10) {
                num += input;
                average++;
            } else  {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f\n", num / 2);
    }
}