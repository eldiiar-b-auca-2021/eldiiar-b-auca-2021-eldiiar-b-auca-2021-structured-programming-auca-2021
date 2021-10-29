import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1st number? ");
        int firstNumber = inp.nextInt();
        System.out.print("2nd number? ");
        int secondNumber = inp.nextInt();
        System.out.print("3rd number? ");
        int thirdNumber = inp.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.printf("The value %d is the greatest one.\n", firstNumber);
            }
        }

                if (secondNumber > firstNumber) {
                    if (secondNumber > thirdNumber) {
                        System.out.printf("The value %d is the greatest one.\n", secondNumber);

            }
        }
                if (thirdNumber > firstNumber) {
                    if (thirdNumber > secondNumber) {
                        System.out.printf("The value %d is the greatest one.\n", thirdNumber);
                    }
                }
    }
}
