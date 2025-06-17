import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        while (true) {
            answer.add(n);
            if (n == 1) break;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        return answer;
    }
}
