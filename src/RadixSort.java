public class RadixSort{

    public int getMaxDigit(int [] array){
        int maxInt = array[0];
        for(int i = 0; i < array.length; i++){
            if(maxInt < array[i]){
                maxInt = array[i];
            }
        }
        int digitCount = 0;
        while(maxInt != 0){
            maxInt= maxInt / 10;
            digitCount++;
        }
        return digitCount;
    }

    private int[] sortDigit(int[] arr, int dig){
        int[] digits = new int[10];
        int[] temp = new int[arr.length];
        int[] startPos = new int [10];
        int exp = (int)Math.pow(10, dig);
        //find the frequency of digit value in array
        for(int i = 0; i < arr.length; i ++){
            int digitVal = (arr[i] / exp) % 10;
            digits[digitVal] += 1;
        }
        //find the index start position for each digit value
        startPos[0] = 0;
        for(int i = 1; i < startPos.length; i++){
            startPos[i] = startPos[i -1] + digits[i - 1];
        }
        //sort according to index start and frequency
        for(int i = 0; i < arr.length; i++){
            //digit value
            int val = (arr[i] / exp) %10;
            temp[startPos[val]] = arr[i];
            startPos[val] += 1;
        }
        return temp;
    }

    public int[] sort(int[] arr, int dig){
        return sortDigit(arr, dig);
    }
}