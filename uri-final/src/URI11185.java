import java.util.Scanner;

public class URI11185 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String l = in.next();
        double[][] set = new double[12][12];
        int decrease = set.length;
        double sum = 0,count = 0;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < decrease; j++) {
                set[i][j] = in.nextDouble();
                if (j < set.length-i-1) {
                    sum += set[i][j];
                    count++;
                }
            }
        }
        double avg = sum/count;
        if (l.equals("S")) {
            System.out.printf("%.1f\n",sum);
        } else if (l.equals("M")) {
            System.out.printf("%.1f\n",avg);
        }
    }
}
