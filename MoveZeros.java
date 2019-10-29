public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index=0;
        for (int i =0; i<nums.length; i++) {
            while (nums[i] == 0) i++;
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            index++;
        }
    }
}
