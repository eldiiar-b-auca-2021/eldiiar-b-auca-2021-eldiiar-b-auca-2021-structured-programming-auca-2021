import java.util.Scanner;

public class URI1153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        System.out.println(m);
    }
}
