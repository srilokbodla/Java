public class HouseRobber {
    public int rob(int[] nums) {
        int[] rob = new int[nums.length+1];
        int[] yetToRob = new int[nums.length+1];

        rob[0] =0;
        yetToRob[0] =0;

        for (int i=1; i<=nums.length; i++) {
            rob[i] = Math.max(yetToRob[i-1]+nums[i], rob[i-1]);
            yetToRob[i] = Math.max(yetToRob[i-1], rob[i-1]);
        }
        return Math.max(rob[nums.length], yetToRob[nums.length]);
    }
}
