class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        int[] remainIdxArr = new int[my_string.length()];
        for (int index : indices) {
            remainIdxArr[index] = 1;
        }
        for (int i = 0; i < my_string.length(); i++) {
            if(remainIdxArr[i]==0){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}