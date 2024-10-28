public class leetcode334 {
    public static void main(String[] args) {
        System.out.println(1 < 1);
        int[] test = new int[]{1, 5, 0, 4, 1, 3};
        System.out.println(increasingTriplet(test));
    }

    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n < min) {
                min = n;
            } else if(n < mid) {
                mid = n;
            } else {
                return true;
            }
        }
        
        return false;
    }
}