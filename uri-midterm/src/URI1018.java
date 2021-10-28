import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(a);

        int hundred = a / 100;
        a%=100;

        int fifty = a / 50;
        a%=50;

        int twenty = a / 20;
        a%=20;

        int ten = a / 10;
        a%=10;

        int five = a / 5;
        a%=5;

        int two = a / 2;
        a%=2;

        System.out.printf("%d nota(s) de R$ 100,00\n",hundred);
        System.out.printf("%d nota(s) de R$ 50,00\n",fifty);
        System.out.printf("%d nota(s) de R$ 20,00\n",twenty);
        System.out.printf("%d nota(s) de R$ 10,00\n",ten);
        System.out.printf("%d nota(s) de R$ 5,00\n",five);
        System.out.printf("%d nota(s) de R$ 2,00\n",two);
        System.out.printf("%d nota(s) de R$ 1,00\n",a);
    }
}
