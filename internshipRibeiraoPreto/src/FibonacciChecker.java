import java.util.Scanner;

public class FibonacciChecker {

    private static final int STARTER_NUMBER = 1;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numberToCheck = scanner.nextInt();

            printFibonacciSequence(numberToCheck);

            if (isFibonacciNumber(numberToCheck)) {
                System.out.printf("O número %d pertence à sequência de Fibonacci.%n", numberToCheck);
            } else {
                System.out.printf("O número %d não pertence à sequência de Fibonacci.%n", numberToCheck);
            }
        }
    }

    private static void printFibonacciSequence(int limit) {
        int previous = STARTER_NUMBER;
        int current = STARTER_NUMBER;

        System.out.print("Sequência de Fibonacci: " + previous + " " + current + " ");

        int next = previous + current;
        while (next <= limit) {
            System.out.print(next + " ");
            previous = current;
            current = next;
            next = previous + current;
        }
        System.out.println();
    }

    private static boolean isFibonacciNumber(int number) {
        if (number == STARTER_NUMBER) {
            return true;
        }

        int previous = STARTER_NUMBER;
        int current = STARTER_NUMBER;
        int next = previous + current;

        while (next <= number) {
            if (next == number) {
                return true;
            }
            previous = current;
            current = next;
            next = previous + current;
        }

        return false;
    }

}