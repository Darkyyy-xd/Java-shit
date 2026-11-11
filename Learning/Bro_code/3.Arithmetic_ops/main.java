public class main {
    public static void main(String[] args){
        int x = 10;
        int y = 6;
        int z;
        

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y;
        x = x + y;
        x += y; // Augmented assignment operator
        x *= y;
        x /=y;
        System.out.println(z);
    }
}
