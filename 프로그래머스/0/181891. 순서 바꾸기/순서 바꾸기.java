import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
      
        int[] part = Arrays.copyOfRange(num_list, n, num_list.length);
       
        int[] part1 = Arrays.copyOfRange(num_list, 0, n);
      
        return IntStream.concat(Arrays.stream(part), Arrays.stream(part1))
                        .toArray();
    }
}
