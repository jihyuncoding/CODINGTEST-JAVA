import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] charArr = my_string.toCharArray(); 
        Arrays.sort(charArr); 
        String result = new String(charArr);
        return result;
    }
}