import java.util.Scanner;

public class URI1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineOfArrays = in.nextInt();
        String defineTheCalculation = in.next();
        double[][] set = new double[12][12];
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                set[i][j] = in.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < set.length; i++) {
            sum+=set[lineOfArrays][i];
        }
        double avg = sum/12;
        if (defineTheCalculation.equals("S")){
            System.out.printf("%.1f\n",sum);
        } else if (defineTheCalculation.equals("M")) {
            System.out.printf("%.1f\n",avg);
        }
    }
}
