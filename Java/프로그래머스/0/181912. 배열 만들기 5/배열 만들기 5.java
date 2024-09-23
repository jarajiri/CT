import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (String intStr : intStrs) {
            int i = Integer.parseInt(intStr.substring(s, s + l));
            if(i > k) list.add(i);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}