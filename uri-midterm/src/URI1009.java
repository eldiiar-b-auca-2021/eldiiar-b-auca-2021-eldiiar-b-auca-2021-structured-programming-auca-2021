import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String sellerName = inp.nextLine();

        double fixedSalary = inp.nextDouble();
        double soldProducts = inp.nextDouble();
        double bonus = soldProducts * 0.15;
        double result = bonus + fixedSalary;

        System.out.printf("TOTAL = R$ %.20f\n",result);
    }
}
