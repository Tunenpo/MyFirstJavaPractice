public class Casting {

    public static void main(String[] args) {
        
        byte byteValue = 3;
        short shortValue = 38;
        int intValue = 29;
        long longValue = 903242345;

        float floatValue = 923.5f;
        double doubleValue = 2341.4;

        System.out.println(Byte.MAX_VALUE);

        byteValue = (byte)longValue;
        System.out.println(intValue);

        byteValue = (byte)doubleValue;
        System.out.println(intValue);
        //String name = intValue.ToString();
        //intValue = to
    }
    
}
