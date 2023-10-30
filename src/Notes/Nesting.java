class Nesting {
    public static void main(String[] args) {
        var speed = 10;
        // in Java, curly brackets are optional if they only enclose a single statement
        if (!(speed < 10) && !(speed > 50)) {
            System.out.println("Your speed is OK");
        } else if (speed < 10) {
            System.out.println("You are going too slow!");
        } else {
            // If the program execution is here, then speed > 50
            System.out.println("You are going too fast!");
        }
    }
}