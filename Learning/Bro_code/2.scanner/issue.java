import java.util.Scanner;

public class issue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favourite color: ");
        String color = scanner.nextLine();
    
        System.out.println("So your age is " +age+ " i see");
        System.out.println("and you like the color " +color);
    }
}
