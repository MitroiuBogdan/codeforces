package watermalon.functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Vykas {

    public static void main(String[] args) {


//        comparePredicateTest();
//        printNamesConsumer(name);
        //        printNamesConsumer(name);
        List<String> name = List.of("Ana", "Ema", "Luna");
        consumerPrintNames(name);

    }

    public static Supplier<String> getStringSupplier() {
        return () -> "name".toUpperCase();
    }

    public static void consumerPrintNames(List<String> name) {
        ConsumerInterfacePrint interfacePrint = nameList -> name.forEach(System.out::println);
        interfacePrint.executeLogicWOReturn(name);
    }

    public static void printNamesConsumer(List<String> name) {
        name.forEach(getStringConsumer()::accept);
    }


    public static Consumer<String> getStringConsumer() {
        return System.out::println;
    }

    public static void comparePredicateTest() {
        PredicateInterfaceCompare compareStringFunction = (s1, s2) -> s1.equals(s2);
        boolean result = compareStringFunction.compare("Ana", "Ema");
        System.out.println(result);
    }


    public static Predicate<Integer> getIntegerPredicate() {
        return a -> a > 0;
    }


}
