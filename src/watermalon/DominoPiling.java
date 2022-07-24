package watermalon;

import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Math.abs;

public class DominoPiling {

    static Scanner scanner = new Scanner(System.in);
    static int pieces = 0;
    static int x;
    static int y;

    public static void main(String[] args) {
        x = scanner.nextInt();
        y = scanner.nextInt();

        reduceMatrix(x, y);
        System.out.println(pieces);

    }

    public static void reduceMatrix(int x, int y) {
        if (x == 1 || y == 1) {
            pieces = pieces + max(x, y) / 2;
            return;
        }

        if ((x * y) % 2 == 0) {
            pieces = pieces + x * y / 2;
            return;
        }

        int dx = abs(x - y);
        int dy = max(x, y) - dx;

        pieces = pieces + dy * dy / 2;

        reduceMatrix(dx, dy);

        return;
    }
}


