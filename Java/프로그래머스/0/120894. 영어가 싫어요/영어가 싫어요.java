import java.util.*;

class Solution {
    public long solution(String numbers) {
        Map<String, Integer> change = new HashMap<>();
        change.put("zero",0);
        change.put("one", 1);
        change.put("two", 2);
        change.put("three", 3);
        change.put("four", 4);
        change.put("five", 5);
        change.put("six", 6);
        change.put("seven", 7);
        change.put("eight", 8);
        change.put("nine", 9);
        String[] split = numbers.split("");
        String temp = "";
        StringBuilder answer = new StringBuilder();
        for (String s : split) {
            temp += s;
            if(change.containsKey(temp)){
                answer.append(change.get(temp));
                temp = "";
            }
        }
        return Long.parseLong(answer.toString());
    }
}