import java.util.Arrays;


class Solution {
    public int[] solution(String myString) {
        String[] split = myString.split("x");
        int[] answer = new int[split.length];
        int idx = 0;
        for (String s : split) {
            answer[idx++] = s.length();
        }
        if(myString.charAt(myString.length()-1)=='x') {
            return Arrays.copyOf(answer,split.length+1);
        }
        return answer;
    }
}