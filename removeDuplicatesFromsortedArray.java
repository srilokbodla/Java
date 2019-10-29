public class removeDuplicatesFromsortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String []args) {
        int[] h = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(new removeDuplicatesFromsortedArray().removeDuplicates(h) + "   ");
        for (int i:h) {
            System.out.print(i+" ");
        }
    }
}
