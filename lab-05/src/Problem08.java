public class Problem08 {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1,d = 1;

        System.out.println("               Multiplication Table ");


        System.out.print("   ");
        for (i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }
        System.out.println(" ");
        for (d = 1; d < 42;d++) {
            System.out.print("-");
        }
        System.out.println();
        for (j = 1; j <= 9; j++) {
            System.out.print(j + " | ");
            for (i = 1; i <= 9; i++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        }
    }

