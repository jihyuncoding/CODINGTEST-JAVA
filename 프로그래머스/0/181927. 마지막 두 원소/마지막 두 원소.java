import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list.length;
        int[] new_list = Arrays.copyOf(num_list, a + 1);  

        if (num_list[a - 1] > num_list[a - 2]) {
            new_list[a] = num_list[a - 1] - num_list[a - 2];
        } else {
            new_list[a] = num_list[a - 1] * 2;
        }

        return new_list;
    }
}
