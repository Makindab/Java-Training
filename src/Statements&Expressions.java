class StatementsAndExpressions {
    public static void main(String[] args) {
        // Variables used for if then statements and conditional expressions
        var a = 50;
        var b = 60;
        System.out.println("All results below should be give the same outcome:");

        // If Them Else Statements
        System.out.println("if-then-else statement:");
        if (a > b) {
            System.out.println("'" + a + " > " + b + "' is TRUE :-)");
        } else {
            System.out.println("'" + a + " > " + b + "' is FALSE :-(");
        }
        System.out.println();
        
        // If Then Statement
        System.out.println("if-then statement:");
        var message = "FALSE :-(";
        if (a > b) {
            message = "TRUE :-)";
        }
        System.out.println("'" + a + " > " + b + "' is " + message);
        System.out.println();

        // Conditional Expressions
        System.out.println("Conditional Expressions:");
        var message2 = (a > b) ? "TRUE :-)" : "FALSE :-(";
        System.out.println("'" + a + " > " + b + "' is " + message2);
    }
}