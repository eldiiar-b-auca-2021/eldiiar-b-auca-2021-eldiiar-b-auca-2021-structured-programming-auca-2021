import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int codeOfTheOil;
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        while (((codeOfTheOil = inp.nextInt()) != 4)) {


            if (codeOfTheOil == 1){
                alcohol++;
            } else if (codeOfTheOil == 2) {
                gasoline++;
            } else if (codeOfTheOil == 3) {
                diesel++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
