import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int n : delete_list) {
            deleteSet.add(n);
        }

        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if (!deleteSet.contains(n)) {
                list.add(n);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
    
}