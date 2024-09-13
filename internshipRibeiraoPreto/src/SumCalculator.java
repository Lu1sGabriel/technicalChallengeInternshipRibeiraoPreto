public class SumCalculator {

    private static final int index = 12;

    public static void main(String[] args) {
        int sum = 0;
        int k = 1;

        while (k < index) {
            k = k + 1;
            sum = sum + k;
        }

        System.out.println("O valor final da some é ".concat(Integer.toString(sum)));
    }
}
