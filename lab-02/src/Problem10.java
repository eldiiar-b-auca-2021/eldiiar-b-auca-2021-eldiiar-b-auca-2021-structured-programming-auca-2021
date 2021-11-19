import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        double years = inp.nextDouble();

        double birthPerYear =  31536000 / 7.0;
        double deathOerYear =  31536000 / 13.0;
        double immigrantPerYear =  31536000 / 45.0;

        double finalBirth = (birthPerYear) * years;
        double finalDeath = (deathOerYear) * years;
        double finalImmigrant =  (immigrantPerYear) * years;

        double finalSumOfPopulation =  (finalBirth + finalImmigrant - finalDeath);

        double growth =  (finalSumOfPopulation + 312032486);

        System.out.printf("The population in %.0f years is %.0f\n",years,growth);



    }
}
