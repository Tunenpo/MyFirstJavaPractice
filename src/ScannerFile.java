import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        String myFile = "C:\\Users\\HP\\OneDrive\\Documents\\untitled folder\\Scanner File.txt";

        File file = new File(myFile);
       // System.out.println(file);
        Scanner text = new Scanner(file);

        int value =  text.nextInt();
        System.out.println("Value is: " + value);

        System.out.println(text.nextLine());

        while (text.hasNextLine()) {

            String line = text.nextLine();
            System.out.println(line);
        }

        text.close();
    

        
    }
    
}
