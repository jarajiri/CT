import java.util.*;

class Solution {
public int[] solution(int[][] score) {
        int N = score.length;
        int[] sumScore = new int[N];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            sumScore[i] = score[i][0] + score[i][1];
        }

        Integer[] sortedScore = Arrays.stream(sumScore).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedScore, Comparator.reverseOrder());

        Map<Integer, Integer> rankScore = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < N; i++) {
            if (!rankScore.containsKey(sortedScore[i])) {
                rankScore.put(sortedScore[i], rank);
            }
            rank++;
        }

        for (int i = 0; i < N; i++) {
            answer[i] = rankScore.get(sumScore[i]);
        }

        return answer;
}}