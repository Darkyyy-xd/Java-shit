public class main{
    public static void main(String[] args) {

        //Variables - two categories of variables 
        //
        // i mean two datatypes
        // 1. Primitve      2. Reference
        //    int               string
        //    double            array
        //    float             object
        //    char
        //
        //    Primitve: Simple values stored directly in the memory (stack)
        //    Reference: Memory address (Stack) that points to the (heap)
        // 2. Steps to create a variable
        // a. Declaration
        // b. Assignment

        int burgers = 10;
        int chicken = 3;
        int total = 1230;

        String Name = "Mukesh";
        char sex = 'M';
        int age = 24;
        double wallet = 4302.12;
        boolean checking = true;

        System.out.println("Total ordered burgers: " + burgers);
        System.out.println("Number of chickens: " + chicken);
        System.out.print("The total amount of the order is: " +total+ "\n");
    
        System.out.println("The name of the customer is: " +Name);
        System.out.print("Gender: " +sex+ "\n");
        System.out.println("Age: " +age);
        System.out.print("His wallet had:" +wallet+ "\n");

        if(checking) {
            System.out.println("The boolean is true");
        }
    }
}
