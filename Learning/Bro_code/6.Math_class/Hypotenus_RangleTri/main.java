import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        // Hypotenus = Math.sqrt(a^sqr + b^sqr)
        
        System.out.println("Enter the sides of the Right-Angled triangle");
        System.out.println("Enter the perpendicular: ");
        double perpendicular = scanner.nextDouble();
        System.out.println("Enter the base: ");
        double base = scanner.nextDouble();
        
        double sqr1 = Math.pow(perpendicular,2);
        double sqr2 = Math.pow(base,2);
        double Hypotenuse = Math.sqrt(sqr1 + sqr2);
        
        System.out.println("The hypotenuse of the Right-angled triangle is: " +Hypotenuse);
        scanner.close();
        
    }
}
