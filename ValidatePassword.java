package ValidPassword;
import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            isValid = validatePassword(password);
        }
    }

    public static boolean validatePassword(String password) {
        boolean hasTwoUppercase = password.chars().filter(Character::isUpperCase).count() >= 2;
        boolean hasThreeLowercase = password.chars().filter(Character::isLowerCase).count() >= 3;
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);

        if (!hasTwoUppercase) {
            System.out.println("Password must contain at least two uppercase letters.");
            return false;
        }
        if (!hasThreeLowercase) {
            System.out.println("Password must contain at least three lowercase letters.");
            return false;
        }
        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
            return false;
        }

        System.out.println("Password is valid.");
        return true;
    }
}