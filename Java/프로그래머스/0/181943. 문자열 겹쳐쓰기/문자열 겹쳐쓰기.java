class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String left = my_string.substring(0,s);
        String right = my_string.substring(s+overwrite_string.length());
        return left.concat(overwrite_string).concat(right);
    }
}