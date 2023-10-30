class Square2 {
    public static void main(String[] args) {
        // Write your code here
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        var n = s.nextInt();
        var createSquare = "#";
        for(var i = 1; i <= n; i++ ) {
            System.out.println(createSquare.repeat(n));
            
        }
        s.close();
    }
}
