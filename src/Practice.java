public class Practice{
    
    public static void main(String[] args) {
        int[] arr = new int[]{3482, 2075, 4138, 2830, 3707, 6206, 6366, 8063, 8550, 2705, 1764, 3500};
        RadixSort radix = new RadixSort();


        for(int i = 0; i < radix.getMaxDigit(arr); i++){
            arr = radix.sort(arr, i);
            for(int j : arr){
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }
}