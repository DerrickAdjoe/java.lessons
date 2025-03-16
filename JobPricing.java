import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {  
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Request the job name from the user
        System.out.println("Enter the name of the job:");
        String jobName = scanner.nextLine();

        // Prompt the user for the cost of materials
        System.out.println("Enter the cost of the materials:");
        double costOfMaterials = scanner.nextDouble();
        scanner.nextLine(); 

        // Retrieve the number of hours of work required from the user
        System.out.println("Enter the number of hours of work required:");
        double hoursOfWork = scanner.nextDouble();
        scanner.nextLine(); 

        // Prompt the user for the number of hours travel time
        System.out.println("Enter the number of hours travel time: ");
        double hoursOfTravel = scanner.nextDouble();
        scanner.nextLine(); 

        // Determine the estimated cost of the job
        double estimatedCost = computeEstimate(costOfMaterials, hoursOfWork, hoursOfTravel);

        // Display the job name and estimated price
        System.out.println("Job Name: " + jobName);
        System.out.println("Estimated Price: $" + estimatedCost);
    }

    // Method to compute the estimate for the job
    public static double computeEstimate(double materials, double workHours, double travelHours) {
        final double WORK_COST_PER_HOUR = 35.0;
        final double TRAVEL_COST_PER_HOUR = 12.0;

        // Calculate the total cost
        double totalCost = materials + (workHours * WORK_COST_PER_HOUR) + (travelHours * TRAVEL_COST_PER_HOUR);
        return totalCost;
    }
}
