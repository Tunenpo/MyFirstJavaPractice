class World {

    public void shutDown() {

        System.out.println("Wahab is shutting the tech world with java");
    }
}
interface Phone {
    public void call();
}


public class Method {
    public static void main(String[] args) {

        World world1 = new World() {

          @Override
            public void shutDown() {
               System.out.println("Java is shutting down"); 
            }
        };
        world1.shutDown();

        Phone phone1 = new Phone() {
            public void call() {
                System.out.println("Java calling");
            }
        };
        phone1.call();
        
    }
}
