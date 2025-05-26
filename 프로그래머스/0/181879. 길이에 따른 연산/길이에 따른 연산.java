class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        int a =1;
        int b = 0;
        
        if(num_list.length >= 11){
            for(int i = 0; i < num_list.length; i++){
                b += num_list[i];
                result = b;
            }
        }
        else{
            for(int i = 0; i < num_list.length; i++){
                a *= num_list[i];
                result = a;
            }
        }
        
        return result;
    }
}