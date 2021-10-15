import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double birth = 4505142.86;
        double death = 2425846.15;
        double immigrant = 700800;

        double b = 5 * (312032486 + birth);
        double i = 5 * (312032486 + immigrant);
        double d = 5 * (312032486 - death);
        System.out.println(b);
        System.out.println(i);
        System.out.println(d);

                
    }
}
