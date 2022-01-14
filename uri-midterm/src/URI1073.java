import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i <= x; i++){
            if (i % 2 == 0){
                System.out.printf("%d^%d = %d\n",i,2,(i*i));
            }
        }
    }
}
