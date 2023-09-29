import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Input your value");

        int aValue = input.nextInt();

        System.out.println("Your value is: " + aValue);
    }
    
}
