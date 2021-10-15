import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double A = inp.nextDouble();
        double B = inp.nextDouble();
        double C = inp.nextDouble();

        double rt = (A * C) / 2;
        double rd = C * C * 3.14159;
        double tr = (A + B) / 2 * C;
        double sq = B * B;
        double rc = A * B;

        System.out.printf("TRIANGULO: %.3f\n",rt);
        System.out.printf("CIRCULO: %.3f\n",rd);
        System.out.printf("TRAPEZIO: %.3f\n",tr);
        System.out.printf("QUADRADO: %.3f\n",sq);
        System.out.printf("RETANGULO: %.3f\n",rc);
    }
}
