import java.util.Scanner;

public class URI1007 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();

        int f = a * b;
        int v = c * d;
        int n = f - v;

        System.out.println("DIFERENCA = " + n);

    }
}
