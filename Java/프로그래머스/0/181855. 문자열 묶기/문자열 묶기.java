import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
            int n = s.length();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Set<Integer> set = map.keySet();
        for (int i : set) {
            answer = Math.max(answer, map.get(i));
        }
        return answer;
    }
}