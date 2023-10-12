public class Ride implements Information{

    private String type;

    public Ride(String type) {

        this.type = type;
    }

    public void drive() {
        
        System.out.println("Java programming drives me into another world");
    }
    public void displayInformation() {

        System.out.println("The programming language that is used for enterprise is:" + type);
    }
    
}
