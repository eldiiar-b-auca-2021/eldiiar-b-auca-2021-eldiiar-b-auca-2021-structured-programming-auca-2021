import java.util.Scanner;

public class URI1154 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int age;
        int count = 0;
        int numOfAges = 0;

        while ((age = inp.nextInt()) >= 0) {
            count++;
            numOfAges+=age;
        }
        float average = (float) numOfAges / count;
        System.out.printf("%.2f\n",average);
    }
}
