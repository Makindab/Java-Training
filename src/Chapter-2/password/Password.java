class Password {
    public static void main(String[] args) {
        // Write your code here
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var passcode = scanner.nextLine();
        scanner.close();
        var passlength = passcode.length();

        if (passlength >= 5 && passlength <= 8) {
            System.out.println("Password length OK");
        } else if(passlength < 5) {
            System.out.println("Password too short");
        } else if(passlength > 8) {
            System.out.println("Password too long");
        }
    }
}