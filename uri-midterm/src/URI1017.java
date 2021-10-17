import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double hours = inp.nextDouble();
        double speed = inp.nextDouble();

        double sum = hours * speed;
        double s = sum / 12;

        System.out.printf("%.3f\n",s);
    }
}
