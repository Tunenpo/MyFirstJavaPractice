public class IfStatement {
    public static void main(String[] args) {
        int myAge = 0;
        while(true) {
            System.out.println("In the loop");

            if(myAge == 6) {
                break;
            }
            myAge++;
            System.out.println("Out of the loop");
        }
       
    }
    
}
