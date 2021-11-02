import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double x = inp.nextDouble();
        double y = inp.nextDouble();

        if ((x == 0.0) && (y == 0.0)) {
            System.out.println("Origem");
        }else if ((x > 0.0) && (y > 0.0)) {
            System.out.println("Q1");
        }else if ((x > 0.0) && (y < 0.0)) {
            System.out.println("Q4");
        }else if ((x < 0.0) && (y > 0.0)) {
            System.out.println("Q2");
        }else if ((x < 0.0) && (y < 0.0)) {
            System.out.println("Q3");
        }else if ((x == 0.0) && (y != 0.0)){
             System.out.println("Eixo Y");
        }else if ((y == 0.0) && (x != 0.0)) {
             System.out.println("Eixo X");
         }
    }
}
