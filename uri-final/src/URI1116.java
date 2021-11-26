import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double num1;
        double num2;
        int quantityOfPairs = inp.nextInt();

        for (int i = 1; i <= quantityOfPairs; i++) {
            num1 = inp.nextInt();
            num2 = inp.nextInt();
            if (num2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n",num1 / num2);
            }
        }
    }
}
