public class Mainclass {

    public static void main(String[] args) {
        
        Computer computer1 = new Computer();
        computer1.start();

        Ride ride1 = new Ride("java");
        ride1.drive();

        Information info = new Computer();
        info.displayInformation();

        Information info1 = ride1;
        info1.displayInformation();
    }
    
}
