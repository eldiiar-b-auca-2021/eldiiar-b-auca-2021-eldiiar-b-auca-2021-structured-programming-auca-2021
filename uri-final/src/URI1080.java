import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i;
        int numbers;
        int max = 1;
        int theNumOfLoop = 0;
        for (i = 1; i <= 5; i++) {
            numbers = inp.nextInt();
            if (numbers > max) {
                max = numbers;
                theNumOfLoop = i;
            }
        }
        System.out.println(theNumOfLoop);
        System.out.println(max);
    }
}
