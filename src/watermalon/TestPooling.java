package watermalon;

import java.util.Optional;

public class TestPooling {

    static String[] inMemoryRepo = new String[3];

    public static void main(String[] args) throws InterruptedException {

        pooling("Luxana", 3, 5000);

    }

    public static Optional<String> pooling(String name, int retryNumber, int delayPeriod) throws InterruptedException {
        Optional<String> finalStringOp = Optional.empty();
        String[] inMemoryRepo = new String[3];
        inMemoryRepo[0] = "Ana";
        inMemoryRepo[1] = "Ema";
        inMemoryRepo[2] = "Zoe";

        while (retryNumber-- != 0) {
            Optional<String> currentString = Optional.of(inMemoryRepo[retryNumber]);
            if (currentString.isPresent() && currentString.get().equalsIgnoreCase(name)) {
                finalStringOp = currentString;
                break;
            }
            System.out.println("Cannot find value for: " + name + " retryNUmber: " + retryNumber + " ");

            System.out.println("iteration: " + retryNumber);
            if (retryNumber == 0) {
                System.out.println("Final iteration has been reached: " + retryNumber);
                finalStringOp = currentString;
            }

            System.out.println("Wait: " + delayPeriod);
            Thread.sleep(delayPeriod);

        }

        System.out.println("Final String returned is: " + finalStringOp.get());
        return finalStringOp;
    }
}
