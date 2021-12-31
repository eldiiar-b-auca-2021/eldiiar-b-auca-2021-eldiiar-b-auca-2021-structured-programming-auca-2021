import java.util.Scanner;

public class URI1183 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] set = new double[12][12];
        double sum = 0, avg,count = 0;
        String letter = in.next();
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                set[i][j] = in.nextDouble();
                if (i<j) {
                    sum += set[i][j];
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
