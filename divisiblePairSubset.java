//https://www.geeksforgeeks.org/largest-divisible-pairs-subset/
public class divisiblePairSubset {
    public static void main(String[] args) {
        int number[] = {1,3,6,13,17,18};
        int dp[] = new int[number.length];
        //int temp = 0;
        //dp[0] = 1;
        for (int i=0;i<number.length; i++) {
            dp[i] = 0;
            int temp = i+1;
            for (int j=i+1; j<number.length; j++) {
                System.out.println(number[j]%number[j-1]);
                if (number[j]%number[temp-1] == 0) {
                    dp[j] = dp[j-1] + 1;
                    temp++;
                } else {
                    dp[j] = dp[j-1];
                }
            }
            System.out.println(dp[number.length-1]);
        }
    }
}
