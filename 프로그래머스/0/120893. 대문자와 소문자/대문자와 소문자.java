class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string.length());
        for (char ch : my_string.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}
