class Solution {
    public int solution(int[] numbers, int k) {
        int count = 1;
        int point = 0;
        while (count < k) {
            point += 2;
            point %= numbers.length;
            count++;
        }
        return numbers[point];        
    }
}