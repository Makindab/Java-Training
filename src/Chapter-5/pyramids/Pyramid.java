class Pyramid {
    public static void main(String[] args) {
        // Write your code here
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        int n = Integer.parseInt(s.nextLine());
        s.close();

        var repeatP = 1;
        var repeatF = 2 * n - 2;
        int i = 0;

        do {
            System.out.println(".".repeat(repeatF/2) + "#".repeat(repeatP) + ".".repeat(repeatF/2));
            repeatP += 2;
            if (repeatF != 1 + (2 * (n - 1))) {
                repeatF -= 2;
            }
            i++;
        } while (i != n);
    }
}