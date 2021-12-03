import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
        int temp;
        int sum = 0;
        if (x > y) {
            temp = y;
            y = x;
            x = temp;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
