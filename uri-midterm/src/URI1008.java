import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println("NUMBER = " + a);

        int c = inp.nextInt();

        double b = inp.nextDouble();
        double f = c * b;

        System.out.printf("SALARY = U$ %.2f\n", f);


    }
}
