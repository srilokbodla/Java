//https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
public class SubsetSum {
    static boolean valid(int set[], int length, int sum) {
        if (sum==0) {
            return true;
        }
        if (sum!=0 && length==0) {
            return false;
        }
        return valid(set, length-1, sum) || valid(set, length-1, sum-set[length-1]);
    }
    public static void main(String[] args) {
        int set[] = {3, 4, 10, 50, 9};
        int sum = 11;
        System.out.println(valid(set, set.length, sum));
    }
}
