/**
 * Made in 2021
 * Created by Joshua Galgon
 * Simple Radix sort Algorithm in Java
 */

public class RadixSort {
    /**
     * getMaxDigit - takes in an array and find the largest number. Then finds the
     * number
     * of place values in the largest digit. Returns that number
     * 
     * @returns place value of the largest digit in array
     */
    public int getMaxDigit(int[] array) {
        int maxInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxInt < array[i]) {
                maxInt = array[i];
            }
        }
        int digitCount = 0;
        while (maxInt != 0) {
            maxInt = maxInt / 10;
            digitCount++;
        }
        return digitCount;
    }

    /**
     * sor tDigit - Takes a arry and place value to be sorted by (input)
     * 
     * @returns a array of digits sorted correctly in order via the given place
     *          value
     */
    private int[] sortDigit(int[] arr, int dig) {
        int[] digits = new int[10];
        int[] temp = new int[arr.length];
        int[] startPos = new int[10];
        int exp = (int) Math.pow(10, dig);
        // find the frequency of digit value in array
        for (int i = 0; i < arr.length; i++) {
            int digitVal = (arr[i] / exp) % 10;
            digits[digitVal] += 1;
        }
        // find the index start position for each digit value
        startPos[0] = 0;
        for (int i = 1; i < startPos.length; i++) {
            startPos[i] = startPos[i - 1] + digits[i - 1];
        }
        // sort according to index start and frequency
        for (int i = 0; i < arr.length; i++) {
            // digit value
            int val = (arr[i] / exp) % 10;
            temp[startPos[val]] = arr[i];
            startPos[val] += 1;
        }
        return temp;
    }

    public int[] sort(int[] arr, int dig) {
        return sortDigit(arr, dig);
    }
}