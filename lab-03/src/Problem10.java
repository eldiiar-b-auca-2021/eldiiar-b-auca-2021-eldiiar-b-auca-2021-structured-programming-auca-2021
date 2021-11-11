import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a point with two cooordinatrs: ");
        double x = inp.nextInt();
        double y = inp.nextInt();
        double result = Math.sqrt((x * x) + (y * y));

        if (result >= 0 && result <= 10) {
            System.out.printf("Point (%.1f, %.1f) is in the circle\n",x,y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle\n",x,y);
        }
    }
}
