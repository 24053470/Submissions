import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;

        // Get student marks from user
        System.out.print("Enter student marks (out of 100): ");
        marks = scanner.nextInt();

        // Determining the level of achievement using conditional statements
        if (marks >= 90) {
            System.out.println("Level : 7");
        } else if (marks >= 70) {
            System.out.println("Level: 6");
        } else if (marks >= 60) {
            System.out.println("Level: 5");
        } else if (marks >= 50) {
            System.out.println("Level: 4");
        } else if (marks >= 40) {
            System.out.println("Level: 3");
        } else if (marks >= 30) {
            System.out.println("Level: 2");
        } else {
            System.out.println("Fail");
        }

        System.out.print("Do you want to enter another student's marks? (y/n): ");
        char response = scanner.next().charAt(0);
        if (response == 'y' || response == 'Y') {
            System.out.println("Please wait for the next update;)");;
        } else {
            System.out.println("Goodbye!");
        }
    }
}
