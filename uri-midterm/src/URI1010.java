import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        double A = inp.nextDouble();
        double B = inp.nextDouble();
        double C = inp.nextDouble();

        double t = b*c+B*C;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", t);



    }
}
