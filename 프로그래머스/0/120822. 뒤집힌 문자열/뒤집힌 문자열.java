class Solution {
    public String solution(String my_string) {
        
        String reserved = "";
        
        for (int i = my_string.length() -1; i>= 0; i--){
           reserved += my_string.charAt(i);
        }
       
    
        return reserved;
    
    }
}