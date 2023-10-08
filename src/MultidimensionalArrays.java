public class MultidimensionalArrays {
    public static void main(String[] args) {
        
        int[] oneDimensionalArray = {12, 49, 922};
        System.out.println(oneDimensionalArray[1]);


        int[][] MultidimensionalArrays = {{12, 49, 922}, {10, 15, 300, 400}, {40, 80, 700},{10, 15}};
        // objArray = Arrays.asList(MultidimensionalArrays[0]).toArray(new Integer[0]);

        System.out.println(oneDimensionalArray[2]);
        System.out.println(MultidimensionalArrays[3][0]);
        System.out.println();

        
        //double[][] Arrays = new double[4][2];

        //Arrays[3][1] = 2.6;
        //System.out.println(Arrays[3][1]);
        

        for(int Arrays=0; Arrays<MultidimensionalArrays.length; Arrays++) {
            for(int item=0; item<MultidimensionalArrays[Arrays].length; item++) {
                System.out.print(MultidimensionalArrays[Arrays][item] + "\t");
            }
           System.out.println();
        }

    }
    
}
