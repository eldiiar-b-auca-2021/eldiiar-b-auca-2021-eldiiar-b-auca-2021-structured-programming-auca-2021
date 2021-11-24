import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numbersOfGrades = 0;
        double count = 0;
        int input = inp.nextInt();

        while (input != 0) {
            numbersOfGrades+=input;
            count++;
            input = inp.nextInt();
        }
        if (count != 0) {
        System.out.printf("The arithmetic mean %.1f\n", numbersOfGrades/count);
        } else {
            System.out.println("Nothing to calculate");
        }
}
}
