import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int j : arr) {
            if (stk.isEmpty()) stk.add(j);
            else if (stk.get(stk.size() - 1).equals(j)) stk.remove(stk.size() - 1);
            else stk.add(j);
        }
        if(stk.isEmpty()) return new int[]{-1};
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}