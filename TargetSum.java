import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int count = 0;
        for(int num:nums)
            count += num;
        if(nums==null || count<S ||(count+S)%2!=0)
            return 0;
        int target= (count+S)/2;
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int num:nums){
            for(int j=target;j>=num;j--){
                System.out.println("When num is "+ num+ ", j is "+ j +", dp[j] is "+ dp[j]+", dp[j-num] is "+ dp[j-num]);
                dp[j] += dp[j-num];
            }
        }
        return dp[target];
    }

    static HashMap<Integer,Integer> [] cache = null;

    int sum(int[] nums, int start, int sum) {
        if (cache[start] == null)
            cache[start] = new HashMap<>();
        else if (cache[start].containsKey(sum))
            return cache[start].get(sum);

        if (start == nums.length) {
            if (sum == 0)
                return 1;
            else
                return 0;
        }
        int output = sum(nums, start + 1, sum - nums[start]) + sum(nums, start + 1, sum + nums[start]);

        cache[start].put(sum,output);
        return output;
    }

    private int findWays(List<Integer> nums, int currentIndex, int target, Integer[][] mem) {

        if (target == 0) {
            return 1;
        }

        if (target < 0) {
            return 0;
        }

        if (currentIndex == nums.size()) {
            return 0;
        }

        //System.out.println(currentIndex);
        //System.out.println(target);
        if (mem[currentIndex][target] == null) {
            mem[currentIndex][target] = findWays(nums, currentIndex + 1, target, mem) + findWays(nums, currentIndex + 1,
                    target - nums.get(currentIndex), mem);
        }
        return mem[currentIndex][target];
    }

    public static void main(String[] args) {
        int[] list = { 1,2,3,4,5 };
        int target = 5;

        System.out.println(new TargetSum().findTargetSumWays(list, target));
    }
}
