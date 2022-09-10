package watermalon.B;

import java.util.Scanner;

public class PhoenixAndPuzzle {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int y = scanner.nextInt();

        for (int i = 0; i < y; i++) {
            int x = scanner.nextInt();
            if ((x % 2 == 0 && isSquare(x / 2)) || (x % 4 == 0) && isSquare(x / 4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    public static boolean isSquare(int x) {
        int y = (int) Math.sqrt(x);
        return y * y == x;
    }

    public static boolean mod2(int x) {
        if (x == 1) {
            return true;
        }
        if (x % 2 == 0) {
            int result = x / 2;
            if (result == 1) {
                return true;
            } else {
                return mod2(result);
            }
        } else {
            return false;
        }
    }
}
