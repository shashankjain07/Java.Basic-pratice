//1 : Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.

import java.util.Arrays;
public class LargestElementinArr {
    public static void main(String[] args) {
                            // 0,1,2,3,4,5,6,7,8,9  index num.
        int arr [] = new int[]{1,2,3,4,5,6,7,8,9};

        int subArr [] = Arrays.copyOfRange(arr, 2, 7);

        System.out.println("Sub array that is index 2 to 7-1 is");
        for ( int j : subArr) {
            System.out.print(j + " ");}
        System.out.println();

        int max = subArr[0];

        for (int i = 1; i < subArr.length; i++)
            if (subArr[i] > max)
                max = subArr[i];

        System.out.println("biggest num in sub array is " + max);
    }
}

