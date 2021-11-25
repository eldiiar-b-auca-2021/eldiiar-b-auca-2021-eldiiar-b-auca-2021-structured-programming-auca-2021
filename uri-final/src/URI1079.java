import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int testCases = inp.nextInt();
        double inputFirstNum;
        double inputSecondNum;
        double inputThirdNum;
        double average = 0;

        for (int i = 1; i <= testCases; i++) {

            inputFirstNum = inp.nextDouble();
            double firstWeight = 2 * inputFirstNum;
            inputSecondNum = inp.nextDouble();
            double secondWeight = 3 * inputSecondNum;
            inputThirdNum = inp.nextDouble();
            double thirdWeight = 5 * inputThirdNum;
            average = (firstWeight + secondWeight + thirdWeight) / 10;
            System.out.printf("%.1f\n",average);
        }

    }
}
