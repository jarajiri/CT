import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        int idx = 0;
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && min > arr[i]) {
                    min = arr[i];
                }
            }

            answer[idx++] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;
    }
}