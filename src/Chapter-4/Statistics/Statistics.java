class Statistics {
    public static void main(String[] args) {
        var values = parseInput();
        // Calculate Mean and Standard deviation

        double mean = Mean(values);
        double standarddeviation = StandardDeviation(values, mean);
        System.out.println(mean + "\n" + standarddeviation);

    }

    private static double Mean(double[] values) {
        double count = 0;
        int Vlength = values.length;

        for (double i : values) {
            count += i;
        }

        return count / Vlength;
    }

    private static double StandardDeviation(double[] values, double mean) {
        double squaredDifferenceSum = 0;
        int vLength = values.length;

        for (double n : values) {
            double squaredDifference = Math.pow(n - mean, 2);
            squaredDifferenceSum += squaredDifference;
        }

        return Math.sqrt(squaredDifferenceSum / (vLength - 1));
    }

    /**
     * Reads a line from the console and splits it into integer values.
     * 
     * @return an array of integers read from the console
     */
    private static double[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var input = scanner.nextLine();
        scanner.close();

        var split = input.split(", ");
        var values = new double[split.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(split[i]);
        }
        return values;
    }
}