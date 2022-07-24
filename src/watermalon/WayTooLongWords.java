package watermalon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WayTooLongWords {

    static Scanner scanner = new Scanner(System.in);
    static List<String> words = new ArrayList<>();
    static int n;

    public static void main(String[] args) {
        load();
        words.stream()
                .map(WayTooLongWords::abbreviate)
                .forEach(System.out::println);
    }

    public static String abbreviate(String word) {
        if (word.length() <= 10) {
            return word;
        } else {
            return abbreviationAlgo(word.toCharArray());
        }
    }

    private static String abbreviationAlgo(char[] seq) {
        StringBuilder abbreviation = new StringBuilder();
        abbreviation.append(seq[0]);
        abbreviation.append(seq.length - 2);
        abbreviation.append(seq[seq.length - 1]);
        return abbreviation.toString();
    }

    public static void load() {
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            words.add(scanner.next());
        }
    }
}
