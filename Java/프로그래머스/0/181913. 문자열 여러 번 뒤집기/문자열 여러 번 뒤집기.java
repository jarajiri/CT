class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder SB = new StringBuilder(my_string);

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            // 쿼리 범위 내 문자열 뒤집기
            while (start < end) {
                // 두 값을 교환
                char temp = SB.charAt(start);
                SB.setCharAt(start, SB.charAt(end));
                SB.setCharAt(end, temp);
                start++;
                end--;
            }
        }

        return SB.toString();
    }
}