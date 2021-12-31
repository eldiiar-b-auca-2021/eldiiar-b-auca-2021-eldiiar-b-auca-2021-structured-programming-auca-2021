import java.util.Scanner;

public class URI1182 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] set = new double[12][12];
        int column = in.nextInt();
        String letter = in.next();
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                set[i][j] = in.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < set.length; i++) {
            sum += set[i][column];
        }
        double avg = sum/12;
        if (letter.equals("S")) {
            System.out.printf("%.1f\n",sum);
        } else if (letter.equals("M")) {
            System.out.printf("%.1f\n",avg);
        }
    }
}
