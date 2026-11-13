import java.util.Random;
public class main{
    public static void main (String args[]) {

        Random random = new Random();

        int number1;
        int number3;
        int number2;
        
        double number;
        boolean isHeads;

        number1 = random.nextInt(1,6); // inside the method 1 to 6 is the boundary between the random is rolled, 1 and 6 are exclusive btw
        number2 = random.nextInt(0,7);
        number3 = random.nextInt(0,7);
        number = random.nextDouble(0.2,0.3);
        isHeads = random.nextBoolean();
        
        if (isHeads){
        System.out.println(number);
        System.out.print(number3);
         }
    }

}

