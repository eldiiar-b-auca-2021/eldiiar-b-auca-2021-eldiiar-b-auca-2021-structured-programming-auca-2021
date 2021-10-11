import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String sellerName = inp.nextLine();

        System.out.println(sellerName);

        double a = inp.nextDouble();
        double b = inp.nextDouble();

        double c = b * 15;
        double f = c / 100;
        double g = f + a;

        System.out.printf("TOTAL = R$ %.2f\n", g);
    }
}
