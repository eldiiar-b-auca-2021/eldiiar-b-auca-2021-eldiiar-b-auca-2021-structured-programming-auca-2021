import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x,j = 0,average,sumOfInput = 0,y;
           do {
               x = inp.nextDouble();
               if (x >= 0 && x <= 10) {
                   j++;
                   sumOfInput+=x;
               }
               else {
                   System.out.println("nota valida");
               }

           } while (j != 2);
           average = sumOfInput / 2.0;
           System.out.printf("media = %.2f%n",average);
           System.out.println("novo calculo (1-sim 2-nao)");
           y = inp.nextDouble();

        }
            }



