package watermalon.A;

import java.util.Scanner;

public class BeautifulMatrix {

    public static Scanner scanner = new Scanner(System.in);
    public static int matix[][] = new int[5][5];

    public static void main(String[] args) {

         int x = 0;
        int y = 0;

        for (int i = 0; i < matix.length; i++) {
            for (int j = 0; j < matix.length; j++) {
                matix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matix.length; i++) {
            for (int j = 0; j < matix.length; j++) {
                if (matix[i][j] == 1) {
                    y = i;
                    x = j;
                    break;
                }
            }
        }
//        System.out.println("x:" + x + " " + "y:" + y);

        int dx = Math.abs(2 - x);
        int dy = Math.abs(2 - y);
        int result = dx + dy;
        System.out.println(result);
    }
}
