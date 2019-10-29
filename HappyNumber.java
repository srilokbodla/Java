import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    static Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        if (happy(n)==1) return true;
        return false;
    }
    int happy(int n) {
        if (n==1) return 1;
        int sum = 0;
        int r=0;
        while(n>0) {
            r = n%10;
            sum += r*r;
            n=n/10;
        }
        if (seen.contains(sum)) return 2;
        seen.add(sum);
        return(happy(sum));
    }
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(2));
    }
}
