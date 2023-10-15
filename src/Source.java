public class Source {
    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop(250,"HP");
        Laptop laptop2 = new Laptop(10, "Dell");

        System.out.println(laptop1.equals(laptop2));

        int firstNumber = 8;
        int secondNumber = 8;

        System.out.println(firstNumber == secondNumber);

        String a = "Yes";
        String b = "Yesooo" .substring(0, 3);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    } 
    
}
