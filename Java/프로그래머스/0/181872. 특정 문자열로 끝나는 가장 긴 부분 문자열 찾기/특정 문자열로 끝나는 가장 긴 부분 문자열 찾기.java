class Solution {
    public String solution(String myString, String pat) {
        int i = myString.lastIndexOf(pat);
        String substring = myString.substring(0, i+pat.length());
        return substring;
    }
}