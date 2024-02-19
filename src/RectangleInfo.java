import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width;
        double height;

        // Get the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for width.");
                in.next(); // Consume the invalid input
            }
            width = in.nextDouble();
        } while (width <= 0);

        // Get the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for height.");
                in.next(); // Consume the invalid input
            }
            height = in.nextDouble();
        } while (height <= 0);

        // Calculate area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Calculate the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(width * width + height * height);

        // Display results
        System.out.println("\nRectangle Information:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal length: " + diagonal);
    }
}