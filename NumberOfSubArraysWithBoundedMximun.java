public class NumberOfSubArraysWithBoundedMximun {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int count=0;
        int start =-1, end=-1;
        for (int i=0; i<A.length; i++) {
            if (A[i]>= L && A[i] <= R) {
                end=i;
            } else if (A[i] > R) {
                start=i;
                end=i;
            }
            count+=end-start;
        }
        return count;
    }
}
