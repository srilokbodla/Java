import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> leftIndices = new HashMap<>();
        Map<Integer, Integer> rightIndices = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            if (!leftIndices.containsKey(nums[i])) leftIndices.put(nums[i], i);
            rightIndices.put(nums[i], i);
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i])+1);
            }else {
                count.put(nums[i], 1);
            }
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (Integer key: count.keySet()) {
            if (count.get(key) == degree) {
                ans = Math.min(ans, (rightIndices.get(key)-leftIndices.get(key))+1);
            }
        }
        return ans;
    }
}
