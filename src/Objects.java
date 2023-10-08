

public class Objects {
    public static void main(String[] args) {
        
        Methods name = new Methods();
        name.Animal = "Dog";
        name.value = 5;
        name.Run();
    }   
}
class Methods {

String Animal;
int value;

void Run() {
System.out.println("Running");
for(int i=0; i<5; i++) {
System.out.println("My " + Animal + " is " + value + " years old.");
     }
   }

}
