import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();
        float d = inp.nextFloat();

        float result = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;

        System.out.printf("Media: %.1f%n", result);

        if (result >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (result < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (result >= 5.0 && result <= 6.9) {
            System.out.println("Aluno em exame.");

            float alt = inp.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", alt);
            float secondResult = (alt + result) / 2;

            if (secondResult >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (secondResult <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", secondResult);
        }
    }
}
