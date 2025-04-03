class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        if(n < 10)
        {
            answer = n * 12000 + k * 2000;
        }
        else
        {
            int m = n / 10;
            answer = n * 12000 + (k-m) * 2000;
            
        }
        return answer;
        
    }
}