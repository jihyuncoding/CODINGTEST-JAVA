class Solution {
    public int[] solution(int n, int[] numlist) {

        int count = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }

        int[] results = new int[count];
        int index = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                results[index++] = numlist[i];
            }
        }

        return results;
    }
}
