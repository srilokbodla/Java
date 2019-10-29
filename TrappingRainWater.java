public class TrappingRainWater {
    public int trap(int[] height) {
        int totalWater = 0;
        if (height.length <= 2) return 0;
        int leftMax[] = new int[height.length+1];
        leftMax[0] = 0;
        for (int i =0; i<height.length; i++) {
            leftMax[i+1] = Math.max(leftMax[i], height[i]);
        }
        int rightHighest = 0;
        for (int i =height.length-1; i>=0; i--) {
            rightHighest = Math.max(rightHighest, height[i]);
            totalWater += Math.min(leftMax[i], rightHighest) > height[i] ? Math.min(leftMax[i], rightHighest) - height[i] :0;
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] h = new int[] { 0,1,0,2,1,0,1,3,2,1,2,1 };
        System.out.println(new TrappingRainWater().trap(h));
    }
}
