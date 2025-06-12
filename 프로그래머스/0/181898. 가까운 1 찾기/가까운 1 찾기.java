class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for(int i = arr.length - 1 ; i > idx -1 ; i--){
            if(arr[i] > 0){
                answer = i;
            }
        }
        return answer;
    }
}