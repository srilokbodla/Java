import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        Set<String> available = new HashSet<>();
        for (int i =0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j]!='.') {
                    String notation = "("+board[i][j]+")";
                    if (!available.add(i+notation) || !available.add(notation+j) || !available.add(i/3+notation+j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    }
