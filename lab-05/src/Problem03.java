import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        int i = 1;
        int rightAnswers = 0;
        int wrongAnswers = 0;

        System.out.print("Number of tests? ");
        int numberOfTests = inp.nextInt();


        while (i <= numberOfTests) {
            int a1 = (int) ( Math.random() * (51-(-51)) - 51 );
            int b2 = (int) (Math.random() * (51 - (-51)) - 51);
                System.out.print(a1 + " + " + b2 + " = ");
                int answer = inp.nextInt();

                if (answer == a1 + b2) {
                    rightAnswers++;
                } else {
                    wrongAnswers++;
                }
                i++;
            }
        System.out.println("Number of correct answers: " + rightAnswers);
        System.out.println("Number of incorrect answers: " + wrongAnswers);
        }


    }

