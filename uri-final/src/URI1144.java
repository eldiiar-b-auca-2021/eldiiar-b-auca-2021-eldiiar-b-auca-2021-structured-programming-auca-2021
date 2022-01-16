import java.util.Scanner;

public class URI1144 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d %d %d\n",(i),(i*i),(i*i*i));
            System.out.printf("%d %d %d\n",(i),(i*i)+1,(i*i*i)+1);
        }
    }
}
