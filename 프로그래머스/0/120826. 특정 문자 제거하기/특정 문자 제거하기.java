class Solution {
    public String solution(String my_string, String letter) {
        String newLetter = my_string.replace(letter, "");
        return newLetter;
    }
}