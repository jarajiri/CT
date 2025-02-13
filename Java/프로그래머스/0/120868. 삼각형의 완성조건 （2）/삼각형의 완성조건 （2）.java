class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sidesMax = Math.max(sides[0], sides[1]);
        int sidesMin = Math.min(sides[0], sides[1]);

        for (int i = sidesMax - sidesMin + 1; i <= sidesMax; i++) {
            answer++;
        }

        for (int i = sidesMax + 1; i < sidesMax + sidesMin; i++) {
            answer++;
        }

        return answer;
    }
}