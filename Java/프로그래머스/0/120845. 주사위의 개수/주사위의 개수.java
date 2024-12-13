class Solution {
    public int solution(int[] box, int n) {
        int result = 1;
        for(int i = 0; i < box.length; i++){
            int j = box[i] / n;
            result *= j;
        }
        return result;
    }
}