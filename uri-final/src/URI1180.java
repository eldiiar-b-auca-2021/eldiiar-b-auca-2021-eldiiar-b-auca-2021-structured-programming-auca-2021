import java.util.Scanner;

public class URI1180 {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int n = in.nextInt();
        int[] set = new int[n];
        findSmallest(set);
    }

    private static void findSmallest(int[] set) {
        int small =0;
        int index = 0;
        for (int i = 0; i< set.length; i++) {
            set[i] = in.nextInt();
            if (i == 0) {
                small = set[i];
                index = i;
            } else if (small>set[i]) {
                small = set[i];
                index = i;
            }
        }
        System.out.println("Menor valor: " + small);
        System.out.println("Posicao: " + index);
    }
}
