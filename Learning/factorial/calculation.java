import java.util.Scanner;

public class calculation {
    public static void main(String args[]) {
        
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check the factorial of: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= number;i++){
            fact  = fact * i;
        }

        System.out.println("The factorial of the number is " +fact);


        scanner.close();
    }
}
