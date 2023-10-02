import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        
        String answer = "wahab";
        boolean dec = true;
        do {
            System.out.println("Guess the name");
             var text = input.nextLine();
             if(text.equals(answer)) {
               dec = false;
             }
             System.out.println(text);
        }

        while(dec);
            System.out.println("You guessed right!");

    
    }
    
}
