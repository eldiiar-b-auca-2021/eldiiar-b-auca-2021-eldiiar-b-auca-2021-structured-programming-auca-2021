import java.util.Scanner;

public class URI1156 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double sum = 1, s = 1;

        for (double i = 3, j = 2; i <= 39; i+=2, j*=2) {
            sum += i/j;
        }
        System.out.printf("%.2f\n",sum);
    }
}
