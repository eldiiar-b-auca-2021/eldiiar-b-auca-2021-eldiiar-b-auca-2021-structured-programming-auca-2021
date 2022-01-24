import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            if (i % x == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
