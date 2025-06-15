import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int a = 0; a < my_string.length(); a++) {
            list.add(my_string.substring(a));
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}
