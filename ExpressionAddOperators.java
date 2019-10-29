public class ExpressionAddOperators {
    public int addOperators(int[] nums, int s) {
        return sum(nums, 0, s);
    }

    int sum(int[] nums, int start, int sum) {
        if (start == nums.length) {
            if (sum == 0)
                return 1;
            else
                return 0;
        }
        return sum(nums, start + 1, sum - nums[start]) + sum(nums, start + 1, sum - (nums[start] * nums[start -1]))
                + sum(nums, start + 1, sum + nums[start]);
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3 };
        System.out.println(new TargetSum().findTargetSumWays(list, 6));
    }
}
