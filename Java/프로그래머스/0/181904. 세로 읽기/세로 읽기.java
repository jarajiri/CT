class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] chars = new char[my_string.length() / m][m];
        for (int i = 0; i < my_string.length()/m; i++) {
            for (int j = 0; j < m; j++) {
                chars[i][j] = my_string.charAt(j+m*i);
            }
        }
        for (char[] aChar : chars) {
            answer += aChar[c-1];
        }
        return answer;
    }
}