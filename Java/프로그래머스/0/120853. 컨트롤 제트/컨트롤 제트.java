import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(String s) {
        Deque<String> stack = new ArrayDeque<>();
        String[] split = s.split(" ");
        for (String string : split) {
            if(string.equals("Z")){
                stack.pop();
                continue;
            }
            stack.push(string);
        }
        int sum = 0;
        for (String string : stack) {
            int i = Integer.parseInt(string);
            sum += i;
        }
        return sum;
    }
}