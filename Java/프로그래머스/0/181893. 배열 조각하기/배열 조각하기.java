import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {   // 짝수 인덱스
                // 뒤에서부터 제거 (인덱스 변화 방지)
                for (int j = list.size() - 1; j > query[i]; j--) {
                    list.remove(j);
                }
            } else {    // 홀수 인덱스
                // 앞에서부터 제거 (인덱스 변화 방지)
                for (int j = query[i] - 1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}