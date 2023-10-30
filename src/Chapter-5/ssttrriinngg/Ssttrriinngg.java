class Ssttrriinngg {
    public static void main(String[] args) {
        // Write your code here
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        int n = Integer.parseInt(s.nextLine());
        String input = s.nextLine();
        s.close();

        if (n == 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < input.length(); i++) {
                var charInput = String.valueOf(input.charAt(i));

                System.out.print(charInput.repeat(n));
            }
        }
    }
}