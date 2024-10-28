public class reverseArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};

        int[] tempArr = new int[nums.length];

        for(int i = 0; i < tempArr.length; i++) {
            tempArr[i] = nums[tempArr.length - i - 1];
            System.out.println(tempArr[i]);
        }

    }
}
