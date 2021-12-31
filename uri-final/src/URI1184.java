import java.util.Scanner;

public class URI1184 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter = in.next();
        double[][] m = new double[12][12];
        double sum = 0, avg, count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = in.nextDouble();
                if (i>j) {
                    sum += m[i][j];
                    count++;
                }
            }
        }
        avg = sum/count;
        if (letter.equals("S")) {
            System.out.printf("%.1f\n",sum);
        } else if (letter.equals("M")) {
            System.out.printf("%.1f\n",avg);
        }
    }
}
