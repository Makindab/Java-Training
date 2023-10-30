public class Characters {
    public static void main(String[] args) {
        String inputString = "Hello World 123 $%#";
        StringBuilder currentGroup = new StringBuilder();
        char previousCharType = '\0';

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            char currentCharType = getCharType(currentChar);

            if (currentCharType == previousCharType || previousCharType == '\0') {
                currentGroup.append(currentChar);
            } else {
                if (currentGroup.length() > 0) {
                    System.out.println("'" + currentGroup.toString() + "' is a " + getCharType(previousCharType) + " character");
                    currentGroup.setLength(0);
                }
                currentGroup.append(currentChar);
            }
            previousCharType = currentCharType;
        }

        if (currentGroup.length() > 0) {
            System.out.println("'" + currentGroup.toString() + "' is a " + getCharType(previousCharType) + " character");
        }
    }

    // Helper method to get the character type
    private static char getCharType(char c) {
        if (Character.isUpperCase(c)) {
            return 'u'; // 'u' for uppercase
        } else if (Character.isLowerCase(c)) {
            return 'l'; // 'l' for lowercase
        } else if (Character.isDigit(c)) {
            return 'd'; // 'd' for digit
        } else {
            return 's'; // 's' for special character
        }
    }
}
