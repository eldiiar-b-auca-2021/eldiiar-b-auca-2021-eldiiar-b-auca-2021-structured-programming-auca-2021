import java.util.Scanner;

public class URI1186 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String l = in.next();
        double[][] set = new double[12][12];
        double aCount = 0;
        double sum = 0;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                set[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                if (j > set.length-i-1) {
                    sum+=set[i][j];
                    aCount++;
                }
            }
        }
        double average = sum / aCount;
        if (l.equals("S")){
            System.out.printf("%.1f\n",sum);
        }
        if (l.equals("M")) {
            System.out.printf("%.1f\n",average);
        }
    }
}
