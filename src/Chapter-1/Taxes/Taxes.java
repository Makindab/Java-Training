class Taxes {
    public static void main(String[] args) {
        var income = 120000;
        var contrib = income * (8 / 100.0);
        var pension = income * (1 / 100.0);
        var allowance = 33400;
        var tax = (income-(contrib+pension+allowance))*0.06;

        System.out.println("Labour market contribution: " + contrib);
        System.out.println("Special pension savings: " + pension);
        System.out.println("Basic tax: " + tax);
    }
}
