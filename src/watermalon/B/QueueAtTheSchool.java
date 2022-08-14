package watermalon.B;

import java.util.Scanner;

public class QueueAtTheSchool {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int nrKids = scanner.nextInt();
        int time = scanner.nextInt();
        String line = scanner.next();

        char[] queue = line.toCharArray();

        for (int i = 0; i < time; i++) {
            queue = switchSpots(queue);
            displayArray(queue);
        }
//        displayArray(queue);

    }

    public static char[] switchSpots(char[] queue) {
        char[] sortedQueue = new char[queue.length];
        for (int i = 0; i < queue.length; i++) {
            if (i < queue.length - 1) {
                char p1 = queue[i];
                char p2 = queue[i + 1];
                if (isGirl(p2) && !isGirl(p1)) {
                    sortedQueue[i] = p2;
                    sortedQueue[i + 1] = p1;
                    i++;
                } else {
                    sortedQueue[i] = p1;
                    sortedQueue[i + 1] = p2;
                }
            } else {
                sortedQueue[i] = queue[i];
            }
        }
        return sortedQueue;
    }

    public static void displayArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static boolean isGirl(char s) {
        return s == 'G';
    }
}
