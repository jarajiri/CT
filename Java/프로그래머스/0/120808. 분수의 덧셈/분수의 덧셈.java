class Solution {
    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1 * denom2;
        int number = number1 * denom2 + number2 * denom1;
        int max = max(denom, number);
        answer[0] = number / max;
        answer[1] = denom / max;
        return answer;
    }

    public int max(int denom, int number) {
        int max = 0;
        for (int i = 1; i <= denom && i <= number; i++) {
            if (denom % i == 0 && number % i == 0) max = i;
        }
        return max;
    }
}