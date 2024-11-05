import java.util.HashMap;

public class leetcode1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
    }
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if(map.containsKey(remainder)) {
                return new int[]{i, map.get(remainder)};
            }
            map.put(nums[i], i);
        }

        return new int[]{0, 0};


        
        // for(int i = 0; i < nums.length - 1; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        // return new int[]{0, 0};
    }    
}
