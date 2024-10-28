import java.util.ArrayList;

public class leetcode198 {
    public static void main(String[] args) {
        int[] test1 = {2, 3, 2};
        System.out.println(rob(test1));

        int[] test2 = {1,2,3,1};
        System.out.println(rob(test2));

        int[] test3 = {2,7,9,9,1};
        System.out.println(rob(test3));

        int[] test4 = {2, 1};
        System.out.println(rob(test4));

    }
    public static int rob(int[] nums) {
        if(nums.length < 2) {
            return nums[0];
        }

        ArrayList<Integer> solution = new ArrayList<Integer>();
        solution.add(nums[0]);
        solution.add(Math.max(nums[0], nums[1]));

        for(int i = 2; i < nums.length; i++) {
            solution.add(Math.max(solution.get(i-1), solution.get(i-2)+nums[i]));
        }
        return solution.get(nums.length-1);
    }
}