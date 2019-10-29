import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int i, r = 0, c = 0, R = n, C = n;
        int count = 1;
        //k<m && l<n
        while (r < R && c < C) {
            for (i = c; i < C; ++i) {
                spiral[r][i] = count;
                count++;
            }
            r++;
            for (i = r; i < R; ++i) {
                spiral[i][C-1] = count;
                count++;
            }
            C--;
            if (r < R) {
                for (i = C - 1; i >= c; --i) {
                    spiral[R-1][i] = count;
                    count++;
                }
                R--;
            }
            if (c < C) {
                for (i = R - 1; i >= r; --i) {
                    spiral[i][C] = count;
                    count++;
                }
                c++;
            }
        }
        return spiral;
    }
    public static void main(String[] args) {
        System.out.println(new SpiralMatrixII().generateMatrix(3).toString());
    }
}

