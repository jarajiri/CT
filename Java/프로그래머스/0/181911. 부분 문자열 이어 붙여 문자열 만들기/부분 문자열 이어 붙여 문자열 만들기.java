class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int s, e = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            s = parts[i][0];
            e = parts[i][1];
            sb.append(my_strings[i], s, e+1);
        }
        return sb.toString();
    }
}