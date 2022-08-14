package watermalon.A;

import java.util.Scanner;

public class PetyaAndStrings {


    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String a = scanner.next();
        String b = scanner.next();

        if (a.compareToIgnoreCase(b) == 0) {
            System.out.println(0);
        }
        if (a.compareToIgnoreCase(b) > 0) {
            System.out.println(1);
        }
        if (a.compareToIgnoreCase(b) < 0) {
            System.out.println(-1);
        }


    }
}
