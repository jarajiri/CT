import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean bo = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    bo = true;
                    break;
                }
            }
            if(!bo) list.add(arr[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}