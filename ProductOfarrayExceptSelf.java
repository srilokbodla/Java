public class ProductOfarrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int totalWater = 0;
        int leftProduct[] = new int[nums.length];
        int result[] = new int[nums.length];
        leftProduct[0] = 1;
        for (int i =1; i<nums.length; i++) {
            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        int rightProduct = 1;
        for (int i =nums.length-1; i>=0; i--) {
            leftProduct[i] = leftProduct[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }
        for (int i =0; i<nums.length; i++){
            System.out.println(leftProduct[i]);
        }
        return leftProduct;
    }
    public static void main(String [] args) {
        int[] n = new int[] {1,2,3,4};
        System.out.println(new ProductOfarrayExceptSelf().productExceptSelf(n).toString());
    }
}
