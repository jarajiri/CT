class Solution {
    public int[] solution(int n) {
        double length = Math.ceil(n/2.0);
        int[] answer = new int[(int)length];
        int index = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 2 == 1){
                answer[index++] = i;
            }
        }
        return answer;
    }
}