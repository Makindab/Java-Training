class WaterTemps {
    public static void main(String[] args) {
        var values = parseInput();
        // Write your code here
        var length = values.length;
        double max = 0;
        int drops = 0;
        for (double value : values) {
            if (max < value) {
                max = value;
            }
        }
        for (var i = 0; i < length - 1; i++) {
            if (values[i] > values[i + 1]) {
                drops++;
            }
        }
        System.out.println("Maximum water temperature: " + max);
        System.out.println("Number of temperature drops: " + drops);
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

        var split = input.split("; ");
        var values = new double[split.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(split[i]);
        }
        return values;
    }
}
