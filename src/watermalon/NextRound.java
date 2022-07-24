package watermalon;

import java.util.Scanner;

public class NextRound {
    static Scanner scanner = new Scanner(System.in);
    static int k;
    static int nrParticipants;
    static int winners = 0;
    static int scores[];

    public static void main(String[] args) {
        nrParticipants = scanner.nextInt();
        k = scanner.nextInt();
        scores = new int[nrParticipants];


        for (int i = 0; i < nrParticipants; i++) {
            int score = scanner.nextInt();
            scores[i] = score;

        }
        int threshold = scores[k - 1];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0 && scores[i] >= threshold) {
                winners++;
            }
        }
        System.out.println(winners);

    }
}
