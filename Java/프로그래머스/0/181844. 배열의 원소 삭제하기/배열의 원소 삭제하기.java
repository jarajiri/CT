import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int i : delete_list) {
            deleteSet.add(i);
        }
        return Arrays.stream(arr)
            .filter(num->!deleteSet.contains(num))
            .toArray();
    }
    
}