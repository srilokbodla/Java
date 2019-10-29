public class RotateArrays {
    public void rotate(int[] nums, int k) {
        int[] array = new int[nums.length];
        int j=0;
        for (int i = nums.length-k; i<nums.length; ++i) {
            array[j] = nums[i];
            j++;
        }
        for (int i=0; i<nums.length-k; ++i,++j) {
            array[j] = nums[i];
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = array[i];
        }
    }
    public static void main(String []args) {
        int[] h = new int[] {1,2};
        new RotateArrays().rotate(h,3);
        for (int i=0; i<h.length; i++){
            System.out.println(h[i]);
        }
    }
}
