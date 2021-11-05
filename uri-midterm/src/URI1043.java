import java.io.IOException;
import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            double perimeter = a + b + c;
             System.out.println("Perimetro" + " " + "=" + " " + perimeter);
        } else {
            double areOfTrapezium = a + b;
            double result = (areOfTrapezium / 2) * c;
              System.out.println("Area" + " " + "=" + " " + result);
        }
    }
}
