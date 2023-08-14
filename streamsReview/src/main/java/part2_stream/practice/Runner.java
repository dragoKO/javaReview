package part2_stream.practice;

import java.util.Comparator;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        // 1. Find all transactions in the year 2011 and sort them by value(small to high)
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::print);
        System.out.println();

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .forEach(System.out::print);

        System.out.println();
        System.out.println("*************************************************");
        // 2. What are all the unique cities where the traders work?
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("*************************************************");
        // 3. Find all traders from Cambridge and sort them by name.
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getName()))
                .forEach(System.out::print);

        System.out.println();
        System.out.println("*************************************************");
        // 4. Return a string of all traders’ names sorted alphabetically?
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("*************************************************");
        // 5. Are any traders based in Milan?
        boolean anyInMilan = TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .anyMatch(city -> city.equals("Milan"));
        System.out.println("anyInMilan = " + anyInMilan);

        System.out.println("*************************************************");
        // 6. Print the values of all transactions from the traders living in Cambridge
        TransactionData.getAll().stream()
                .filter(Transaction->Transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);

        System.out.println("*************************************************");
        // 7. What is the highest value of all the transactions?
        Optional<Integer> max = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .max(Double::compare);
        System.out.println("max = " + max);

        System.out.println("*************************************************");
       // 8. Find the transaction with the smallest value
        Optional<Integer> min = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .min(Double::compare);
        System.out.println("min = " + min);


    }
}
