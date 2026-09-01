import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your section: ");
        String section = input.nextLine();

        System.out.println("\n===== PERSONALIZED GREETING =====");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your section is " + section + ".");
        System.out.println("Welcome to Java Programming!");

        input.close();
    }
}