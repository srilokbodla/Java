import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> numbers = new ArrayList<>();
        int elements = matrix.length*matrix[0].length;
        int i, r=0, c=0, R=matrix.length, C= matrix[0].length;
        //k<m && l<n
        while (r<R && c<C) {
            for (i=c; i<C; ++i) {
                numbers.add(matrix[r][i]);
            }
            r++;
            for (i=r; i<R; ++i) {
                numbers.add(matrix[i][C-1]);
            }
            C--;
            if (r<R) {
                for (i=C-1; i>=c; --i) {
                    numbers.add(matrix[R-1][i]);
                }
                R--;
            }
            if (c<C) {
                for (i=R-1; i>=r; --i) {
                    numbers.add(matrix[i][c]);
                }
                c++;
            }
        }
        return numbers;
    }
}
