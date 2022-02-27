/**
 * Created by Joshua Galgon
 * The main method of the Radix Sort algorithm
 */

public class Practice{
    
    /**
     * Main method
     */
    public static void main(String[] args) {
        int[] arr = new int[]{3482, 2075, 4138, 2830, 3707, 6206, 6366, 8063, 8550, 2705, 1764, 3500};
        RadixSort radix = new RadixSort();

        //For each loop, arr is sorted and printed via place value. It is then printed. 
        //Loop exits when array is fully sorted via Radix algorithm
        for(int i = 0; i < radix.getMaxDigit(arr); i++){
            arr = radix.sort(arr, i);
            for(int j : arr){
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }
}