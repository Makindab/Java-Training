class Quadratic {
    public static void main(String[] args) {
        // write your code here
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        scanner.close();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Infinitely many roots");
        } else if (a == 0 && b == 0) {
            System.out.println("No roots");
        } else if (a == 0) {
            System.out.println(-c / b);
        } else {
            var d = b * b - 4 * a * c;
            if (d > 0) {
                System.out.print((-b + Math.sqrt(d)) / (2 * a) + " ");
                System.out.println((-b - Math.sqrt(d)) / (2 * a));
            } else if (d == 0) {
                System.out.println(-b / (2 * a));
            } else if (d < 0) {
                System.out.println("No roots");
            }
        }
    }
}