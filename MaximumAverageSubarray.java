public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length<k) return 0;
        double result =Double.MIN_VALUE;
        double sum=0;
        for (int i =0; i<k; i++) {
            sum += nums[i];
        }
        result = sum/k;
        for (int i=1; i<nums.length-k+1; i++) {
            sum = sum-nums[i-1]+nums[i+k-1];
            if (result < sum/k) {
                result = sum/k;
            }
            System.out.println(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] h = new int[] {1,12,-5,-6,50,3};
        System.out.println(new MaximumAverageSubarray().findMaxAverage(h, 4));
    }
}
