class LogicalOperators {
    public static void main(String[] args) {
        var speed = 10;

        // Using the logical operator &&(and)
        // Tests if speed is withing the limit
        if ((speed >= 10) && (speed <= 50)) {
            System.out.println("Your speed is OK");
        } else {
            System.out.println("Your speed is outside the range 10-50!");
        }

        // Using the logical operator ||(or)
        // Tests if speed is outside of the limit
        if ((speed < 10) || (speed > 50)) {
            System.out.println("Your speed is OK");
        } else {
            System.out.println("Your speed is outside the range 10-50!");
        }

        // Using the logical operator !(not)
        // Tests if speed is withing the limit
        if (!(speed < 10) && !(speed > 50)) {
            System.out.println("Your speed is OK");
        } else {
            System.out.println("Your speed is outside the range 10-50!");
        }
    }
}