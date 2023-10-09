


public class Objects {
    public static void main(String[] args) {
        
        Methods name = new Methods();
        name.Animal = "Dog";
        name.value = 5;
        name.Run();
        name.month = 8;
        name.talk("Hi, I am a Java Developer");
        int months = name.calculateMonthsToBirthday();
        name.walk(7);
        name.timer(9, 3.65);
        name.say("Wahab is the best Java Dava Developer");
        System.out.println("Months until birthday " + months);

    }  
    /**  
    void talk(String text) {
    System.out.println(text);
   }
   */
    
}
class Methods {

String Animal;
int value;
int month;
String say;

void Run() {
System.out.println("Running");
for(int i=0; i<5; i++) {
System.out.println("My " + Animal + " is " + value + " years old.");
     }
   }
   int calculateMonthsToBirthday() {
    int monthLeft = 12 - month;
    return monthLeft;

   }
    
     void talk(String text) {
    System.out.println(text);
   }
   void walk(int speed) {
    System.out.println("Walking " + speed + " km per hour ");
   }
   void timer(int minutes, double seconds) {
    System.out.println("It took " + minutes + "m and " + seconds + "s to get down the hill.");
   }
   void say(String text) {
    for(int i=0; i<4; i++) {
   System.out.println(text);
    }
   }

}
