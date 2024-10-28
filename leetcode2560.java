import java.util.Collections;
import java.util.HashMap;

public class leetcode2560 {
    public static void main(String[] args) {
        System.out.println(1 <= 1);
    }

    public static int minCapability(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(j-i >= 2) {
                    if(nums[j] > nums[i]) {
                        result.put(nums[j], nums[i]);
                    } else {
                        result.put(nums[i], nums[j]);
                    }
                }
            }
        }

        return Collections.min(result.keySet());
    }
}
