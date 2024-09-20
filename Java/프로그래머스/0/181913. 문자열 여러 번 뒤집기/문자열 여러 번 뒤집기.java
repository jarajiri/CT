class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder SB = new StringBuilder(my_string);
        StringBuilder reverseSB = new StringBuilder();
        for (int[] query : queries) {
            String left = SB.substring(0, query[0]);
            String center = SB.substring(query[0], query[1] + 1);
            String right = SB.substring(query[1] + 1);
            center = reverseSB.append(center).reverse().toString();
            SB.replace(0,my_string.length(),left+center+right);
            reverseSB.replace(0,reverseSB.length(),"");
        }

        return SB.toString();
    }
}