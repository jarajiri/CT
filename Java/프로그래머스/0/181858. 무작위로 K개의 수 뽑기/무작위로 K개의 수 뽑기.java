import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx = 0;  
        for (int i = 0; i < arr.length; i++) {
            boolean isDup = false;
            for (int j = 0; j < idx; j++) {
                if (arr[i] == answer[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup && idx < k) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}