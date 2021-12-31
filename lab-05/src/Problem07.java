import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sum = 0;
        int primaryNum = 0;
        while (primaryNum < 20) {
            primaryNum++;
            sum+=primaryNum;

            if (sum >= 100) {
               break;
            }
        }
        System.out.println("The number is " + primaryNum);
        System.out.println("The sum is " + sum);


    }
}
