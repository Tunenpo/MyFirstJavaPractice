import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myAnswer = 0;
        do {
             System.out.println("Declare your answer");
             myAnswer = input.nextInt();
        }
        while(myAnswer != 9);

        System.out.println("You got the right answer");
        
    }
    
}
