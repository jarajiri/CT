class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i)=='B') sb.append('A');
            else sb.append('B');
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}