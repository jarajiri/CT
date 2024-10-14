import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i] ; j++) {
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}