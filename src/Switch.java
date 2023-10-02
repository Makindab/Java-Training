public class Switch {
    public static void main(String[] args) {
        // Switch Statement
        var n = 15;
        switch (n) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            // default -> System.out.println("WAT!");
            // System.out.println("I don't know this number");
            // if done like this the code wont run. instead do this
            default -> {
                System.out.print("WAT! ");
                System.out.println("I don't know this number");
            }
        }
        System.out.println("This is a Switch Statement");
    }
    public static void test(String[] args) {
        // Too run code switch test to main and main to test
        // Switch Expression
        var n = 1;
        var number = switch (n) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            default -> "WAT!";
        };
        System.out.println(number);
        System.out.println("This is a Switch Expression");
    }
}