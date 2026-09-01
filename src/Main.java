import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("--------PORTFOLIO OF ACTIVITY-----------");
        System.out.println("NAME: RESABA CHUY");
        System.out.println("SECTION AND YEAR: IT2C");
        System.out.println("------------CONTENTS--------------------");
        System.out.println("1. Activity 1");
        System.out.println("2. Activity 2");

        System.out.println("----------------------------------------");

        System.out.print("Enter Selection: ");
        int selection = input.nextInt();
        input.nextLine();

        if (selection == 1) {

            System.out.print("\nEnter name: ");
            String name = input.nextLine();

            System.out.print("Enter birth year: ");
            int birthYear = input.nextInt();

            int currentYear = 2026;
            int age = currentYear - birthYear;

            System.out.println("----------------------------------------");
            System.out.println("Greetings " + name);
            System.out.println("Your Age is: " + age);
            System.out.println("----------------------------------------");

        } else {
            System.out.println("Invalid selection.");
        }

        input.close();
    }
}