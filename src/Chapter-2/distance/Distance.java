class Distance {
    public static void main(String[] args) {
        // Write your code here
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var x = scanner.nextDouble();
        var y = scanner.nextDouble();
        scanner.close();

        System.out.println("The distance is " + Math.abs(a * x - y + b) / Math.sqrt(Math.pow(a, 2) + 1));
    }
}