import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        int guess = inp.nextInt();

            while (guess != 2002){
                System.out.println("Senha Invalida");
                guess = inp.nextInt();
            }
        System.out.println("Acesso Permitido");
        }
    }
