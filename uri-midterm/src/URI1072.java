import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0, sumIn = 0, sumO = 0;
        while (i < n){
            int x = in.nextInt();
            if (x >= 10 && x <= 20) {
                sumIn++;
            } else {
                sumO++;
            }
            i++;
        }
        System.out.println(sumIn + " in");
        System.out.println(sumO + " out");
    }
}
