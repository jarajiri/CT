import java.util.*;

class Solution {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { // 약수  12/4
                while (n % i == 0) {
                    n /= i;
                }
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}