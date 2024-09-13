import java.text.Normalizer;
import java.util.Scanner;

public class LetterAChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma string com espaços e acentos para remover e verificar a ocorrência da letra 'a': ");
            String inputString = scanner.nextLine();

            String cleanedString = removeWhitespaceAndAccents(inputString);

            int count = countLetterA(cleanedString);

            System.out.println("String digitada: ".concat(cleanedString));
            if (count > 0) {
                System.out.printf("A letra 'a' aparece %d vezes na string.%n", count);
            } else {
                System.out.println("A letra 'a' não aparece na string.");
            }
        }
    }

    private static String removeWhitespaceAndAccents(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        String withoutAccents = normalized.replaceAll("\\p{M}", "");

        return withoutAccents;
    }

    private static int countLetterA(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
