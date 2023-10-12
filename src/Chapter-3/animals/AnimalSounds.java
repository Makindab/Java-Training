class AnimalSounds {
    public static void main(String[] args) {
        // Write your code here
        var scan = new java.util.Scanner(System.in);
        scan.useLocale(java.util.Locale.ENGLISH);

        String animal;
        while (scan.hasNextLine()) {
            animal = scan.nextLine();

            switch (animal) {
                case "Dog" -> System.out.println("Woof");
                case "Cat" -> System.out.println("Meow");
                case "Sheep" -> System.out.println("Baa");
                case "Cow" -> System.out.println("Moo");
                case "Lion" -> System.out.println("Roar");
                case "Pig" -> System.out.println("Oink");
                case "Duck" -> System.out.println("Quack");
                default -> System.out.println("?");
            }
        }
        scan.close();
    }
}