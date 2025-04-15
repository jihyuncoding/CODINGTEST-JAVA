class Solution {
    public int solution(int n) {
        int length = (int)(Math.log10(n) + 1); 
        int a = 0;
        int b = 0;

        for (int i = 0; i < length; i++) {
            a = n % 10; 
            b += a;     
            n /= 10;     
        }

        return b;
    }
}
