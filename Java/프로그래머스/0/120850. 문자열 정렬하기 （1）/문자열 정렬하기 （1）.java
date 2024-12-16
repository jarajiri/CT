import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String removed = my_string.replaceAll("[A-Za-z]", "");
        int[] numbers = Arrays.stream(removed.split(""))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        Arrays.sort(numbers);
        return numbers;
    }
}