import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numOfRepeats = 0;
        int victoriesOfInter = 0;
        int victoriesOfGremio = 0;
        int equalities = 0;
        int num;
        do {

            int goalOfInter = inp.nextInt();
            int goalOfGremio = inp.nextInt();

            System.out.println("Novo grenal (1-sim 2-nao)");

            if (goalOfInter > goalOfGremio) {
                victoriesOfInter++;
            } else if (goalOfInter < goalOfGremio){
                victoriesOfGremio++;
            } else if (goalOfInter == goalOfGremio) {
                equalities++;
            }

            num = inp.nextInt();

            numOfRepeats++;
        } while (num == 1);

        System.out.println(numOfRepeats + "grenais");
        System.out.println("Inter:" + victoriesOfInter);
        System.out.println("Gremio:" + victoriesOfGremio);
        System.out.println("Empates:" + equalities);
        if (victoriesOfInter > victoriesOfGremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }


    }
}
