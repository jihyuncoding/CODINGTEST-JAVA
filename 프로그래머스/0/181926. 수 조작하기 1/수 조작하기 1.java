class Solution {
    public int solution(int n, String control) {
        int answer = n; 
        
        for (int i = 0; i < control.length(); i++) {
            
            String a = String.valueOf(control.charAt(i));
            
            if (a.contains("w")) {
                answer += 1;
            } else if(a.contains("s")) {
                answer -= 1;
            } else if(a.contains("d")) {
                answer += 10;
            } else if(a.contains("a")) {
                answer -= 10;
            }
        }
       
        return answer;
    }
}