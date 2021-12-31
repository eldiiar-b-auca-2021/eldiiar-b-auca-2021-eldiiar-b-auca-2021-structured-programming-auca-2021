import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int k = a-b;

        int resultOfAB = (a + b + Math.abs(k)) / 2;


        System.out.println(resultOfAB + " eh o major");
    }
}
