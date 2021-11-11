import java.util.Scanner;

public class URI1050 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int input = inp.nextInt();
        int a = 61;
        int b = 71;
        int c = 11;
        int d = 21;
        int e = 32;
        int f = 19;
        int s = 27;
        int j = 31;

        if (input == a) {
            System.out.println("Brasilia");
        } else if (input == b) {
            System.out.println("Salvador");
        } else if (input == c) {
            System.out.println("Sao Paulo");
        } else if (input == d) {
            System.out.println("Rio de Janeiro");
        } else if (input == e) {
            System.out.println("Juiz de Fora");
        } else if (input == f) {
            System.out.println("Campinas");
        } else if (input == s) {
            System.out.println("Vitoria");
        } else if (input == j) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
