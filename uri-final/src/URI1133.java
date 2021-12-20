import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int temp;
        int x = inp.nextInt();
        int y = inp.nextInt();
        if (x > y) {
           temp = y;
           y = x;
           x = temp;
        }
        for (int i = x+1; i < y; i++ ) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
