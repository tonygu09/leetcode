// Given two arrays of integers, determine if the second array is a subsequence of the first one.
// The subsequence is a set of numbers that are not necessarily adjacent in the array but are in the same order as they appear in the main array
// Ex. array 1: [1, 10, 2, 20, 3, 30, 4, -1]
// Ex. array 2: [10, 3, -1]

public class ea2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 2, 20, 3, 30, 4, -1};
        int[] tar = new int[]{10, 3, -1};

        System.out.println(IsSubsequence(arr, tar));
    }

    public static boolean IsSubsequence(int[] arr, int[] target) {
        // initial
        // for(int i = 0; i < target.length; i++) {
        //     for(int j = 0; j < arr.length; j++) {
        //         if (target[i] == arr[j]) {
        //             arr = Arrays.copyOfRange(arr, j, arr.length);
        //             i++;
        //         }
        //         else if (j == arr.length - 1) {
        //             return false;
        //         }
        //     }
        // }
        // return true;

        int i = 0;
        int j = 0;

        while(i < arr.length && j < target.length) {
            if(arr[i] == target[j]) {
                j++;
            }
            i++;
        }

        return j == target.length;
    }
}
