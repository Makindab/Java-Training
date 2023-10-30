class Triangles {
    public static void main(String[] args) {
        // Write your code here
        var s = new java.util.Scanner(System.in);
        s.useLocale(java.util.Locale.ENGLISH);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        var RadiansA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        var RadiansB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        var RadiansC = Math.acos((a * a + b * b - c * c) / (2 * a * b));


        var A = RadiansA * (180 / Math.PI);
        var B = RadiansB * (180 / Math.PI);
        var C = RadiansC * (180 / Math.PI);

        if (A == 180 || B == 180 || C == 180) {
            System.out.println("Degenerate");
        } else if (A > 90 || B > 90 || C > 90) {
            System.out.println("Obtuse");
        } else if (A < 90 && B < 90 && C < 90) {
            System.out.println("Acute");
        } else if (A == 90 || B == 90 || C == 90) {
            System.out.println("Right");
    }
}
}