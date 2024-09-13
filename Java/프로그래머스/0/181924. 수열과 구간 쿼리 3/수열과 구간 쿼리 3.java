class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int tmp = 0;
            tmp = arr[query[1]];
            arr[query[1]] = arr[query[0]];
            arr[query[0]] = tmp;
        }
        return arr;
    }
}