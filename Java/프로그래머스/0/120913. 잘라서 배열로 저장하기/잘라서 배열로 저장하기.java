class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int) Math.ceil(my_str.length() / (double) n);
        String[] split = new String[length];
        int idx = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            if (i + n >= my_str.length()) split[idx++] = my_str.substring(i);
            else split[idx++] = my_str.substring(i, i + n);
        }
        return split;
    }
}