import java.util.Scanner;

public class URI1175 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] set = new int[20];
        for (int i = 0; i < set.length; i++) {
            set[i] = in.nextInt();
        }
        reverse(set);
        for (int i = 0; i < set.length; i++) {
            System.out.printf("N[%d] = %d\n", i, set[i]);
        }
    }
    public static void reverse (int[] set) {
        int first = 0;
        int second = set.length-1;
        while (first < second) {
            int temp = set[first];
            set[first] = set[second];
            set[second] = temp;
            first++;
            second--;
        }
    }
}
