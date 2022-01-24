import java.util.Scanner;

public class URI1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int n = in.nextInt();

        int sum=0;

        while(n <= 0){
            n = in.nextInt();
        }

        for (int i = 1;  i <= n; i++){
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}

