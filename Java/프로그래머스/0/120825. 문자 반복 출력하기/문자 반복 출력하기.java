class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            for (int i = 0; i < n; i++) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}