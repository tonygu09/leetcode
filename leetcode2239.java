// import java.lang.Math;

public class leetcode2239 {
    public static void main(String[] args) {
        int[] nums = new int[] { -10000, -10000 };
        System.out.println(findsmallestNumber(nums));
    }

    public static int findsmallestNumber(int[] nums) {
        int smallest = nums[0];
        for (int i : nums)
            if (smallest <= 0 && i <= 0 && i > smallest)
                smallest = i;
            else if (smallest <= 0 && i >= 0 && i <= -smallest)
                smallest = i;
            else if (smallest >= 0 && i <= 0 && -i <= smallest)
                smallest = i;
            else if (smallest >= 0 && i >= 0 && i <= smallest)
                smallest = i;
        return smallest;

        // int smallest = Integer.MAX_VALUE;

        // for(int i = 0; i < nums.length; i++) {
        // if(Math.abs(smallest) == Math.abs(nums[i])) {
        // smallest = Math.max(smallest, nums[i]);
        // } else if(Math.abs(nums[i]) < Math.abs(smallest)) {
        // smallest = nums[i];
        // }
        // }

        // return smallest;
    }
}
