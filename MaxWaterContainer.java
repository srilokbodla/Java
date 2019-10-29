public class MaxWaterContainer {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i=0; i<height.length-1; i++) {
            for (int j= i+1; j<height.length; j++) {
                if (Math.min(height[i], height[j])*(j-i) > max)
                    max = Math.min(height[i], height[j])*(j-i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] h = new int[] { 1, 1 };
        System.out.println(new MaxWaterContainer().maxArea(h));
    }
}
