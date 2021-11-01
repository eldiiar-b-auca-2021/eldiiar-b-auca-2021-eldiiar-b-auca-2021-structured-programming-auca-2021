import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();

        double c = 4.00;
        double s = 4.50;
        double b = 5.00;
        double t = 2.00;
        double r = 1.50;

        if (x == 1) {
            double resF = y * c;
            System.out.printf("Total: R$ %.2f\n",resF);
        }
        if (x == 2) {
            double resS = y * s;
            System.out.printf("Total: R$ %.2f\n",resS);
        }
        if (x == 3) {
            double resT = y * b;
            System.out.printf("Total: R$ %.2f\n",resT);
        }
        if (x == 4) {
            double resF = y * t;
            System.out.printf("Total: R$ %.2f\n",resF);
        }
        if (x == 5) {
            double resSi = y * r;
            System.out.printf("Total: R$ %.2f\n",resSi);
        }
    }
}
