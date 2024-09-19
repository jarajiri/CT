import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int l, int r) {
List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            int count = 0;
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (c == '5' || c == '0') {
                    count++;
                }
                if (count == charArray.length) answer.add(i);
            }
        }
        if (answer.isEmpty()) answer.add(-1);
        return answer;
    }
}