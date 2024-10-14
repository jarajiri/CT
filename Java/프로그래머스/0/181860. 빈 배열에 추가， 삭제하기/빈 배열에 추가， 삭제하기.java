import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    result.add(arr[i]);
                }
            } else {
                for (int j = 1; j <= arr[i]; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}