class Password {
    public static void main(String[] args) {
        // Write your code here
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var passcode = "";
        var passlength = 0;
        do {
            passcode = scanner.nextLine();
            passlength = passcode.length();
            if (passlength >= 5 && passlength <= 8) {
                System.out.println("Password length OK");
                break;
            } else if (passlength < 5) {
                System.out.println("Password too short");
            } else {
                System.out.println("Password too long");
            }
        } while (passlength < 5 || passlength > 8);
        scanner.close();
    }
}