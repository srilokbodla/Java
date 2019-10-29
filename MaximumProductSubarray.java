public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null) return 0;
        int current_max = nums[0];
        int current_min = nums[0];
        int final_max = nums[0];
        for (int i =1; i<nums.length; i++) {
            int temp = current_max;
            current_max = Math.max(Math.max(current_max*nums[i], current_min*nums[i]), nums[i]);
            current_min = Math.min(Math.min(temp*nums[i], current_min*nums[i]), nums[i]);
            final_max = Math.max(current_max, final_max);
        }
        return final_max;
    }
    public static void main(String[] args) {
        int[] h = new int[] {2,3,-2,4};
        System.out.println(new MaximumProductSubarray().maxProduct(h));
    }
}
