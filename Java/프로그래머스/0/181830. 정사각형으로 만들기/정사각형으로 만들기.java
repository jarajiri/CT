import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        if (arr[0].length == arr.length) return arr;
        if (arr[0].length < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                int[] plus = Arrays.copyOf(arr[i], arr.length - arr[i].length + arr[i].length);
                arr[i] = plus;
            }
        } else if (arr[0].length > arr.length) {
            int[][] arr2 = new int[arr[0].length - arr.length + arr.length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr2[i][j] = arr[i][j];
                }
            }
            arr = arr2;
        }
        return arr;
    }
}