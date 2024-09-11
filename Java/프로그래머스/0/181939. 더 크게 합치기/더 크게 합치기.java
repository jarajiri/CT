class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = a + "";
        String strB = b + "";
        if(Integer.parseInt(strA+strB) > Integer.parseInt(strB+strA)){
           return Integer.parseInt(strA+strB);
        }
        return Integer.parseInt(strB+strA);
    }
}