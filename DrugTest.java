 package DrugTest;

public class DrugTest {
    public static void main(String[] args) {
        int employees = 30;
        int weeks = 52;

        System.out.println("Weekly Employee Drug Test Selections:");

        for (int week = 1; week <= weeks; week++) {
            int testedEmployee = 1 + (int) (Math.random() * employees);
            System.out.print(testedEmployee + "\t");

            // Display 4 employee numbers per line
            if (week % 4 == 0) {
                System.out.println();
            }
        }
    }
}