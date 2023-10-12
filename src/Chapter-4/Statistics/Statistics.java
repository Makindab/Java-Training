class Statistics {
    public static void main(String[] args) {
        var values = parseInput();
        // Calculate Mean and Standard deviation

        double mean = Mean(values);
        double standarddeviation = StandardDeviation(values);
        System.out.println(mean + "\n" + standarddeviation);

    }

    private static double Mean(int[] values) {
        double count = 0;
        double mean = 0;
        int Vlength = values.length;

        for (int i : values) {
            count += i;
        }
        mean = count / Vlength;

        return mean;
    }

    private static double StandardDeviation(int[] values) {
        double SquaredDifferenceSum = 0;
        int Vlength = values.length;
        double mean = Mean(values);

        for (int n : values) {
            double SquaredDifference = Math.pow(n - mean, 2.0);
            SquaredDifferenceSum += SquaredDifference;
        }

        double StandardDeviation = Math.sqrt(SquaredDifferenceSum / (Vlength - 1));
        return StandardDeviation;
    }

    /**
     * Reads a line from the console and splits it into integer values.
     * 
     * @return an array of integers read from the console
     */
    private static int[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
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
}
