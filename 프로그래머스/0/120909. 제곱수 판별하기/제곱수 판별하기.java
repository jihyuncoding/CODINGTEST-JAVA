class Solution {
    public int solution(int n) {
        int a = 0;
        for (int i = 1; i < 1000000; i++) {
            if (n / i == i && i * i == n) {  
                a += 1;
            }
        }
        if (a == 1) {
            return 1; 
        } else {
            return 2; 
        }
    }
}
