import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
                List<Integer> list = new ArrayList<>();
        int collatz = n;
        while(collatz != 1){
            list.add(collatz);
            collatz = cola(collatz);
        }
        list.add(1);
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;

    }
    
    public static int cola(int n) {
        return n % 2 == 0 ? n / 2 : 3 * n + 1;
    }
}