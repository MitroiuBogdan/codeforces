package watermalon;


import java.util.Scanner;

public class Watermelon {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputWeight = scanner.nextInt();
        String result = isWatermelonWeightEven(inputWeight) ? "YES" : "NO";
        System.out.println(result);
    }

    public static boolean isWatermelonWeightEven(int weight) {
        return weight % 2 == 0 && weight != 2;
    }
}
