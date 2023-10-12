import java.util.Scanner;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        // Write your code here
        var s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        var x = s.nextLine();
        var len = x.length();
        var Ucase = ""; // Use a regular String to store uppercase characters

        if (len > 0) { // Check if the length is greater than 0
            for (int i = 0; i < x.length(); i++) {
                char ch = x.charAt(i);
                if (Character.isUpperCase(ch)) {
                    Ucase += ch; // Concatenate the uppercase characters
                }
            }
        }
        System.out.println("The character '" + Ucase + "' is an uppercase letter");

        s.close();
    }
}
