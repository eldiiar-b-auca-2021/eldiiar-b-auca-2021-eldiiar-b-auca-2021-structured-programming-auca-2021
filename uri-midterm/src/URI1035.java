import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberA = inp.nextInt();
        int numberB = inp.nextInt();
        int numberC = inp.nextInt();
        int numberD = inp.nextInt();

        if ((numberB > numberC) && (numberD > numberA) && (numberC + numberD > numberA + numberB) && (numberC>=0) && (numberD >= 0) && (numberA>=0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}

