class Solution {
    public int solution(String[] s1, String[] s2) {
        int s = 0;
        for(int i = 0; i<s1.length; i++){
            for(int a = 0; a<s2.length; a++){
                if(s1[i].equals(s2[a])){
                    s +=1; 
                }
            }
            
        }
        return s;
    }
}