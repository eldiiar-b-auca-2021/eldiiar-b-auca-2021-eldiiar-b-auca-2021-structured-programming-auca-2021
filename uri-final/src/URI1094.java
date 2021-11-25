import java.util.*;

public class URI1094 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int testCaseNumber = inp.nextInt();
        int counterOfC = 0;
        int counterOfR = 0;
        int counterOfS = 0;
        int total = 0;
        for (int i = 1; i <= testCaseNumber; i++) {
            int num = inp.nextInt();
            total += num;
            String sort = inp.next();

            if (sort.equals("C")) {
                counterOfC+=num;
            } else if (sort.equals("R")) {
                counterOfR += num;
            } else if (sort.equals("S")) {
                counterOfS += num;
            }
        }

        float firstPercentage = (float) (counterOfC * 100) / total;
        float secondPercentage = (float) (counterOfR * 100) / total;
        float thirdPercentage = (float) (counterOfS * 100) / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + counterOfC);
        System.out.println("Total de ratos: " + counterOfR);
        System.out.println("Total de sapos: " + counterOfS);

        System.out.printf("Percentual de coelhos: %.2f",firstPercentage);
        System.out.println(" %");
        System.out.printf ("Percentual de ratos: %.2f",secondPercentage);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f",thirdPercentage);
        System.out.println(" %");



    }
}
