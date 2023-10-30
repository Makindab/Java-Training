class Pyramid {
    public static void main(String[] args) {
        // Write your code here

        // Write your code here
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        int n = Integer.parseInt(s.nextLine());
        s.close();
        var frame = ".";
        var PyramidBlock = "#";
        var repeatP = 1;
        var repeatF = 2 * n - 2;
        var max = 1 + (2 * (n - 1));
        int i = 0;

        do {
            System.out.println(frame.repeat(repeatF/2) + PyramidBlock.repeat(repeatP) + frame.repeat(repeatF/2));
            repeatP += 2;
            if (repeatF != max) {
                repeatF -= 2;
            }
            i++;
        } while (i != n);
    }
}
