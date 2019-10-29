public class cherryPick {
    public int cherryPickup(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int[][] dpup = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0] == 1 ? 1 : 0;
        for (int i = 1; i < grid[0].length; i++) {
            if (grid[0][i] == -1) {
                dp[0][i] = 0;
            } else {
                if (grid[0][i] == 1) {
                    dp[0][i]=dp[0][i-1]+1;
                    grid[0][i]--;
                }else {
                    dp[0][i] = dp[0][i-1];
                }
            }
        }
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][0] == -1) {
                dp[i][0] = 0;
            } else {
                if (grid[i][0] == 1) {
                    dp[i][0]=dp[0][i-1]+1;
                    grid[i][0]--;
                }else {
                    dp[i][0] = dp[i-1][0];
                }
            }
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (grid[i][j] == -1) {
                    dp[i][j] = 0;
                } else {
                    if (grid[i][j] == 1) {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])+1;
                        grid[i][j]--;
                    }else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        for (int i = grid.length-1; i >= 0; i--) {
            for (int j = grid[0].length; j > 0; j--) {
                if (grid[i][j] == -1) {
                    dp[i][j] = 0;
                } else {
                    if (grid[i][j] == 1) {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])+1;
                        grid[i][j]--;
                    }else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] h = new int[][] { { 0, 1, -1 }, { 1, 0, -1 }, { 1, 1, 1 } };
        System.out.println(new cherryPick().cherryPickup(h));
    }
}
