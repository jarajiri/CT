class Solution {
    public int solution(int[] array) {
            int answer = 0;
            for (int j : array) {
                int number = j;
                while (number > 0) {
                    if (number % 10 == 7) answer++;
                    number /= 10;
                }
            }
            return answer;
    }
}