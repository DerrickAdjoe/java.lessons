import java.util.Scanner;
public class SunshineRentalPriceWithMethods {
    public static void main(String[] args){
    int rentalMinutes = getRentalTime();
    displayMotto();
    calculateAndDisplayRentalDetails(rentalMinutes);
}


    // Method to prompt the user for the rental time in minutes and return the value
public static int getRentalTime() {
   Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the rental time in minutes: ");
    int minutes = scanner.nextInt();
    return minutes;
}
    
    // Method to display the company motto with a border
public static void displayMotto(){
    System.out.println("*************");
    System.out.println("* Sunshine Seashore Supplies*");
    System.out.println("*************");
}

    // Method to calculate and display rental details
public static void calculateAndDisplayRentalDetails(int minutes){
    final int Hourly_Rate = 35;
    final int Travel_Rate = 12;

    int hours = minutes/ 60;
    int extraMinutes = minutes % 60;
    double totalprice = (hours * Hourly_Rate) + (extraMinutes * Travel_Rate/ 60.0);

    System.out.println("Rental Time: " + hours + "hours and " + extraMinutes + "minutes");
    System.out.println ("Total Price: $" + totalprice);
}

}
