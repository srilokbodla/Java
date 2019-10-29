//https://www.geeksforgeeks.org/tiling-problem/
public class TilingProblem {
    public static void main(String []args) {
        int columns = 10;
        int[] ways = new int[10];
        ways[0] = 1;
        ways[1] = 2;
        for (int i=2; i<10; i++) {
            ways[i] = ways[i-1]+ways[i-2];
        }
        System.out.println(ways[9]);
    }
}
