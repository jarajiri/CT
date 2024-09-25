import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(i%k==0){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}