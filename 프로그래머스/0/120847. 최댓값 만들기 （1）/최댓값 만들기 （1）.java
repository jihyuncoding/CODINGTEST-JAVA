class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < max && numbers[i] > secondMax) {
                secondMax = numbers[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            secondMax = max;
        }

        return max * secondMax;
    }
}

