//https://www.geeksforgeeks.org/friends-pairing-problem/
public class Pairing {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[10+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
