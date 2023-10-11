public class Application {
 
    public static void main(String[] args) {

        // Access modifiers: public, protected, default (lack of access modifiers), private
        
        Factory factory1 = new Factory();
        
        factory1.design();
        factory1.build();
        factory1.java();
       //factory1.programming();

        Car car1 = new Car();
        car1.wahab();
        
        
        car1.design();
        car1.build();
        car1.java();
        car1.programming();

        
    }
}
