public class Home {
    public static void main(String[] args) {
        System.out.println(true ? "true" : "false");

        int number = 250 ;

        number =  number > 20 ? number : 20;
        System.out.println(number);

        int[] numbers = {45, 43, 57, 84, 10};
        int lowestNumber = Integer.MAX_VALUE;
        for(int currentNumber : numbers) {

            lowestNumber = currentNumber < lowestNumber ? currentNumber : lowestNumber;
        }
        System.out.println(lowestNumber);
    }
}