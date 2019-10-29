import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PositionOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> positions = new ArrayList<>();
        int count = 1;
        int start,end;
        for (int i =0; i < s.length()-1; i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                count++;
                if (count==3) {
                    count =1;
                    start = i-1;
                    end = i;
                    while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                        end = i+1;
                        i++;
                    }
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    positions.add(temp);
                }
            } else {count=1;}
        }
        return positions;
    }
    public static void main(String [] a) {
        System.out.println(new PositionOfLargeGroups().largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}
