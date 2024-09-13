import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = 1_000_000;
            int count = 0;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    count++;
                    if (arr[i] < min) min = arr[i];
                }
            }
            if (count > 0) answer.add(min);
            else answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}