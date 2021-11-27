import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double input;
        double num = 0;
        double average = 0;
        double incorrectNum = 0;
        for (int i = 1; i <= 4; i++) {
            input = inp.nextDouble();
            if (input <= 10 && input >= 0) {
                num += input;
                average++;
            } else {
               incorrectNum++;
            }
        }
        for (int j = 1; j <= incorrectNum; j++) {
            System.out.println("nota invalida");
        }
        System.out.printf("media = %.2f\n", num / average);
    }
}
