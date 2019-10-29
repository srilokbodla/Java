public class maxsubArraySum {
    public int maxSubArray(int[] nums) {
        if(nums == null) return 0;
        int current_max = nums[0];
        int max = nums[0];
        for (int i =1; i<nums.length; i++) {
            current_max = Math.max(nums[i], current_max+nums[i]);
            max = Math.max(current_max, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] h = new int[] {1,2,-1,-2,2,1,-2,1,4,-5,4};
        System.out.println(new maxsubArraySum().maxSubArray(h));
    }
}
