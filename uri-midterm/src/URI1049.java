import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String firstWord = inp.nextLine();
        String secondWord = inp.nextLine();
        String thirdWord = inp.nextLine();

        if (firstWord.equals("vertebrado") && secondWord.equals("mamifero") && thirdWord.equals("onivoro")) {
            System.out.println("homem");
        } else if (firstWord.equals("vertebrado") && secondWord.equals("mamifero") && thirdWord.equals("herbivoro")) {
            System.out.println("vaca");

        } else if (firstWord.equals("vertebrado") && secondWord.equals("ave") && thirdWord.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (firstWord.equals("vertebrado") && secondWord.equals("ave") && thirdWord.equals("onivoro")) {
            System.out.println("pomba");

        } else if (firstWord.equals("invertebrado") && secondWord.equals("inseto") && thirdWord.equals("hematofago")) {
            System.out.println("pulga");
        } else if (firstWord.equals("invertebrado") && secondWord.equals("inseto") && thirdWord.equals("herbivoro")) {
            System.out.println("lagarta");

        } else if (firstWord.equals("invertebrado") && secondWord.equals("anelideo") && thirdWord.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (firstWord.equals("invertebrado") && secondWord.equals("anelideo") && thirdWord.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
