import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int n = 1; 
        int count = 0; 
        while(n<length){
            n *= 2;
            count++;
        }
        return Arrays.copyOf(arr, n);
    }
}