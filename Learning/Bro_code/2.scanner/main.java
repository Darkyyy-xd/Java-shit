import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = scanner.nextLine(); //nextLine() reads the input with spaces is a string
        System.out.print("Enter your dog's name: ");
        String name2 = scanner.next();    // next() reads the input without spaces is a string
        
        System.out.println("Hello "+name);

        System.out.println("Aww " +name2);

        System.out.println("What's your age? ");
        int age = scanner.nextInt();    //nextInt() reads integer input

        System.out.println("Oh you are " +age + " years old");
        
        System.out.println("Enter your GPA");
        double gpa = scanner.nextDouble();
 
        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        if(isStudent) {
            System.out.println("You are enrolled as a student");

        }
        else {
            System.out.println("No you are not enrolled");
        }

        scanner.close();
    }
}
