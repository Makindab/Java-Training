class Conversion {
    public static void main(String[] args) {
        // Write your code here
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        // scanner.nextInt();
        var n = 238577;

        var days = n / 86400;
        var hours = (n % 86400) / 3600;
        var min = (n % 3600) / 60;
        var sec = (n % 60);

        // 238577 seconds equals 2 days, 18 hours, 16 minutes and 17 seconds.
        // 238577 seconds equals 2 days, 18 hours, 16 minutes and 17 seconds.
        scanner.close();
        System.out.println(n + " seconds equals " + days + " days, " + hours + " hours, " + min + " minutes and " + sec + " seconds.");
    }
}
