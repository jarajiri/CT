import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] lengthArr = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            lengthArr[strArr[i].length()]++;
        }
        Arrays.sort(lengthArr);
        return lengthArr[lengthArr.length-1];
    }
}