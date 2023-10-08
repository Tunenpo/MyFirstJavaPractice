public class Arrays {
    public static void main(String[] args) {
        //Primitive type 
        int numbers = 10;

        //Reference type
       // int[] numbersArrays = new int[5];
        int[] numbersArrays = {15, 20, 25, 30, 35};
        
        System.out.println(numbersArrays[0]);

        /*numbersArrays[0] = 15;
        numbersArrays[1] = 20;
        numbersArrays[2] = 25;
        numbersArrays[3] = 30;
        numbersArrays[4] = 35;
        **/

        System.out.println(numbersArrays[0]);
        System.out.println(numbersArrays[1]);
        System.out.println(numbersArrays[2]);
        System.out.println(numbersArrays[3]);
        System.out.println(numbersArrays[4]);

        for(int i=0; i<numbersArrays.length; i++) {
            System.out.println(numbersArrays[i]);
        }
    }
}
