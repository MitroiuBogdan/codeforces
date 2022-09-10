package watermalon.B;

import java.util.*;

public class DestroysTheUniverse {

    static Scanner scanner = new Scanner(System.in);

    public static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        int iterations = scanner.nextInt();
        load(iterations);

        for (Event event : events) {
            List<Integer> localSnap = removeDuplicateZeroes(event.snap);
            int zeroesCount = countZeroes(localSnap);
            if ((zeroesCount == 1 || zeroesCount == 0) && localSnap.size() > zeroesCount) {
                System.out.println(1);
            } else {
                System.out.println(zeroesCount - 1);
            }
        }
    }

    private static List<Integer> removeDuplicateZeroes(List<Integer> snap) {
        List<Integer> tlist = new ArrayList<>();
        for (int i = 0; i < snap.size(); i++) {
            if (snap.get(i) == 0) {
                tlist.add(0);
                while (i++ < snap.size()) {
                    if (snap.size() == i) {
                        break;
                    }
                    if (snap.get(i) != 0) {
                        tlist.add(snap.get(i));
                        break;
                    }
                }
            } else {
                tlist.add(snap.get(i));
            }
        }
        return tlist;
    }

    private static int countZeroes(List<Integer> list) {
        int count = 0;
        for (int valuer : list) {
            if (valuer == 0) {
                count++;
            }
        }
        return count;
    }

    public static int mex(int[] array) {
        int upperLimit = array[array.length - 1];
        Set<Integer> completeSet = new HashSet<>();
        completeSet.add(upperLimit);
        while (upperLimit >= 0) {
            completeSet.add(upperLimit--);
        }
        List<Integer> competeList = new ArrayList<>();
        competeList.addAll(completeSet);

        int mex;
        for (int i = 0; i < competeList.size(); i++) {
            if (array[i] != competeList.get(i)) {
                mex = competeList.get(i);
                return mex;
            }
        }
        return array[array.length - 1] + 1;
    }

    public static void load(int iterations) {

        for (int i = 0; i < iterations; i++) {
            int tempIndex = scanner.nextInt();
            List<Integer> tempSnaps = new ArrayList<>();
            for (int j = 0; j < tempIndex; j++) {
                tempSnaps.add(scanner.nextInt());
            }
            events.add(new Event(tempIndex, tempSnaps));
        }
        System.out.println(events);

    }

    public static class Event {

        public int index;
        public List<Integer> snap;
        public List<Integer> zeroIndexes;


        public Event(int index, List<Integer> snap) {
            this.index = index;
            this.snap = snap;
            this.zeroIndexes = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Event{" +
                    "index=" + index +
                    ", snap=" + snap +
                    '}';
        }
    }

}
