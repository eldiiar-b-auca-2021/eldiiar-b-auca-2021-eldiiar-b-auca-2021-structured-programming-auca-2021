import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int k = 0;
        for (int i = x; k < 6; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                k++;
            }
        }
    }
}
