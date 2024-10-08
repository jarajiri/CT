class Solution {
    public int solution(String myString, String pat) {
        boolean contains = myString.toLowerCase().contains(pat.toLowerCase());
        return contains ? 1 : 0;
    }
}