class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int a = 0;
        int b = 1;
        
        for (int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][a], parts[i][b] + 1);
        }
        return answer;
    }
}
