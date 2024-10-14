import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i : arr) {
            if (!stk.isEmpty() && stk.peekLast() == i) {
                stk.removeLast();
            } else {
                stk.addLast(i);
            }
        }
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}