package watermalon.B;

import java.util.Scanner;

public class Drinks {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int drinksPicked = scanner.nextInt();
        double[] percentages = new double[drinksPicked];

        for (int i = 0; i < drinksPicked; i++) {
            percentages[i] = scanner.nextFloat();
        }


        double sum = 0;
        for (int i = 0; i < drinksPicked; i++) {
            sum = sum + (percentages[i] / 100);
        }

        System.out.println(sum);
        double mixedPercentage = (sum * 100) / drinksPicked;

        System.out.println(mixedPercentage);
    }

}
