public class Problem0207 {
    public static void main(String[] args) {

        int value = 0;
        int sum = 0;

        while (value < 20){
            value++;

            if (value == 11 || value == 10) {
                continue;

            }
            sum+=value;
        }
        System.out.println(sum);
    }
}
