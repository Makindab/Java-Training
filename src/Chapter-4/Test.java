import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        var values = parseInput();
        var count = countEvenNumbers(values);
        System.out.println(count);
    }

    /**
     * Reads a line from the console and splits it into integer values.
     *
     * @return an array of integers read from the console
     */
    private static int[] parseInput() {
        var scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var input = scanner.nextLine();
        scanner.close();

        var split = input.split(", ");
        var values = new int[split.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(split[i]);
        }
        return values;
    }

    /**
     * Counts the number of even integers in an array.
     *
     * @param values an array of integers
     * @return the count of even integers
     */
    private static int countEvenNumbers(int[] values) {
        int count = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
