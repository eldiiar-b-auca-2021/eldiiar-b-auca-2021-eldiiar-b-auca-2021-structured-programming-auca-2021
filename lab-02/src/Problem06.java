import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double c = inp.nextInt();

        double p = (9.0 / 5) * c + 32;

        System.out.printf("%.0f Celsius is %.1f Fahrenheit\n",c,p);
    }
}

