import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            indexMap.put(emergency[i], i);
        }

        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);

        int[] answer = new int[emergency.length];
        int rank = 1;
        for (int i = sortedEmergency.length - 1; i >= 0; i--) {
            int value = sortedEmergency[i];
            int originIndex = indexMap.get(value);
            answer[originIndex] = rank++;
        }
        return answer;
    }
}