class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int z = i; z<=j; z++) {
            int x = z;
            while (x != 0) {
                if (x % 10 == k) {
                    answer++;
                }
                x /= 10;
            }
        }

        return answer;
    }
}