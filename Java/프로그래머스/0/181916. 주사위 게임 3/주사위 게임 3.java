import java.util.Arrays;


class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = new int[]{a, b, c, d};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        Arrays.sort(arr);
        switch (count) {
            case 6:
                return arr[0] * 1111;
            case 3: // 5556
                if (arr[0] == arr[1]) // p = arr[0] , q = arr[3]
                    return (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]);
                else return (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0]);
            case 2:
                return (arr[1] + arr[2]) * Math.abs(arr[1] - arr[2]);
            case 1: //1123 1223 1233
                if (arr[0] == arr[1])
                    return arr[2] * arr[3];
                else if (arr[1] == arr[2])
                    return arr[0] * arr[3];
                else
                    return arr[0] * arr[1];
            default:
                return arr[0];
        }
    }
}