import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = 0;
        int y = 0;

        while ((x = inp.nextInt()) != (y = inp.nextInt())) {
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}
