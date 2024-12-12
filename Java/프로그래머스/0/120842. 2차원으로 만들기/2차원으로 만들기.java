import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            int[] ints = Arrays.copyOfRange(num_list, i, i + n);
            answer[index++] = ints;
        }
        return answer;
    }
}