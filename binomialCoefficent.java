public class binomialCoefficent {
    public static void main(String []args) {
        int c = 10;
        int k = 5;
        int[][] binomial = new int[c+1][k+1];
        int i,j;
        for ( i=0; i<=10; i++) {
            for ( j=0; j<=Math.min(i,k); j++) {
                if (j==0 || j==i) {
                    binomial[i][j] = 1;
                } else {
                    binomial[i][j] = binomial[i-1][j-1] + binomial[i-1][j];
                }
            }
        }
        System.out.println(binomial[10][5]);
    }
}
