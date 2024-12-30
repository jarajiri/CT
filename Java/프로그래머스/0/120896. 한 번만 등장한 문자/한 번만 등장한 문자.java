class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] countArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            countArr[idx]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 1) {
                int code = i + 'a';
                sb.append((char) code);
            }
        }
        return sb.toString();
    }
}