public class uglyNumber {

    public static void main(String []args) {
        int number = 150;
        int i1 = 0, i2=0, i5 = 0;
        int[] ugly = new int[150];
        ugly[0] = 1;
        int multipleOf2 = 2;
        int multipleOf3 = 3;
        int multipleOf5 = 5;
        int next_ugly_no =1;
        for (int i =1; i< 150; i++) {
            next_ugly_no = Math.min(multipleOf2, Math.min(multipleOf3, multipleOf5));
            ugly[i] = next_ugly_no;
            if (next_ugly_no == multipleOf2) {
                i1 = i1+ 1;
                multipleOf2 = ugly[i1]*2;
            }
            if (next_ugly_no == multipleOf3) {
                i2 = i2+ 1;
                multipleOf3 = ugly[i2]*3;
            }
            if (next_ugly_no == multipleOf5){
                i5 = i5+ 1;
                multipleOf5 = ugly[i5]*5;
            }
        }
        System.out.println(ugly[number-1]);
    }
}
