import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the width of the triangle: ");
        width = scanner.nextDouble();
        
        System.out.println("Enter the height of the triangle: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of triangle is: " +area+ " cm");

        scanner.close();
    }
}
