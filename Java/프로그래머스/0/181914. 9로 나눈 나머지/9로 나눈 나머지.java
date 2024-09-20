class Solution {
    public int solution(String number) {
        char[] charArray = number.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c - 48;
        }
        return sum % 9;
    }
}