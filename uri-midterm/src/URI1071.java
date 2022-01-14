import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int sum = 0,temp;
        if (y < x) {
            for (int i = y+1; i < x; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0) {
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}
