public class leetcode337 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static void main(String[] args) {
        
    }

    public static int rob(TreeNode root) {
        int[] result = robHelper(root);
        return Math.max(result[0], result[1]);
    }

    public static int[] robHelper(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = robHelper(root.left);
        int[] right = robHelper(root.right);

        int withRoot = root.val + left[1] + right[1];
        //left[1] is the withoutRoot of the left side
        int withoutRoot = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); 

        return new int[]{withRoot, withoutRoot};
    }

    // Intuitive Solution
    // public static int rob(TreeNode root) {
    //     int withoutRoot = 0;
    //     int withRoot = 0;

    //     int levels = getLevel(root) + 1;
    //     int[] sum = new int[levels];

    //     calculate(root, 0, sum);

    //     for(int i = 0; i < levels; i++) {
    //         if(i%2 == 0) { 
    //             withRoot += sum[i];
    //         }

    //         if(i%2 == 1) {
    //             withoutRoot += sum[i];
    //         }
    //     }

    //     return Math.max(withoutRoot, withRoot);
    // }

    // public static int getLevel(TreeNode root) {
    //     if(root.left == null && root.right == null) {
    //         return 0;
    //     }

    //     int left = 0;
    //     if(root.left != null) {
    //         left = getLevel(root.left);
    //     }
        
    //     int right = 0;
    //     if(root.right != null) {
    //         right = getLevel(root.right);
    //     }

    //     return Math.max(left, right)+1;
    // }

    // public static void calculate(TreeNode root, int levels, int[] sum) {
    //     if (root == null) {
    //         return;
    //     }

    //     sum[levels] += root.val;

    //     calculate(root.left, levels + 1, sum);
    //     calculate(root.right, levels + 1, sum);
    // }
}



 
