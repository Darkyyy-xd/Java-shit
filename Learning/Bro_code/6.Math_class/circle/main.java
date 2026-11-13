import java.util.Scanner;
public class main {
    public static void main (String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        double area;
        double circumference;

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        area = Math.PI * Math.pow(radius,2);
        circumference = 2 * Math.PI * radius;

        System.out.print("The area of the circle with radius " +radius+ " " + " is "+area+ " and circumference is " +circumference);
    }
}
