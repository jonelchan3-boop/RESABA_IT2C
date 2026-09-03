import java.util.Scanner;

public class activity2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int format = scanner.nextInt();

        System.out.print("Enter Screening Hour (24-Hour Format, e.g., 18): ");
        int hour = scanner.nextInt();

        double basePrice = 0;
        double peakFee = 0;
        double totalCost;
        String formatName = "";

        // Select ticket format
        if (format == 1) {
            formatName = "REGULAR";
            basePrice = 350;
        }
        else if (format == 2) {
            formatName = "3D";
            basePrice = 400;
        }
        else if (format == 3) {
            formatName = "IMAX";
            basePrice = 450;
        }
        else {
            System.out.println("Invalid format selection.");
            scanner.close();
            return;
        }

        // Check if screening hour is peak hour
        if (hour >= 17 && hour <= 20) {
            peakFee = 50;
        }
        else {
            peakFee = 0;
        }

        // Calculate total
        totalCost = basePrice + peakFee;

        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + formatName);
        System.out.printf("Base Ticket Price: PHP %.2f%n", basePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", peakFee);
        System.out.println("------------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", totalCost);
        System.out.println("STATUS:            SEAT RESERVED");

        scanner.close();
    }
}