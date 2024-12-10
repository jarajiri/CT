class Solution {
    public static String solution(int age) {
        String[] strs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";
        while (age > 0) {
            int digit = age % 10;
            answer = strs[digit] + answer;
            age /= 10;
        }
        return answer;
    }
}