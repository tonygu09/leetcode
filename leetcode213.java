import java.util.ArrayList;
import java.util.Arrays;

public class leetcode213 {
    public static void main(String[] args) {
        int[] test1 = {2, 3, 2};
        System.out.println(rob(test1));

        int[] test2 = {1,2,3,1};
        System.out.println(rob(test2));

        int[] test3 = {2,7,9,3,4};
        System.out.println(rob(test3));

        int[] test4 = {1, 2, 3};
        System.out.println(rob(test4));

        int[] test5 = {2, 3};
        System.out.println(rob(test5));

        int[] test6 = {0};
        System.out.println(rob(test6));
    }
    public static int rob(int[] nums) {
        if(nums.length < 2) {
            return nums[0];
        } else if (nums.length < 3) {
            return Math.max(nums[0], nums[1]);
        } else if (nums.length < 4) {
            return Math.max(nums[2], Math.max(nums[0], nums[1]));
        } else {
            int p1 = helper(Arrays.copyOfRange(nums, 0, nums.length-1));
            int p2 = helper(Arrays.copyOfRange(nums, 1, nums.length));
            return Math.max(p1, p2);
        }
    }

    public static int helper(int[] nums) {
        ArrayList<Integer> solution = new ArrayList<Integer>();
        solution.add(nums[0]);
        solution.add(Math.max(nums[0], nums[1]));

        for(int i = 2; i < nums.length; i++) {
            solution.add(Math.max(solution.get(i-1), solution.get(i-2)+nums[i]));
        }
        return solution.get(nums.length-1);
    }
}
