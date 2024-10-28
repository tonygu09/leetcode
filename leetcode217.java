import java.util.HashMap;

public class leetcode217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int nums[]) {
        HashMap <Integer, Integer> store = new HashMap<>();
        
        for(int i : nums) {
            if(!store.containsKey(i)) {
                store.put(i, 1);
            } else if(store.containsKey(i)) {
                return true;
            }
        }
        
        return false;
    }
}
