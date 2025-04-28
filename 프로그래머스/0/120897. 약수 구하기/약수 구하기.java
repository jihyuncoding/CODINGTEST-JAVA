import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);   // 약수 모으기
        }
        return list.stream().mapToInt(Integer::intValue).toArray(); // int[]로 변환
    }
}
