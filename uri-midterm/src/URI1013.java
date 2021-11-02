import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextInt();
        double b = inp.nextInt();
        double c = inp.nextInt();
        double k = a-b;

        double resultOfAB = (a + b + Math.abs(k)) / 2;
        double result = (resultOfAB+c+Math.abs(c-resultOfAB))/2;

        System.out.printf("%.0f eh o major\n",result);
    }
}
