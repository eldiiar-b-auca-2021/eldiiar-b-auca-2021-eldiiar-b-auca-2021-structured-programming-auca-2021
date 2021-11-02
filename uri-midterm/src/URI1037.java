import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double number = inp.nextDouble();


        double a = 0.00;
        double b = 25.00;
        double c = 50.00;
        double f = 75.00;
        double j = 100.00;

        if ((number < a) || (number > j)) {
            System.out.println("Fora de intervalo");
        }
        if ((number >= a) && (number <= b)) {
            System.out.printf("Intervalo [%.0f,%.0f]\n",a,b);
        }
        if ((number > b) && (number <= c)) {
            System.out.printf("Intervalo (%.0f,%.0f]\n",b,c);
        }
        if ((number > c) && (number <= f)) {
            System.out.printf("Intervalo (%.0f,%.0f]\n",c,f);
        }
        if ((number > f) && (number <= j)) {
            System.out.printf("Intervalo (%.0f,%.0f]\n",f,j);
        }
        }
    }

