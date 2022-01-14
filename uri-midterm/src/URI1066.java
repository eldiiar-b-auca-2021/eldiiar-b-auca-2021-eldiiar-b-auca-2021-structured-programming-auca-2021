import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumOdd = 0, sumEven = 0, negatives = 0, positives = 0;
        for (int i = 0; i < 5; i++) {
            int x = in.nextInt();
            if (x < 0) {
                negatives++;
            } else if (x > 0) {
                positives++;
            }
            if (x % 2 != 0) {
                sumOdd++;
            } else {
                sumEven++;
            }
        }
        System.out.println(sumEven+" valor(es) par(es)");
        System.out.println(sumOdd+" valor(es) impar(es)");
        System.out.println(positives+" valor(es) positivo(s)");
        System.out.println(negatives+" valor(es) negativo(s)");
    }
}
