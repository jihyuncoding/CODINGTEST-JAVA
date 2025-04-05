class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] results = new int[num2-num1 + 1];
        int index = 0;
        
        for (int i = num1; i <= num2; i++) {            
		    results[index++] = numbers[i];      
        }    
        return results;
	    
    }
}