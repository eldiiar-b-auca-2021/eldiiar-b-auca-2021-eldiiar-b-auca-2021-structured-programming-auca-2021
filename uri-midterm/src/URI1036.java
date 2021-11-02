import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();


        double sqrt = Math.sqrt((b*b) -(4*a*c));


        if ((a > 0) && (sqrt > 0)) {
            double root = (-b  +sqrt) / (2*a);
            double secondRoot = (-b  -sqrt) / (2*a);
            System.out.printf("R1 = %.5f\n",root);
            System.out.printf("R2 = %.5f\n",secondRoot);
        } else {

            System.out.println("Impossivel calcular");
        }
    }
}
