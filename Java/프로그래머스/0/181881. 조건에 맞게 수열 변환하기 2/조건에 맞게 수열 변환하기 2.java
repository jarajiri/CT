import java.util.Arrays;


class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int[] next = new int[arr.length];
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    next[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    next[i] = arr[i] * 2 + 1;
                } else{
                    next[i] = arr[i];
                }
            }
            if (Arrays.equals(arr, next)) {
                break;
            }
            arr = next;
            next = new int[arr.length];
            x++;
        }
        return x;
    }
}