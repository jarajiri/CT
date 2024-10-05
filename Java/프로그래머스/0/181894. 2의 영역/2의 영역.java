import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == 2) {
                end = j;
                break;
            }
        }
        if (start == -1) {
            return new int[]{-1};
        } else if (start == end && start != -1) {
            return new int[]{arr[start]};
        } else {
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}