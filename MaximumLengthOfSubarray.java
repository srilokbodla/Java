import java.util.Arrays;

public class MaximumLengthOfSubarray {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length+1][B.length+1];
        for (int i=0; i<=A.length; i++) {
            for (int j=0; j<=B.length; j++) {
                dp[i][j] = 0;
            }
        }
        int max = 0;
        for (int i =1; i<=A.length; i++) {
            for (int j=1; j<=B.length; j++) {
                if (A[i-1]==B[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(max < dp[i][j]) {
                        max = dp[i][j];
                    }
                } else dp[i][j] = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1,0,0,0,1,0,0,1,0,0};
        int[] b = new int[] {0,1,1,1,0,1,1,1,0,0};
        System.out.println(new MaximumLengthOfSubarray().findLength(a,b));
    }
}
