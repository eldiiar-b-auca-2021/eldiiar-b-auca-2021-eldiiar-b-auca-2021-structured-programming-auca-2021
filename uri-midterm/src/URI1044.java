import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();

        int c = b%a;
        int d = a%b;

        if (c == 0 || d == 0) {
            System.out.println("Sao Multiplos");
        } else {
             System.out.println("Nao sao Multiplos");
        }
    }
}
