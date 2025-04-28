import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();

        int cnt = 0;
        for (char ch : arr) {
            if (ch >= '0' && ch <= '9') cnt++;
        }

        int[] result = new int[cnt];
    
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                result[idx++] = arr[i] - '0';   
            }
        } 
        
        Arrays.sort(result);
        return result;
    }
}
