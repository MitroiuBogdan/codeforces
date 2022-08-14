package watermalon.A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int nrSolved = 0;
    static Map<Integer, Integer> matrix = new HashMap<>();


    public static void main(String[] args) {
//        n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            matrix.put(i, 0);
//            for (int j = 0; j < 3; j++) {
//                if (scanner.nextInt() == 1) {
//                    matrix.put(i, matrix.get(i) + 1);
//                    if (matrix.get(i) == 2) {
//                        nrSolved++;
//                    }
//                }
//
//            }
//        }
//        System.out.println(nrSolved);

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int occurrence = 0;
            for (int j = 0; j < 3; j++) {
                if (scanner.nextInt() == 1) {
                    occurrence++;
                }
            }
            if (occurrence >= 2) {
                nrSolved++;
            }
        }

        System.out.println(nrSolved);
    }

}
