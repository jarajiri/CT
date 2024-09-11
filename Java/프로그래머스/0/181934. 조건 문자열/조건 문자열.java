import java.util.Map;
import java.util.function.BiFunction;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> map = Map.of(
            ">=", (a, b) -> a >= b,
            ">!", (a, b) -> a > b,
            "<=", (a, b) -> a <= b,
            "<!", (a, b) -> a < b
        );
        String key = ineq+eq;
        Boolean result = map.get(key).apply(n, m);
        return result ? 1 : 0;
    }
}