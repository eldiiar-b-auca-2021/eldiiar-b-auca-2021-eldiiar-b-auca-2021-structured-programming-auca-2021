import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double salary = inp.nextDouble();
        double first = 15;
        double second = 12;
        double third = 10;
        double fourth = 7;
        double fifth = 4;

        if (salary >= 0 && salary <= 400.00) {

            double firstResult = (salary * first) / 100;
             double secondResult = firstResult + salary;

              System.out.printf("Novo salario: %.2f \n",secondResult);
               System.out.printf("Reajuste ganho: %.2f \n",firstResult);
                System.out.println("Em percentual:" + " " + first + " " + "%");

        } else if (salary >= 400.01 && salary <= 800.00) {

             double firstResult = (salary * second) / 100;
              double secondResult = salary + firstResult;

               System.out.printf("Novo salario: %.2f \n",secondResult);
                System.out.printf("Reajuste ganho: %.2f \n",firstResult);
                 System.out.println("Em percentual:" + " " + second + "" + "%");

        } else if (salary >= 800.01 && salary <= 1200.00) {
               double firstResult = (salary * third) / 100;
                double secondResult = salary + firstResult;

                 System.out.printf("Novo salario: %.2f \n",secondResult);
                  System.out.printf("Reajuste ganho: %.2f \n",firstResult);
                   System.out.println("Em percentual:" + " " + third + " " + "%");

        } else if (salary >= 1200.01 && salary <= 2000) {
                 double firstResult = (salary * fourth) / 100;
                  double secondResult = firstResult + salary;

                   System.out.printf("Novo salario: %.2f \n",secondResult);
                    System.out.printf("Reajuste ganho: %.2f \n",firstResult);
                     System.out.println("Em percentual:" + " " + fourth + " " + "%");
        } else if (salary >= 2000.01) {
                   double firstResult = (salary * fifth) / 100;
                    double secondResult = firstResult + salary;

                      System.out.printf("Novo salario: %.2f \n",secondResult);
                       System.out.printf("Reajuste ganho: %.0f \n",firstResult);
                        System.out.println("Em percentual:" + " " + fifth + " " + "%");
        }
    }
}
