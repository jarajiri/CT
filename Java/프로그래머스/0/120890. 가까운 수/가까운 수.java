import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> absList = new ArrayList<>();
        for (int num : array) {
            absList.add(Math.abs(n - num));
        }
        Collections.sort(absList);
        int close = absList.get(0);
        List<Integer> answers = new ArrayList<>();
        for (int i : array) {
            if(Math.abs(n - i) == close){
                answers.add(i);
            }
        }
        Collections.sort(answers);
        return answers.get(0);
    }
}