import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = 1; i <= y; i+=x) {
            System.out.printf("%d %d %d\n",i,(i+1),(i+2));
        }
    }
}
