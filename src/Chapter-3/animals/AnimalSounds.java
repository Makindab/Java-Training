import java.util.Scanner;
import java.util.Locale;

public class AnimalSounds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        while (scan.hasNextLine()) {
            String animal = scan.nextLine();
            switch (animal) {
                case "Dog":
                    System.out.println("Woof");
                    break;
                case "Cat":
                    System.out.println("Meow");
                    break;
                case "Sheep":
                    System.out.println("Baa");
                    break;
                case "Cow":
                    System.out.println("Moo");
                    break;
                case "Lion":
                    System.out.println("Roar");
                    break;
                case "Pig":
                    System.out.println("Oink");
                    break;
                case "Duck":
                    System.out.println("Quack");
                    break;
                default:
                    System.out.println("?");
            }
        }
        scan.close();
    }
}
