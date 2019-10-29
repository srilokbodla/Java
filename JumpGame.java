public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 0 && nums==null) return false;
        int n = nums.length;
        int furhestReachSorFar = 0;
        for (int i =0; i<nums.length; i++) {
            if (i>furhestReachSorFar || furhestReachSorFar >= n-1) break;
            furhestReachSorFar = Math.max(furhestReachSorFar, i+nums[i]);
        }
        return furhestReachSorFar >= n-1;
    }
}
