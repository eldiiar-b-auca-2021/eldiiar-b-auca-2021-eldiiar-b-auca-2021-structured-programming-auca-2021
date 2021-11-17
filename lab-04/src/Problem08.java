import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        double weight = si.nextDouble();
        double firstCase = 2.5 * weight;
        double secondCase = 4.5 * weight;
        double thirdCase = 7.5 * weight;
        double fourthCase = 10.5 * weight;

        if (weight > 0 && weight <= 2) {
            System.out.printf("Cost of shipping is %.2f.\n", firstCase);
        } else if (weight > 2 && weight <= 4) {
            System.out.printf("Cost of shipping is %.2f.\n", secondCase);
        } else if (weight > 4 && weight <= 10) {
            System.out.printf("Cost of shipping is %.2f.\n", thirdCase);
        } else if (weight > 10 && weight <= 20) {
            System.out.printf("Cost of shipping is %.2f.\n", fourthCase);
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
