class Solution {
    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            int digit = age % 10;
            sb.insert(0, (char) (digit + 97));
            age /= 10;
        }
        return sb.toString();
    }
}